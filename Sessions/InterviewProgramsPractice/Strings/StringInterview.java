package Strings;

public class StringInterview {
	
	public static void main(String[] args) {
		
		String s ="abcd1$?@23=+4efg";
	
		String s1 =s.replaceAll("[^$?@=+]","");
		String s2 =s.replaceAll("[^A-Za-z]", "");
		String s3 =s.replaceAll("[^0-9]", "");
		
		 

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
			
	}

}
