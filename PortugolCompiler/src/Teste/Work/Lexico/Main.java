/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste.Work.Lexico;

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

            Token now = null;

            do {
            		try{
	                    now = l.next();
	                    if (now instanceof TBranco) {
	                        System.out.print(now.getText());
	                    } else if (now instanceof TComentarioLinha) {
	                        System.out.println(now.getClass().getSimpleName());
	                    } else {
	                        System.out.print(now.getClass().getSimpleName() + " ");
	                    }
            		} catch(LexerException le){
            			System.out.print("\n" + le.getMessage());
            		}
            } while (!(now instanceof EOF));         
            
        } catch (Exception e) {
            throw new RuntimeException("\n" + e.getMessage());
        }
    }
}
