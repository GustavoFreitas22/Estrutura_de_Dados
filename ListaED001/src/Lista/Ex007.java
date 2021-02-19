package Lista;

import javax.swing.*;

public class Ex007 {
	public static void main(String[] args) {
		int num = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));

		System.out.println(retornaFatorial(num));


	}


	private static int retornaFatorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num*retornaFatorial(num-1);
	}
}
