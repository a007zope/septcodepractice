package Chap21Exceptions;

public class HandlingMultipleExceptionsUsingOR {

	/*
	 * Using the Or operator in catch block for handling multiple exceptions  in catch block 
	 *  catch(ArithmeticException  | ArrayIndexOutOfBoundsException ae)
	 */


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

		catch(ArithmeticException  | ArrayIndexOutOfBoundsException | NullPointerException ae) 
		{
			// display the exception data 

			System.out.println(ae);

			// display the message to the user
			//System.out.println("Please pass the data while running the program");									
		}


		finally
		{
			//close the files 

			System.out.println("close the files");

		}

	}

}
