package Practicelog;

public class Swap1last {
	public static void main(String[] args) {
		String str="Java is easy";
		char [] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int c=i;
			while( i<ch.length &&ch[i]!=' ') {
				i++;
			}
			int temp=ch[c];
			ch[c]=ch[i-1];
			ch[i-1] = (char) temp; 
			
		}
		System.out.print(ch);
	}

}
