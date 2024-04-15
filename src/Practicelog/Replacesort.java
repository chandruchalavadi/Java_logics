package Practicelog;

import java.util.Arrays;

public class Replacesort {
      public static void main(String[] args) {
		int [] arr= {1,8,4,0,0,0};
		int [] abb= {5,6,2};
		int [] a1=stored(arr,abb);
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
	}
      static int[] stored(int [] arr,int[]abb) {
    	  int j=0; 
    	  for (int i = 0; i < arr.length; i++) {
    		  if(arr[i]==0) {
    			  arr[i]=abb[j];
    			  j++;
    		  }
			
		}
    	  return arr;
      }

}
