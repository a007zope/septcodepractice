package Chap21Exceptions;

public class UsingThrowsClauseNullPointer {	
	
	/*
	 * WAP that shows the use of throw clause for throwing null pointer exception
	 */
	static void demo()
	{
		
		try
		{
			System.out.println("Inside demo()");
			
			throw new NullPointerException("Exception data");
		}
		
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		
		
	}

}
