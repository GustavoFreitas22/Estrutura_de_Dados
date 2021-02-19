package Lista;

public class Ex009 {
	public static void main(String[] args) {

		int value = 300;

		System.out.println(calcSoma(value));
		
	}
	
	private static int calcSoma(int value) {

        if (value == 1) {
        	
            return value;
            
        } else if (value % 2 == 1 ) {
        	
            return value+calcSoma(value-1);
            
        } else {
        	
            return calcSoma(value-1);
            
        }

	}


}
