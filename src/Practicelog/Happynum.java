package Practicelog;

public class Happynum {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int num = i;

			while (num >  9) {
				numsum(num);

			}
			if (num == 1 || num == 7) {
				System.out.println(num + " " + "happy number");

			} else {
				System.out.println(num + " " + "not happy number");
			}
		}
	}

	static int numsum(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem * rem;
			num = num / 10;

		}
		return sum;

	}

}
