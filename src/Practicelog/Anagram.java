package Practicelog;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String str1="care";
		String str2="raca";
		if(str1.length()==str2.length()) {
			char [] ch=str1.toCharArray();
			char [] ch2=str2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch, ch2);
			if(result==true) {
				System.out.println("its anagram");
			}
			else {
				System.out.println("Its not Anagram");
			}
		}
		else {
			System.out.println("Length not matching");
		}
	}

}
