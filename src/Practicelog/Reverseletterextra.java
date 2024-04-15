package Practicelog;

public class Reverseletterextra {
	public static void main(String[] args) {
		String str = "hello java";
		char[] ch = str.toCharArray();
		String s2 = str.replaceAll(" ", str);
		int j = str.length() - 1;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] != ' ') {

				ch[i] = str.charAt(j);

				j--;
			}
		}

		for (int k = 0; k < ch.length; k++) {
			System.out.print(ch[k]);

		}
	}

}
