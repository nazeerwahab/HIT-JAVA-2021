package exer.prg;

public class SwapNumbers {
	public static void main(String[] args) {
		int a= 100, b= 200;
		System.out.println("===============Before Swap==============");
		System.out.println("1st no:"+a);
		System.out.println("2nd no:"+b);
		
		a = a - b;
		b = a + b;
		a = b - a;
		
		System.out.println("===============After Swap==============");
		System.out.println("1st no:"+a);
		System.out.println("2nd no:"+b);
	}

}
