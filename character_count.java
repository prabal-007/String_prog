package String_programs;

public class character_count {

	public static void main(String[] args) {
		String string= "best in the world.";
		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				count++;				
			}
		}
		System.out.println("The total number of character in string : "+count);

	}

}
