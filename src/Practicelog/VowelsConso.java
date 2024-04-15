package Practicelog;

public class VowelsConso {
	public static void main(String[] args) {
		String str = "java";
		String vow = " ";
		String conso = " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vow = vow + ch;

			} else {
				conso = conso + ch;
			}

		}
		System.out.println(conso+vow);

	}

}
