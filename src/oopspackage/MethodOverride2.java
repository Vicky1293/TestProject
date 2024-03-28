package oopspackage;

public class MethodOverride2 extends MethodOverride1 {
	public void eat() {
		System.out.println("your are eating");
	}

	public static void main(String[] args) {
		MethodOverride2 mo2 = new MethodOverride2();
		mo2.eat();
		
		// in method overriding method name and parameters are same and they
		// are not takesplace in same class and output is always generated for chiled class only
		// and if you want to generate output of parent class the you should have to create object 
		// of parent class
		
		MethodOverride1 mo1 = new MethodOverride1();
		mo1.eat();
		

	}

}
