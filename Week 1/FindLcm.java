package exer.prg;

public class FindLcm {
	public static void main(String[] args) {
		

	int a = 5, b = 2, lcm;
	 
	 lcm = (a > b) ? a : b;
	 
	 while(true) {
		 
		 if( lcm % a == 0 && lcm % b == 0 ) {
			 
		 System.out.printf("The LCM of %d and %d is %d.", a, 
		b, lcm);
		 
		 break;
		 }
		 ++lcm;
		 }
	 }
}

