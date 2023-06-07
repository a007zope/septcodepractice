package OtherPrograms;

public class SwapWithoutThirdVariable {


	public static void main(String[] args) {

		int x =5;
		int y =10;
		int t ;

		/*
		 *  Approach 1 ) using + operator
		 */
		//
		//		x =x+y;//15
		//		y = x-y;//5
		//		x=x-y;//10
		//		
		//		System.out.println(x);
		//		System.out.println(y);
		//		


		/*
		 * Approach 2 ) using * operator
		 */

		//		x =x*y;//15
		//		y = x/y;//5
		//		x=x/y;//10
		//		
		//		System.out.println(x);
		//		System.out.println(y);
		//		


		/*
		 * Approach 3) using XOR operator ^ bitwise conversion
		 */

		x = x^y;// 15 --> 1111
		y = x^y;// 10  --> 1010
		x =x^y; // 5 --> 0101

		System.out.println(x);
		System.out.println(y);


	}

}
