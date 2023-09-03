package Strings;

public class Stringpool {
	
	public static void main(String[] args) {
		
		String s1 ="Aditya";
		String s2 ="Aditya";
		/*
		 * here s1 and s2 have same value and hence only one record is created in string pool and s1 n s2 are pointed to the value .
		 */
		s2 ="Zope";// once we change the reference value of s2 to zope then a record is created in string pool memory for zope and s2 is pointed to it.
		
		String s3 ="rahul";
		
		System.out.println(s1);
		System.out.println(s2);
	}

}

