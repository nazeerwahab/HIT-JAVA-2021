package hit.day10;

public class AssoDemo {
	public void eatLaddu(Laddu l) {
		System.out.println("laddu is eaten now ....half");
		l.setSize(5);
	}
	public static void main(String[] args) {
		Laddu laddu = new Laddu();//association -assodemo has knowledge of laddu
		
		laddu.setSize(10);
		System.out.println("Before eating laddu the size is...:"+laddu.size);
		
		AssoDemo obj = new AssoDemo();
		//passing the object by reference...
		obj.eatLaddu(laddu);
		
		System.out.println("After eating laddu the size is ...:"+laddu.size);
	}
}

class Laddu{
	int size;
	public void setSize(int size) {//local variables takes precedance over the global variables..
		this.size = size;
	}
}