
public class FactorialNumber {

	// factorial of 3 is 3*2*1 = 6
	// fact of 4 is 4*3*2*1 = 24
	// fact of 5 is 5*4*3*2*1 = 120
	// fact of 1 is 1
	//factorial of 0 is 1

	//1  Without recursive 	-- use for loop
	
	public static int factorial(int num)
	{
		int fact =1;

		if(num==0)
			return 1;
		for(int i =1;i<=num;i++)
		{
			fact = fact *i;
		}
		return fact;
	}
	
	
	// 2 With Recursive Function: A function is calling itself 
	
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		
		else
			return(num * fact(num-1));
	}
	
	
	public static void main(String[] args) {

		System.out.println(factorial(4));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		System.out.println(fact(3));
		System.out.println(fact(0));
		

	}

}
