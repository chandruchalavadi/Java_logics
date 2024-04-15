package Practicelog;

public class Nextprime {
	public static void main(String[] args) {

		int a = 5;
		for (int i = a + 1; i < 10; i++) {
			int num = i;
			boolean flag =  true;
			for (int j = 2; j <num; j++) {
				if (num % j == 0) {
					flag = false;
					break;

				}

			}
		
			if (flag == true) {
				System.out.println(num + " prime number");
				break;

			}
		}

	}

}
 