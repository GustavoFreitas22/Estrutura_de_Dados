package Lista;

import javax.swing.JOptionPane;

public class Ex011 {
	public static void main (String args[]) {
		double num = 0;
		
		Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		System.out.println(retornaSeq(num));
	}
	
	private static double retornaSeq(double num) {
		double aux = 1;
		
		if(aux == 0) {
			return num;
		}
		
		num += 1/num;
		System.out.println(aux);
		
		return retornaSeq(aux+1);
	}
}
// Ainda não está funcionando!