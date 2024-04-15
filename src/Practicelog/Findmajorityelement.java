package Practicelog;

public class Findmajorityelement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 20, 30 };
		int len = 5;
		System.out.println(print(arr, len));
	}

	public static int print(int[] arr, int len) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
                   count ++;
				}
			}
			if(count>len/2) {
				return arr[i];
			}
		}
		return -1;

	}
}
