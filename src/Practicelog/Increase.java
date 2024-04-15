package Practicelog;

public class Increase {
	public static void main(String[] args) {
		String str="hello";
		int num=4;
		Demo(str,num);
	}
	static void Demo(String a,int num) {
		for (int i = 0; i < a.length(); i++) {
			char[] ch=a.toCharArray();
			System.out.print((char) (ch[i]+num));
			
		}
	}

}
