package Practicelog;

import java.util.Arrays;
import java.util.stream.Stream;

public class Distinct {
	public static void main(String[] args) {
		int arr[]= {10,20,20,30,40};
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(arr[i]+" ");
			}
		}
	}
	
}
