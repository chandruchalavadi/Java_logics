package Practicelog;

public class Samplespecial {
	public static void main(String[] args) {
		String str = "5? 36 @ 635";
		if (pali(str)) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}
	}

	public static boolean pali(String str) {
		str.replace("?!@#$%^&*", " ");
		str.replaceAll(" ", " ");
		char[] ch = str.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (ch[i] != ch[j]) {
			return false;
		}
		i++;
		j--;
		return true;
	}

}
