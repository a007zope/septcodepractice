package Chap21Exceptions;

public class HandlingException {

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

		}

		catch(ArithmeticException ae)
		{
			// display the exception data 

			System.out.println(ae);

			// display the message to the user
			System.out.println("Please pass the data while running the program");									
		}

		finally
		{
			//close the files 

			System.out.println("close the files");

		}
	}





























	}


