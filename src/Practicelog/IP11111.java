package Practicelog;

public class IP11111 {
	public static void main(String[] args) {
		int[] arr = { 1,1,1,1,1 };
		System.out.print(arr[0]); 
		for (int i = 0; i < arr.length-1; i++) {

			arr[i + 1] = arr[i] + arr[i + 1];
		
		
			System.out.print(arr[i+1]+"");

		}
	}

}
