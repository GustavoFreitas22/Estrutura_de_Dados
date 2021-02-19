package Lista;

import javax.swing.*;

public class Ex010 {
	public static void main(String[] args) {

        int value = 0;
        
        value = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Fibonacci"));
        System.out.println();

        System.out.printf("%d ", calcFibonacci(value, 1, 0)); 

	}

    private static int calcFibonacci(int value, int num1, int num2) {

        System.out.printf("%d ",num2);
        System.out.println();
        int fibo = 0;
        
        fibo = num1 + num2;

        if (fibo < value) {
        	
            num2 = num1;
            num1 = fibo;
            return calcFibonacci(value, num1, num2);
            
        } else {
        	
            System.out.printf("%d ",num1);
            System.out.println();
            return fibo;
            
        }

    }  

}
