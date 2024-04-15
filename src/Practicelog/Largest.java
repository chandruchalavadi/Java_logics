package Practicelog;

public class Largest {
	public static void main(String[] args) {
		int[] arr = { 91, 7, 8, 10, 1, 3, 4, 5, 2, 68 };
		int fl = 0;
		int sl = 0;
		int tl = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fl) {
				tl = sl;
				sl = fl;
				fl = arr[i];

			} else if (arr[i] > sl) {
				tl = sl;
				sl = arr[i];

			} else if (arr[i] > fl) {
				tl = arr[i];
			}

		}
		System.out.println(fl +" " +sl +" "+ tl+" ");
	}

}
