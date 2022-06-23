package jogo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class EbDois implements Embaralhador {
	
	@Override
	public String embaralhar(String palavra) {
		//Segundo embaralhador.
		  List<Character> letras = new ArrayList<>();
		    palavra.chars().mapToObj(x -> (char) x).forEach(letras::add);
		    Collections.shuffle(letras);
		    String p=letras.stream().map(e -> e.toString()).collect(Collectors.joining());
		    //Deixa tudo em maiúsculo para dificultar a identificação da primeira letra da palavra 
		    p=p.toUpperCase();
		    return p;
		  }
}
	
