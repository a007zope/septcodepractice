import java.util.Arrays;

public class LargeSmallInteger {


	public static void main(String[] args) {

		int number [] = {12,34,45,56,67,89,6,7,-19,99};
		
		int smallest = number[0]; //12
		int largest = number[0]; //12

		for(int i =1;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				largest =number[i];
			}

			else if(number[i]<smallest)
			{
				smallest = number[i];
			}
		}

		System.out.println(Arrays.toString(number));

		System.out.println("the largest element is"+largest+" "+"and the smallest element is"+smallest);


	}

}
