package jogo;
import java.io.IOException;

public interface MecanicaDoJogo  {
	//interface.
	public boolean resposta(String chute) throws IOException;
	public boolean dica();
	public String getPalavraEmbaralhada() throws IOException;
	public boolean fimDoJogo (int chutes);
	public String getPalavra() throws IOException;

}