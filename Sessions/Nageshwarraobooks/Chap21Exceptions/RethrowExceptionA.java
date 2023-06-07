package Chap21Exceptions;

public class RethrowExceptionA {
	
	void method()
	{
		try
		{
	String str ="Hello";
	
	char ch =str.charAt(5);
			
		}
		
	catch(StringIndexOutOfBoundsException sie)
		{
		System.out.println("please see the index is within range");
		
		throw sie;// rethrow the exception
		}
		

		
		
		
		
		
		
		
		
		
	}
	
	

}
