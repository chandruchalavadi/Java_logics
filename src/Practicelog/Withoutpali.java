package Practicelog;

public class Withoutpali {
	public static void main(String[] args) {
		String str = "nan";
		if (Pali(str)) {
			System.out.println("It is palindrome ");

		} else {
			System.out.println("not a palindrome");
		}
	}

	static boolean Pali(String str) {
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
