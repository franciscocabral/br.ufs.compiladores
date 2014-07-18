/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import expression.parser.*;
import expression.lexer.*;
import expression.node.*;
import expression.parser.ParserException;

import java.io.*;

import java.io.FileReader;
import java.io.PushbackReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {

    static final boolean TEST = false;

    public static void main(String arguments[]) {
        //Entrada por argumentos
        String fileDir = "";
        if (TEST) {
            fileDir = "C:\\Users\\ygormax\\git\\portugol-compiler\\PortugolCompiler\\src\\Teste\\Work\\teste1.pgl";
        } else {
            if (arguments.length < 1) {
                System.out.println("File:");
                Scanner input = new Scanner(System.in);
                fileDir = input.nextLine();
            } else {
                fileDir = arguments[0];
            }

        }
        try {
            FileReader infile = new FileReader(fileDir);

            myLexer l = new myLexer(new PushbackReader(new BufferedReader(infile), 1024));

            Token now = null;

//            do {
//                    now = l.next();
//                    if (now instanceof TBranco) {
//                        System.out.print(now.getText());
//                    } else if (now instanceof TComentarioLinha) {
//                        System.out.println(now.getClass().getSimpleName());
//                    } else {
//                        System.out.print(now.getClass().getSimpleName() + " ");
//                    }
//            } while (!(now instanceof EOF));
            
            Parser p = new Parser(l);
            Start tree = p.parse();
            Emitter emitter = new Emitter();
            tree.apply(emitter);
            
        } catch (LexerException le) {
            System.out.println("\n" + le.getMessage());
        } catch (ParserException pe){
            System.out.println("\n" + pe.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("\n" + e.getMessage());
        }
    }
}
