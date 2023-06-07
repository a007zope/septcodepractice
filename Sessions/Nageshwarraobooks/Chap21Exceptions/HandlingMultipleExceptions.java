package Chap21Exceptions;

public class HandlingMultipleExceptions {

	public static void main(String[] args) {
	
		try
		{
			//open the files 

			System.out.println("print files ");

			// do some processing 

			int n = args.length;

			System.out.println("n="+n);

			int a =45/n;

			System.out.println("a="+a);
			
			int b[] = {10,20,30};
			b[50] = 100;

			
		}

		catch(ArithmeticException ae)
		{
			// display the exception data 

			System.out.println(ae);

			// display the message to the user
			System.out.println("Please pass the data while running the program");									
		}
		
		catch(ArrayIndexOutOfBoundsException aie)
		{
			// display exception details 
			aie.printStackTrace();
			
			// display message to the user
			System.out.println("Please see the array index is within range");
		}

		finally
		{
			//close the files 

			System.out.println("close the files");

		}
		
		
		

	}

}
