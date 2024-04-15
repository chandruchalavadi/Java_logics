package Practicelog;

public class nextprintjava {
	public static void main(String[] args) {

		String str = "java is easy";
		char[] ch = str.toCharArray();
		for (char c1 : ch) {
			System.out.print(c1);
			if (c1==' ') {
				System.out.println();
				
			}

		}
	}

}
