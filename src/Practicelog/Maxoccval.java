package Practicelog;

public class Maxoccval {
	public static void main(String[] args) {
		String str = "helloo           ";
		int[] arr = new int[122];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;

		}
		int max = -1;
		char ch = ' ';
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != 0) {
				if (max < arr[j]) {
					max = arr[j];
					ch = (char) j;

				}

			}
		}
		System.out.println(ch + "=> " + max);
	}

}
