
public class PalindromeNumber {


	/*
	 * Palindrome number is the number which when reversed comes out to be the same number
	 * eg : 151 454 34543 161 78987
	 */


	public static void isPalindromeNumber(int num)
	{
		int r =0;
		int sum =0;
		int t;
		t = num;

		while(num>0)
		{
			r = num%10; // get the remainder
			sum = (sum*10) + r;
			num = num/10;
		}

		if(t==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}


	}


	public static void main(String[] args) {


		isPalindromeNumber(151);
		isPalindromeNumber(152);


	}

}
