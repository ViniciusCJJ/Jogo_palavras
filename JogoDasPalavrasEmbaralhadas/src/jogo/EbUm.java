package jogo;
import java.util.ArrayList;
import java.util.Collections;
public class EbUm implements Embaralhador {
	//Primeiro embaralhador.
	
	@Override
	public String embaralhar(String palavra) {
		ArrayList <String> temp = new ArrayList<String>();
		 for (int a=0; a < palavra.length(); a++)
		 {
			temp.add(palavra.substring(a, a+1));
		 } 	 
		 	Collections.shuffle(temp);		 
		 	String palavraN= palavra.substring(1, 1);
		 		for (int b=0; b<palavra.length() ; b++)
		 		{
		 			palavraN += temp.get(b);	
		 		}
		 			return palavraN;
	}
}
