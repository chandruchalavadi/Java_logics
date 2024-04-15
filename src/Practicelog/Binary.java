package Practicelog;

public class Binary {
	public static void main(String[] args) {
       int num=4;
       int binary=0;
       int base=1;
       while(num>0) {
    	   binary=binary+(num%2)*base;
    	   num=num/2;
    	   base=base*10;
    	   
       }
       System.out.println(binary);
	}

}
