package Practicelog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

   public class Largestrev {
	   public static void main(String[] args) {
     ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(1,2,4,5));
	//	a1.add(1);
	//	a1.add(2);
	//	a1.add(5);
	//	a1.add(4);
 ArrayList<Integer> a2=new ArrayList<Integer>();
	
	a2=Kthsmalllarge(a1,4,3);
	System.out.println(a2);
	   	

}
   static ArrayList<Integer> Kthsmalllarge(ArrayList<Integer>arr,int n,int k){
	   ArrayList<Integer> a1=new ArrayList<Integer>();
	   Collections.sort(arr);
	    a1.add   ( arr. get(k-1));
	    a1.add(arr.get(n-k));
	    return a1;
   }
          
   }
