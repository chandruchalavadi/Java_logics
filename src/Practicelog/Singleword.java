package Practicelog;

public class Singleword {
	public static void main(String[] args) {
		String str="java mava bava";
		String [] c= str.split(" ");
		String d="";
		for (int i = 0; i < c.length; i++) {
			if (c[i].equals(d)) {
				
				System.out.println(d);
			}
			
		}
	}

}
