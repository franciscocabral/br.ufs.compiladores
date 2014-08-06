/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste.Work.Sintatico;

import expression.parser.*;
import expression.lexer.*;
import expression.node.*;
import expression.parser.ParserException;

import java.io.*;
import java.util.*;

import Main.myLexer;

public class Main {

    public static void main(String arguments[]) {
        //Entrada por argumentos
        String fileDir = "";

        if (arguments.length < 1 ) {
            System.out.println("File:");
            Scanner input = new Scanner(System.in);
            fileDir = input.nextLine();
        } else {
            fileDir = arguments[0];
        }
        
        try {
            FileReader infile = new FileReader(fileDir);

            myLexer l = new myLexer(new PushbackReader(new BufferedReader(infile), 1024));
            Parser p = new Parser(l);
            p.parse();
        } catch (LexerException le) {
            System.out.println("\n" + le.getMessage());
        } catch (ParserException pe){
            System.out.println("\n" + pe.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("\n" + e.getMessage());
        }
       
    }
}
