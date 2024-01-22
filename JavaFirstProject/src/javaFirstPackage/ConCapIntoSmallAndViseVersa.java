package javaFirstPackage;

public class ConCapIntoSmallAndViseVersa {

	public static void main(String[] args) {
		System.out.println("Your Converted String is: ");
		String s = "SELEnium";
		char ch[]= s.toCharArray();
		for(char c:ch) {
			if(c>65 && c<93) {
				c+=32;
			}else {
				c-=32;
			}
			System.out.print(c);
		}
		
	}

}
