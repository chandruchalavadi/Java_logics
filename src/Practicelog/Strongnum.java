package Practicelog;

public class Strongnum {
	public static void main(String[] args) {
		  int num=145;
	        numsum(num);
	     }
	     static void numsum(int num){
	        int copy=num;
	        int sum=0;
	        while (num!=0) {
	            int rem=num%10;
	            sum=sum+facto(rem);
	            num=num/10;
	        }
	        if(copy==sum){
	            System.out.println("Its Strong number");
	        }
	        else{
	            System.out.println("Its not Strong");
	        }
	     }
	     static int facto(int num){
	        int mul=1;
	        for(int i=num;i>=1;i--){
	            mul=mul*i;
	        }
	        return mul;
	     }
	}


