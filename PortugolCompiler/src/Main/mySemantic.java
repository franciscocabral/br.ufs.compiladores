/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author Francisco
 */
import expression.node.*;
import expression.analysis.*;

import java.util.*;

import org.sablecc.sablecc.node.AIdBasic;

public class mySemantic extends DepthFirstAdapter {
    // mySemantic methods for each node    
    // exemplo do: http://www.dcs.gla.ac.uk/scripts/global/wim/blosxom.cgi/Gannet/Language/gannetc-compiler-sablecc.html

	private Hashtable<String, String> myTable = new Hashtable<>();
	
	public void outStart(Start node){
        defaultOut(node);
    }

    public void outAStart(AStart node){
        defaultOut(node);
    }

    public void outAInstanciaPrograma(AInstanciaPrograma node){
        putInTable("Programa", node.getId().getText());
    }

    public void outABlocoComando(ABlocoComando node){
        defaultOut(node);
    }

    public void outABlocoPrograma(ABlocoPrograma node){
        defaultOut(node);
    }

    public void outAVariavelDeclaracao(AVariavelDeclaracao node){
        for (PVariavel var : node.getBlocoVariavel()){
        	String key;
        	int linha;
        	int pos;
        	
        	try {
        		key = ((AVariavelVariavel) var).getId().getText(); 
        		linha = ((AVariavelVariavel) var).getId().getLine();
        		pos = ((AVariavelVariavel) var).getId().getPos();
        	}catch(Exception e){
        		key = ((AVetorVariavel) var).getId().getText(); 
        		linha = ((AVetorVariavel) var).getId().getLine();
        		pos = ((AVetorVariavel) var).getId().getPos();
        	}
        	
        	if(isOnTable(key)){
        		try {
					throw new Exception("Variável Duplicada ["+linha+","+pos+"]: "+key);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
        	}else{
        		putInTable(key, node.getTipo().toString());
        	}
        	
        }
    }

    public void outAConstanteDeclaracao(AConstanteDeclaracao node){
    	String key = node.getId().getText();
    	int linha = node.getId().getLine();
    	int pos = node.getId().getPos();
    	
    	if(isOnTable(key)){
    		try {
				throw new Exception("Variável Duplicada ["+linha+","+pos+"]: "+key);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
    	}else{
    		putInTable(key, node.getValor().toString());
    	}
    }

    public void outAVariavelVariavel(AVariavelVariavel node){
        defaultOut(node);
    }

    public void outAVetorVariavel(AVetorVariavel node){
        defaultOut(node);
    }

    public void outACase(ACase node){
        defaultOut(node);
    }
    
    public void outARealTipo(ARealTipo node){
        defaultOut(node);
    }
    
    public void outAInteiroTipo(AInteiroTipo node){
        defaultOut(node);
    }

    public void outACaractereTipo(ACaractereTipo node){
        defaultOut(node);
    }

    public void outAValorRealValor(AValorRealValor node){
    	putInTable(node.toString(), "real");
    }

    public void outAValorInteiroValor(AValorInteiroValor node){
    	putInTable(node.toString(), "inteiro");
        defaultOut(node);
    }

    public void outAValorCaractereValor(AValorCaractereValor node){
    	putInTable(node.toString(), "caractere");
        defaultOut(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node){
        defaultOut(node);
    }

    public void outAFuncaoComando(AFuncaoComando node){
        defaultOut(node);
    }
    
    public void outASeComando(ASeComando node){
        defaultOut(node);
    }

    public void outASeSenaoComando(ASeSenaoComando node){
        defaultOut(node);
    }

    public void outAAvalieComando(AAvalieComando node){
        defaultOut(node);
    }

    public void outAEnquantoComando(AEnquantoComando node){
        defaultOut(node);
    }

    public void outARepitaComando(ARepitaComando node){
        defaultOut(node);
    }

    public void outAParaComando(AParaComando node){
        defaultOut(node);
    }

    public void outAParaPassoComando(AParaPassoComando node){
        defaultOut(node);
    }

    public void outAAtribuicoes(AAtribuicoes node){
    	PVariavel var = node.getVariavel();
    	String key;
    	int linha;
    	int pos;
    	try {
    		key = ((AVariavelVariavel) var).getId().getText(); 
    		linha = ((AVariavelVariavel) var).getId().getLine();
    		pos = ((AVariavelVariavel) var).getId().getPos();
    	}catch(Exception e){
    		key = ((AVetorVariavel) var).getId().getText(); 
    		linha = ((AVetorVariavel) var).getId().getLine();
    		pos = ((AVetorVariavel) var).getId().getPos();
    	}
    	
    	
    	if(!isOnTable(key)){
    		try {
				throw new Exception("Variável não declarada ["+linha+","+pos+"]: "+key);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
    	}else{
    		String tipo = getFromTable(key);
    		String[] exps = node.getExpressao().toString().split(" ");
    		for(String exp: exps){
    			String expTipo = getFromTable(exp); 
    			if ((tipo.contains("inteiro") && !expTipo.contains("inteiro"))
    					|| (tipo.contains("real") && !(expTipo.contains("real") || expTipo.contains("inteiro")))
    					|| (tipo.contains("caractere") && !expTipo.contains("caractere"))){
    	    		try {
    					throw new Exception("Atribuição de Tipo Inválido ["+linha+","+pos+"]: "+key);
    				} catch (Exception e) {
    					System.out.println(e.getMessage());
    				}
    			}
    		}
    	}
    }

    public void outALeiaFuncoes(ALeiaFuncoes node){
        for (PVariavel var : node.getBlocoVariavel()){
        	String key;
        	int linha;
        	int pos;
        	
        	try {
        		key = ((AVariavelVariavel) var).getId().getText(); 
        		linha = ((AVariavelVariavel) var).getId().getLine();
        		pos = ((AVariavelVariavel) var).getId().getPos();
        	}catch(Exception e){
        		key = ((AVetorVariavel) var).getId().getText(); 
        		linha = ((AVetorVariavel) var).getId().getLine();
        		pos = ((AVetorVariavel) var).getId().getPos();
        	}
        	
        	if(!isOnTable(key)){
        		try {
    				throw new Exception("Variável não declarada ["+linha+","+pos+"]: "+key);
    			} catch (Exception e) {
    				System.out.println(e.getMessage());
    			}
        	}
        
        }
    }

    public void outAEscrevaFuncoes(AEscrevaFuncoes node){
        defaultOut(node);
    }

    public void outASeStant(ASeStant node){
        defaultOut(node);
    }

    public void outASenaoEstruturas(ASenaoEstruturas node){
        defaultOut(node);
    }

    public void outASeEstruturas(ASeEstruturas node){
        defaultOut(node);
    }

    public void outASeSenaoEstruturas(ASeSenaoEstruturas node){
        defaultOut(node);
    }

    public void outAAvalieEstruturas(AAvalieEstruturas node){
        defaultOut(node);
    }

    public void outAEnquantoEstruturas(AEnquantoEstruturas node){
        defaultOut(node);
    }

    public void outARepitaEstruturas(ARepitaEstruturas node){
        defaultOut(node);
    }

    public void outAParaEstruturas(AParaEstruturas node){
        defaultOut(node);
    }

    public void outAParaPassoEstruturas(AParaPassoEstruturas node){
        defaultOut(node);
    }

    public void outAMaisExpressao(AMaisExpressao node){
        defaultOut(node);
    }

    public void outAMenosExpressao(AMenosExpressao node){
        defaultOut(node);
    }

    public void outAVezesExpressao(AVezesExpressao node){
        defaultOut(node);
    }

    public void outADivididoExpressao(ADivididoExpressao node){
        defaultOut(node);
    }

    public void outARestoExpressao(ARestoExpressao node){
        defaultOut(node);
    }

    public void outAValorExpressao(AValorExpressao node){
        defaultOut(node);
    }

    public void outAVariavelExpressao(AVariavelExpressao node){
    	    PVariavel var = node.getVariavel();
        	String key;
        	int linha;
        	int pos;
        	
        	try {
        		key = ((AVariavelVariavel) var).getId().getText(); 
        		linha = ((AVariavelVariavel) var).getId().getLine();
        		pos = ((AVariavelVariavel) var).getId().getPos();
        	}catch(Exception e){
        		key = ((AVetorVariavel) var).getId().getText(); 
        		linha = ((AVetorVariavel) var).getId().getLine();
        		pos = ((AVetorVariavel) var).getId().getPos();
        	}
        	
        	if(isOnTable(key)){
        		try {
					throw new Exception("Variável Duplicada ["+linha+","+pos+"]: "+key);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}      	
        	}
     }
    
    public void outAMenosExpressaoExpressao(AMenosExpressaoExpressao node)
    {
        defaultOut(node);
    }
    
    public void outAOuExpressaoLogica(AOuExpressaoLogica node){
        defaultOut(node);
    }

    public void outAXorExpressaoLogica(AXorExpressaoLogica node){
        defaultOut(node);
    }

    public void outAEExpressaoLogica(AEExpressaoLogica node){
        defaultOut(node);
    }

    public void outAIgualExpressaoLogica(AIgualExpressaoLogica node){
        defaultOut(node);
    }

    public void outADiferenteExpressaoLogica(ADiferenteExpressaoLogica node){
        defaultOut(node);
    }

    public void outAMaiorigualExpressaoLogica(AMaiorigualExpressaoLogica node){
        defaultOut(node);
    }

    public void outAMenorigualExpressaoLogica(AMenorigualExpressaoLogica node){
        defaultOut(node);
    }

    public void outAMaiorExpressaoLogica(AMaiorExpressaoLogica node){
        defaultOut(node);
    }

    public void outAMenorExpressaoLogica(AMenorExpressaoLogica node){
        defaultOut(node);
    }

    public void outAMaisExpressaoLogica(AMaisExpressaoLogica node){
        defaultOut(node);
    }

    public void outAMenosExpressaoLogica(AMenosExpressaoLogica node){
        defaultOut(node);
    }

    public void outAVezesExpressaoLogica(AVezesExpressaoLogica node){
        defaultOut(node);
    }

    public void outADivididoExpressaoLogica(ADivididoExpressaoLogica node){
        defaultOut(node);
    }

    public void outARestoExpressaoLogica(ARestoExpressaoLogica node){
        defaultOut(node);
    }

    public void outANaoExpressaoLogica(ANaoExpressaoLogica node){
        defaultOut(node);
    }

    public void outAValorExpressaoLogica(AValorExpressaoLogica node) {
        defaultOut(node);
    }


    public void outAVariavelExpressaoLogica(AVariavelExpressaoLogica node){
        defaultOut(node);
    }

	
	
	//Funções auxiliares
	public String remFromTable(String key){
		return this.myTable.remove(key);
	}
	
	public String getFromTable(String key){
		return this.myTable.get(key);
	}
	
	public String putInTable(String key, String value){
		if(value != null){
			return this.myTable.put(key, value);
		}
		return null;
	}
	
	public boolean isOnTable(String key){
		return this.myTable.contains(key);
	}
	
}