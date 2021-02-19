package Lista;

import java.util.*;

public class Ex001 {
	public static void main(String Args[]) {
		double vet [] = new double[99];
		double media = 0, mGeral = 0, negSoma = 0;
		
		Random num = new Random();
		
		for(int i = 0; i<vet.length; i++) {
			vet[i] = num.nextDouble()*1000;
			mGeral += vet[i];
			
			if(vet[i] >=100 && vet[i]<=1000) {
				media += vet[i];
			}
			if(vet[i] < 0) {
				negSoma += vet[i];
			}
			System.out.println(vet[i]);
		}
		mGeral = mGeral/100;
		media = media/100;
		System.out.println("Soma dos negativos:\n"+negSoma);
		System.out.println("Média geral:\n"+mGeral);
		System.out.println("Média dos possitivos: \n"+media);
		
	}
}
