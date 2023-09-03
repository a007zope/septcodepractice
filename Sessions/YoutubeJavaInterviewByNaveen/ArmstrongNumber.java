
public class ArmstrongNumber {

	// 153 - Armstrong number is a number where The sum of cube of digits of specific number is equal to the same number.
	/*
	 * eg 1*1*1 = 1
	 *    5*5*5 = 125
	 *    3*3*3 = 27
	 *    1+125+27 = 153
	 *    
	 *    407 is also a armstrong number 
	 *    0  and 1 are also a armstrong number 
	 */

	public static void isArmStrongNumber(int num)
	{
		System.out.println("Given number is"+" "+num);
		int cube= 0;
		int r ;
		int t;

		t = num;

		while(num>0)
		{
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}

		if(t==cube)
		{
			System.out.println("This is an Armstrong number");
		}
		else
		{
			System.out.println("this is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		isArmStrongNumber(0);
		isArmStrongNumber(1);
		isArmStrongNumber(155);
	}

}
