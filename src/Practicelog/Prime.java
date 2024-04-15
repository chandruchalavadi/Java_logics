package Practicelog;

public class Prime {
	public static void main(String[] args) {
		int num=6;
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("its prime");
			
		}
		else {
			System.out.println("not");
		}
	}

}
