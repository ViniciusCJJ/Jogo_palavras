package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import jogo.EbUm;
import jogo.EbDois;

class Teste {

	@Test
	public void testeEbUm() {
			EbUm e = new EbUm();
			String t = "testeEbUm";
			assertNotEquals(e.embaralhar(t), t);
	}
	
	@Test
	public void testeEbDois() {
			EbDois e = new EbDois();
			String t = "testeEbDois";
			assertNotEquals(e.embaralhar(t), t);
	}
}
