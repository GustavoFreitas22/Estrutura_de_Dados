package Lista;



public class Ex008 {
	public static void main(String[] args) {

		int value = 200;

		System.out.println(calcSoma(value));
		
	}
	
	private static int calcSoma(int value) {

        if (value == 1) {
            return 0;
            
        } else if (value % 2 == 0 ) {
        	
            return value+calcSoma(value-1);
            
        } else {
            return calcSoma(value-1);
        }

	}

}
