
public class PalindromeForString {
	
	/*
	 * use the logic of reversing the string for palindrome and then compare the
	 * reversed string with that of original
	 */

	public static void  isPalindromeString(String n)
	{

		String rev ="";
		int len = n.length()-1;

		for(int i =len;i>=0;i--)
		{
       	rev = rev +n.charAt(i);
		}
		
		System.out.println(" The reversed String is "+ rev);
		
		if(rev==n)
		{
		System.out.println("Given String is a palindrome");
		}
		else
		{
			System.out.println("String is non-palindrome");
		}
	}

	public static void main(String[] args) {

		isPalindromeString("Aditya");
		isPalindromeString("teet");


	}


}
