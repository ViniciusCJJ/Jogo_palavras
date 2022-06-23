package jogo;

import java.io.IOException;

public class JogoNormal implements MecanicaDoJogo  {
	
	private BancoDePalavras b = new BancoDePalavras();
	private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
	private String palavraAleatoria = b.getPalavra();
	private String PalavraEmbaralhada = f.getEmbaralhador().embaralhar(palavraAleatoria);
	private boolean correta;
	
	public JogoNormal() throws IOException {
	} 
	
	
	@Override
	public boolean fimDoJogo (int chutes)
	{
		if (chutes == 3 || correta )
		{
			return true;
		} else {
			return false;
		}	
	}
	
	@Override
	public boolean resposta(String chute) throws IOException
	{
		if (chute.equals(getPalavra()))
		{
			correta = true;
			return true;
		}else 
			{
			correta = false;
			return false;
			}
	}
	
	@Override
	public String getPalavra() throws IOException
	{
		return palavraAleatoria;
	}
	
	public String getPalavraEmbaralhada() throws IOException
	{
		return PalavraEmbaralhada;
	}

	@Override
	public boolean dica()
	{
		return true;
	}
}