package Practicelog;

public class Uppercase {
	public static void main(String[] args) {

		String str="the brave man story";
		char [] ch=str.toCharArray();
		ch[0] =(char) (ch[0]-32);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]== ' ') {
				ch[i+1]= (char)(ch[i+1]-32);
				
			}
			
		}
		for (int j = 0; j < ch.length; j++) {
			System.out.print(ch[j]);
			
		}
	}
}
