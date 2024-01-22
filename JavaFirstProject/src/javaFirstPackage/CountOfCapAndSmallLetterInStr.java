package javaFirstPackage;
//Check how many capital & small letters in String
public class CountOfCapAndSmallLetterInStr {

	public static void main(String[] args) {
		String s= "SELEnium";
		int capitalCounter=0;
		int lowerCounter=0;
		char ch[]= s.toCharArray();
		for(char c:ch) {
			if(c>65 && c<93) {
				capitalCounter++;
			}else {
				lowerCounter++;
			}
		}
		System.out.println("capital counter in given string are: "+capitalCounter);
		System.out.println("smaller counter in given string are: "+lowerCounter);

	}

}
