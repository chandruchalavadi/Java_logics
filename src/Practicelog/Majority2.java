package Practicelog;

public class Majority2 {
	public static void main(String[] args) {
		int [] arr= {2,2,3,3,3,3 };
		int num=4;
		System.out.println(less(arr,num));
	}

	static int less(int[] arr, int num) {
		for (int i  = 0; i < num; i++) {
			int count=0;
			for (int j = 0; j < num; j++) {
				if (arr[i]==arr[j]) {
					count ++;
				}
			}
			if(count>num/2) {
				return arr[i];
			}
		}
		return -1;
	}

   
}
