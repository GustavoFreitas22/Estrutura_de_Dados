package Lista;

import javax.swing.*;

public class Ex002 {
		public static void main(String[] args) {
			int vet[] = new int [5];

			
			
			for(int i =0; i <= 4; i++) {
				vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
				
				retornaFatorial(vet[i]);
				System.out.println();
			}
		}
		
		public static void retornaFatorial(int val) {		
			int fat = 1;
			int vet2[] = new int [val+1];
			
			System.out.println();
			for(int i = 1; i <= val; i++) {
				fat *= i;
				vet2[i] = fat;
				System.out.println(vet2[i]);
			}
		}	
}
