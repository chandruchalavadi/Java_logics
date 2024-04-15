package Practicelog;

public class Bengalorepgm {
	public static void main(String[] args) {
		String str1 = "bengalore is bengalore bengalore  my city bengalore";
		String str2 = "bengalore";
		if (!compare(str1, str2)) {
			System.out.println(str1 + str2);

		} else {
			System.out.println("not match");
		}
	}

	static boolean compare(String s1, String s2) {
		if (s1.length() != s2.length()) 
			return false;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;

	}

}
