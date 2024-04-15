package Practicelog;

public class Withoutforwhilerev {
	public static void main(String[] args) {
		String str = "java";
		int size = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			size++;

		}
		rev(ch, size);

	}

	static void rev(char[] ch, int size) {
		if (size > 0) {
			System.out.print(ch[size - 1]);
			size--;
			rev(ch, size);
		}
	} 

}
