package exer.prg;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a= 100, b= 200;
		System.out.println("===============Before Swap==============");
		System.out.println("1st no:"+a);
		System.out.println("2nd no:"+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("===============After Swap==============");
		System.out.println("1st no:"+a);
		System.out.println("2nd no:"+b);
				
	}

}

