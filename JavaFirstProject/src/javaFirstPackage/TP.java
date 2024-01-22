package javaFirstPackage;

class TP{
	void disp(int a, double b) {
		System.out.println("method a");
	}
	
	void disp(int a, int b) {
		System.out.println("method b");
	}
	
	public static void main(String[] args) {
		TP obj = new TP();
		
		obj.disp(100, 3);
		
	}
}
