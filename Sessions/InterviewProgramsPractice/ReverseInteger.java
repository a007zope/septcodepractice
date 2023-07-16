
public class ReverseInteger {


	public static void main(String[] args) {
		int number = 13638723;

		//Approach1

		int rev =0; 
		while(number!=0) {
			rev = rev*10 + number%10; 
		number = number/10; }
		System.out.println("reverse number is"+" "+rev);

		//Approach 2 using String Buffer

		//		System.out.println(new StringBuffer(String.valueOf(number)).reverse());
	}
}
