package String_programs;

public class Duplicate_character {

	public static void main(String[] args) {
		String str="Greaat responsibility";
		int count =0;
		char str1[]=str.toCharArray();
		System.out.println("Duplicate character in string "+str+" are : ");N
		for(int i=0;i<str1.length;i++) {
		count=1;
		for(int j=i+1;j<str1.length;j++) {
			if(str1[i]==str1[j] && str1[i]!=' ') {
				count++;
				str1[j]='0';
			}
		}
		if(count>1 && str1[i]!='0') {
			System.out.print(str1[i]+" ");
		}
		}

	}

}
