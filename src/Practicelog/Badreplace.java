package Practicelog;

public class Badreplace {
	public static void main(String[] args) {
		String str="Rama is a good boy";
		str.toLowerCase();
		char[] ch=str.toCharArray();
		for (int i = 0;i<ch.length; i++) {
		
				
		 str.replaceAll("bad", "good");
		   
				
			
			System.out.print(ch[i]);
			
		}
		
	}

}
