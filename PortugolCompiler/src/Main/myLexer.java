/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import expression.lexer.Lexer;
import expression.lexer.Lexer.State;
import expression.lexer.LexerException;
import expression.node.*;
import java.io.PushbackReader;

/**
 *
 * @author Francisco
 */
public class myLexer extends Lexer {

    private int contador;
    private TComentario comentario;
    private TComentarioLinha comentarioL;
    private StringBuffer text;

    public myLexer(PushbackReader in) {
        super(in);
    }

    protected void filter() throws LexerException {

        if (state.equals(State.COMENTARIO)) {
            //primeira abertura
            if (comentario == null) {
                comentario = (TComentario) token;
                text = new StringBuffer(comentario.getText());
                contador = 1;
                token = null;
            } else { 
                text.append(token.getText());
                if (token instanceof TComentario) {
                    contador++;
                } else if (token instanceof TComentarioFinal) {
                    contador--;
                } else if (token instanceof EOF){
                    throw new LexerException(
                            new InvalidToken(text.substring(0, 1), comentario.getLine(), comentario.getPos()),
                            "[" + (comentario.getLine()) + "," + (comentario.getPos()) + "]" +
                            " Unknown token: " + text);
                }
                
                if (contador != 0) {
                    token = null; // continue to scan the input.
                } else {
                    comentario.setText(text.toString());
                    token = comentario; //return a comment with the full text.
                    state = State.NORMAL; //go back to normal.
                    comentario = null; // We release this reference.
                }
            }
        }
    }
}
