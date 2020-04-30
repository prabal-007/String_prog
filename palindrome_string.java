package String_programs;

public class palindrome_string {

	public static void main(String[] args) {
		String str="abcdcba";
		boolean flag=true;
		str=str.toLowerCase();
		
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
			flag=false;
			break;
			}
			
		}
		if(flag) {
			System.out.println(" String is a palindrome ");
		}else {
			System.out.println(" String is not a palindrome ");
		}

	}

}
