package Practicelog;

public class Withoutlength {
	public static void main(String[] args) {
		String str="hello";
		int count=0;
		char[]ch=str.toCharArray();
		for(char c1:ch) {
			count ++;
		}
		System.out.println(count);
	}

}
