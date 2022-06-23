package jogo;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	public static int pontuacao = 0;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

	boolean teste = false;
	int chutes;
	int i=0;
	FabricaMecanicaDoJogo f = new FabricaMecanicaDoJogo();

		do{
		System.out.println("\n       Bem vindo ao jogo de embaralhar palavras!");
		System.out.println("\n                        Menu");
		System.out.println("\nO que deseja fazer? ");
		System.out.println("1-Jogo Normal");
		System.out.println("2-Morte Súbita");
		System.out.println("3-pontuacao");
		System.out.println("4-Sair");
		String opc = scanner.nextLine();
		
		switch (opc)
		{
		case "1":
			MecanicaDoJogo mNormal = f.getJogoNormal();
			String palavraEscolhida = mNormal.getPalavra();			
			String palavraEmbaralhada =mNormal.getPalavraEmbaralhada();
			System.out.println("\nModo Normal: \n3 chutes para acertar! \nDica no 3 chute!");
			System.out.println("\nDigite o significado da palavra embaralhada: " +palavraEmbaralhada);
			teste = mNormal.resposta(scanner.nextLine()); 
			chutes = 1;
			

			while(!mNormal.fimDoJogo(chutes))
			{
				System.out.println("\nErrado!");
				System.out.println("Voce ainda tem " + (3-chutes) +" chutes!");
				 if (chutes >1 && mNormal.dica())
				 {
					 System.out.println("Dica: " +palavraEscolhida.substring(0, palavraEscolhida.length()/2) + "...");
				 }
				System.out.println("palavra embaralhada: " +palavraEmbaralhada + "\nTente novamente: ");
				 teste = mNormal.resposta(scanner.nextLine());
				 chutes ++;
				 if (chutes == 3)
				 {
					 System.out.println("Fim do jogo. A palavra correta era: " + palavraEscolhida );
					 pontuacao = 0;
				 }
			}
			if (teste)
			{
				if(chutes == 1) {
				System.out.println("\nParabéns, você acertou no " +chutes +" chute !" );
				pontuacao++;
				}if(chutes >1) {
				System.out.println("\nParabéns, você acertou!" );
				pontuacao++;
				}
			}
			break;

		case "2":
			MecanicaDoJogo mMorteSubita = f.getMorteSubita();
			String palavraEmbaralhadaH =mMorteSubita.getPalavraEmbaralhada();
			System.out.println("\nMorte súbita: \nApenas 1 chute para acertar!");
			System.out.println("\n5x mais pontuação por acerto!");
			System.out.println("\nDigite o significado da palavra embaralhada: " +palavraEmbaralhadaH);
			teste = mMorteSubita.resposta(scanner.nextLine()); 
			chutes = 1;
			
			if (teste)
			{
				System.out.println("\nParabéns, você acertou!" );
				pontuacao++;
				pontuacao++;
				pontuacao++;
				pontuacao++;
				pontuacao++;
				break;
			}else {
				System.out.println("\nErrado!, você perdeu." );
				break;
			}
		case "3":
			System.out.println("\nSua pontuação é de: " +pontuacao+" pontos.");
			break;
			
		case "4":
			System.out.println("\nAté a próxima!");
			i+=1;
		}
	}while(i==0);
	
	}
}