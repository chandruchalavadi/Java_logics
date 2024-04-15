package Practicelog;

import java.util.Iterator;

public class Symmetric {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		    printm(arr);
		System.out.println("symmetric");
		System.out.println("not symmetric ");

	}

	static boolean printm(int[][] arr) {
		int row = arr.length;
		int col = arr[row].length;
		if (arr[row] != arr[col]) {
			return false;
		}

		for (int j = 0; j <=row; j++) {
			for (int i = 0; i < col; i++) {
               
				
			}
				int i = 0;
				if (arr[i][j] != arr[j][i]) {
					return false;
				}
				}
			
		
		return true;

	}

}
