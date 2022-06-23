package jogo;
import java.util.ArrayList;
import java.util.Collections;

public class FabricaEmbaralhadores {
private ArrayList<Integer> op = new ArrayList<Integer>();
private int valor=0;
	public Embaralhador getEmbaralhador() {
		//Aleatoriedade de embaralhador.
		for(int i=1;i<=2;++i) { 
			op.add(i);
		}
		Collections.shuffle(op);
		valor=op.get(0);
		if(valor==1) {
			return new EbUm();
		}
			if(valor==2) {
				return new EbDois();
			}
		return null;
	}
}
