package Chap21Exceptions;

public class RethrowExceptionB {

	public static void main(String[] args) {

		RethrowExceptionA a = new RethrowExceptionA();
		
		try
		{
			a.method();
		}
		
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("I caught rethrown exception");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
