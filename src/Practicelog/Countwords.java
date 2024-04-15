package Practicelog;

public class Countwords {
	public static void main(String[] args) {
		String str="hi mava how are you mava";
		String str1[]=str.split(" ");
				int count=0;
		String s1="mava";
		for (int i = 0; i < str1.length; i++) {
			if(str1.equals(s1))
			count++;
		}
		System.out.println(count+"--->"+s1);
	}

}
