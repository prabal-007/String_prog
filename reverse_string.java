package String_programs;

public class reverse_string {

	public static void main(String[] args) {
		String string="Prabal Gupta";
		String reversestring="";
		
		for(int i=string.length()-1;i>=0;i--) {
			reversestring=reversestring + string.charAt(i);  
		}
		System.out.println("Original String : "+string);
		System.out.println("REversed String : "+reversestring);

	}

}
