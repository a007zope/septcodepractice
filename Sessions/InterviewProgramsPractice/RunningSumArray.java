
public class RunningSumArray {

	/** printing sum of 1D elements in an array
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int number[] = {1,2,3,4,5,6};

		for(int i =1;i<number.length;i++)
		{

			number[i]  = number[i] +number[i-1];

			System.out.println(number[i]);
		}








	}
}


