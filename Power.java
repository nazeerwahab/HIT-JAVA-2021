package exer.prg;

public class Power {
	public static void main(String[] args) {
		
		int base = 2, exponent = 10;
		 long result = 1;
		 while (exponent != 0) {
		 result *= base;
		 --exponent;
		 }
		 System.out.println("Answer = " + result);
		
		
	}

}
