package Practicelog;

import java.util.TreeSet;

public class Panaygram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog ";
		String s1=str.toUpperCase();
//		System.out.println(s1);
		TreeSet t1 = new TreeSet();
		for (int i = 0; i < s1.length(); i++) {
			char[] ch = s1.toCharArray();
			if (ch[i] != ' ')
				t1.add(ch[i]);
		}
		if (t1.size() == 26) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
