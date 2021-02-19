package Lista;

import javax.swing.*;

public class Ex005 {
	public static void main (String args[]) {
		int mat [][] = new int [5][5];
		int num = 1;
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat.length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digita um num"));
				if(i == j) {
					mat[i][j] = num;
					num*=3;
				}
			}
		}
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.println(mat[i][j]);	
			}
			System.out.println();
		}
	}
}		


