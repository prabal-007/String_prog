package String_programs;

public class max_character {

	public static void main(String[] args) {
		String str="Grass is greener on the other side ";
		int len=str.length();
		int count =0;
		char[] a=str.toCharArray();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]);
				count++;
			}
			System.out.println(a[i]+" occured "+count+" times ");
	}

	}

}
