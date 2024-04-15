package Practicelog;

public class Bubblesort {
	public static void main(String[] args) {
		int [] arr= {10,30,20,50,40};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1]; 
					arr[j+1]=temp;
				}
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
