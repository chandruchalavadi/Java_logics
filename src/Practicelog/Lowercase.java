package Practicelog;

public class Lowercase {
	public static void main(String[] args) {
		String str="the brave man story";
		String [] s1=str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String s3=s1[i];
		
			for (int j = 0; j < s3.length()-1; j++) {
				char ch=s3.charAt(j);
				System.out.print(ch);
				
			}
		char ch1=s3.charAt(s3.length()-1);
		System.out.print((char) (ch1-32)+" ");
		
	   
	}
				}

}
