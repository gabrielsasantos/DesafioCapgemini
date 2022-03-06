package desafio_capgmini;

import java.util.ArrayList;
import java.util.List;

public class questao3 {

	public static void main(String[] args) {
		 System.out.println(encrypt("tenha um bom dia"));
	  }
	  
	  public static String encrypt(String text){
	    //remover espaços
	    text = text.replace(" ", "");
	    
	    //raiz quadrada
	    int dimension = (int) Math.ceil(Math.sqrt(text.length())); 
	    
	    char[][] grid = new char[dimension][dimension];
	    
	    //adiciona todos os caracteres do texto em uma lista para facilitar a manipulacao
	    List<Character> characters = new ArrayList<>();
	    for(int i = 0; i < text.length(); i++){
	      characters.add(text.charAt(i));
	    }

	    //mapeando a matriz
	    try {
	        for(int i = 0; i < grid.length; i++){
	            for(int j = 0; j< grid[i].length; j++){
	                if (characters.isEmpty()){
	                    break;
	                }

	                //remove o primeiro da lista
	                grid[i][j] = characters.remove(0);    
	            }
	        }
	    } catch (Exception e){
	    }

	    
	    String encryptedText = "";
	    try {
	        //itera pela matriz de forma inversa(colunas primeiro)
	        for(int i = 0; i < grid[i].length; i++){
	            for(int j = 0; j< grid.length; j++){
	                //adiciona o primeiro caractere de cada coluna
	                encryptedText += grid[j][i];
	            }
	        encryptedText += " ";
	        }
	    } catch(Exception e){
	    }

	    //retorna o texto encriptado
	    return encryptedText;
	  }
	
	}


