package Chap21Exceptions;

public class MyExceptionUserDefined extends Exception {

	/**
	 * Write a program to throw user defined exception
	 */

	private static int accNo[] = {1001,1002,1003,1004,1005};

	private static String name[] = {"Raja rao","Rama rao","Sabha rao","Appa rao","Laxmi devi"};

	private static double bal[] = {10000.00,12000.00,5600.50,999.00,1100.55};

	//default constructor
	MyExceptionUserDefined()
	{

	}
	//Paramterized constructor
	MyExceptionUserDefined(String str)
	{
		super(str);
	}

	public static void main(String[] args) {
		try
		{

			System.out.println("accno"+"customer"+"Balance");

			for(int i=0;i<5;i++)
			{
				System.out.println(accNo[i]+" "+name[i]+" "+bal[i]);


				if(bal[i]<1000)
				{
					MyExceptionUserDefined me = new MyExceptionUserDefined("Balance amount is less");
					throw me;

				}

			}
		}
		
		catch(MyExceptionUserDefined e )
		{
			e.printStackTrace();
				
	}
	




	}
















}
