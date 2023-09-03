
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

	public static void getPrimeNumbers(int num)
	{
		for(int i =2;i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// prime number is special number which can be divided by itself or 1.
		System.out.println("2 is prime number" +" "+ isPrimeNumber(1));
		System.out.println("4 is prime number" +" "+isPrimeNumber(4));
		System.out.println("5 is prime number" +" "+ isPrimeNumber(5));
		System.out.println("3 is prime number" +" "+ isPrimeNumber(3));
		getPrimeNumbers(7);
		getPrimeNumbers(25);
	}
}
