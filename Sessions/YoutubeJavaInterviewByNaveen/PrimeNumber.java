
public class PrimeNumber {

	// 2 is the lowest prime number

	public static boolean isPrimeNumber(int num)
	{
		//edge/corner cases:
		if(num<=1)
		{
			return false;

		}

		for(int i =2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;

	}


	public static void main(String[] args) {

		// prime number is special number which can be divided by itself or 1.

		System.out.println("2 is prime number"+ isPrimeNumber(1));










	}
}
