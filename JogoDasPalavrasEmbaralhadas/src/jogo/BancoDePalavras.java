package jogo;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras {

private ArrayList<String> palavras = new ArrayList<String>();
private ArrayList<String> copiaP = new ArrayList<String>();
private String p;
	public void adicionarPalavras() {
		//Lista de palavras do banco de palavras.
		palavras.add("Ovo");
		palavras.add("Banana");
		palavras.add("Mesa");
		palavras.add("Carro");
		palavras.add("Casa");
		palavras.add("Computador");
		palavras.add("Celular");
		palavras.add("Lago");
		palavras.add("Rio");
		palavras.add("Controle");
		palavras.add("Panela");
		palavras.add("Carteira");
		palavras.add("Cabo");
		palavras.add("Cachorro");
		palavras.add("Montanha");
		palavras.add("Lixo");
		palavras.add("Ventilador");
		palavras.add("Árvore");
		palavras.add("Pneu");
		palavras.add("Espelho");
	}

	public String getPalavra() {
		//Método que retorna uma palavra aleatória.
		adicionarPalavras();
		copiaP=palavras;
		Collections.shuffle(palavras);
		p = copiaP.get(0);
		this.palavras.clear();
		return p;
	}
}
