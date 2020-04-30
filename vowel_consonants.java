package String_programs;

public class vowel_consonants {

	public static void main(String[] args) {
		String str="To count the number of vowels and consonents in the given string";
		int Vcount=0,Ccount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' || str.charAt(i)<='z' && str.charAt(i)!=' ') {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					Vcount++;
				}else {
					Ccount++;
				}
			}
		}
		System.out.println("The number of vowels in the given string are : "+Vcount);
		System.out.println("The number of consonents in the given string are : "+Ccount);

	}

}
