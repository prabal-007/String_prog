package String_programs;

public class replce_white_space {

	public static void main(String[] args) {
		String str1="Remove all white space form the string";
		System.out.println("Original String : "+str1);
		
		String str2=str1.replaceAll("\\s+","");
		System.out.println("String after replacement : "+str2+"");

	}

}
