package javaFirstPackage;

public class RemoveWhiteSpacesFrStr {
	
	//Approach 1st - by using inbuilt method replaceAll
	public static void main(String[] args) {
		String s="vikram sayaji katkar";
		String nospace=s.replaceAll("\\s", "");
		System.out.println(nospace);

		//Approach 2nd - by using logic
		
		/*String s="vikram sayaji katkar";
		char ca[]=s.toCharArray();
		StringBuilder sb= new StringBuilder();
		
		for(char str:ca) {
			if(str!=' ' && str!='\t') {
				sb.append(str);
			}
		}
		System.out.println(sb.toString());*/
	}

}
