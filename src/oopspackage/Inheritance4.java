package oopspackage;

public class Inheritance4 extends Inheritance3 {
	
	public void multy(int x, int y) {
		z = x * y;
		System.out.println("multiplication is:" + z);
	}

	public static void main(String[] args) {
		
		Inheritance4 obj = new Inheritance4();
		obj.add(25, 25);
		obj.subst(100, 50);
		obj.multy(10, 10);
	}

}
