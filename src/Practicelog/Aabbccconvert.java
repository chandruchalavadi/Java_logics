package Practicelog;

public class Aabbccconvert {
	public static void main(String[] args) {
		String str = "1f2u3c4k";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >'0' && ch[i] < '9') {
				printttt(ch[i+1], ch[i]);
			}
		}
	}

	static void printttt(char ch1, char ch2) {
		char num = (char) (ch2 - 32);
		for (int i = 0; i < num; i++) {
			System.out.print(ch1);
		}
	}
}
