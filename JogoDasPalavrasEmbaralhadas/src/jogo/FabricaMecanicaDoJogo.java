package jogo;

import java.io.IOException;

public class FabricaMecanicaDoJogo {
	//Modos de jogo
	
	public MecanicaDoJogo getJogoNormal () throws IOException
	{
		return new JogoNormal(); 
	}
		public MecanicaDoJogo getMorteSubita () throws IOException
		{
			return new MorteSubita(); 
		}
}
