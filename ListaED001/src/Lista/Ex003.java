package Lista;

import java.util.*;

public class Ex003 {
	public static void main(String args[]) {
		int vet [] = new int[99];
		int aux = 0;
		
		Random num = new Random();
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = num.nextInt()*1;
		}
		
		for(int i = 0; i < 99; i++) {
			for(int j = 0; j < 99; j++) {
				
				if(vet[i] < vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

}
