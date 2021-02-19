package Lista;

import javax.swing.*;

public class Ex004 {
	public static void main (String args[]) {
		int mat [][] = new int [4][4];
		int soma = 0, qtdImpar = 0, qtdDiv = 0, qtdImpar3 = 0, fat = 1, maior = 0;
		
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
				System.out.println(maior);
			}
		}
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				
				if(mat[i][j] >= 1 && mat[i][j] <= 100 ) {
					soma += mat[i][j];
				}
				if(mat[i][j] >= 30 && mat[i][j] <= 50) {
					if(mat[i][j]%2 != 1) {
						qtdImpar += 1;
					}
				}
				if(mat[i][j] % 8 == 1) {
					qtdDiv += 1;
					
				}
				if(mat[i][j]%3 == 1 && mat[i][j]%2 != 1 ) {
					qtdImpar3 +=1;
				}
				
				
			}
		}
		
		for(int i = 1; i <= maior; i++) {
			fat *= i;
			int aux = fat;
			System.out.println(aux);
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos valores de 1 a 100: " + soma);
		JOptionPane.showMessageDialog(null, "A quantidade de impares entre 30 e 50: " + qtdImpar);
		JOptionPane.showMessageDialog(null, "A quantidade de numeros divisiveis por 8: " + qtdDiv);
		JOptionPane.showMessageDialog(null, "A quantidade de números impares divisiveis por 3: " + qtdImpar3);
		JOptionPane.showMessageDialog(null, "O fatorial do maior número da matriz: " + fat);
		
	}

}
