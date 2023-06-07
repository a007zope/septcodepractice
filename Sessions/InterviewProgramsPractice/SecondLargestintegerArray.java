import java.util.Arrays;

public class SecondLargestintegerArray {

	public static void main(String[] args) {

		/**
		 * First sort the array and then compare it with the largest element which will 
		 * be present in the last of the array
		 */

		int numbers [] = {12,32,34,45,56,67,78};

		Arrays.sort(numbers);// First sort the array

		//comparing it with the largest element which will 
		//be present in the last of the array
		for(int a =numbers.length-2;a>0;a--)
		{
			if(numbers[a]!=(numbers.length-1))
			{
				System.out.println("the second largest element is"+numbers[a]);
				break;
			}
		}

	}

}
