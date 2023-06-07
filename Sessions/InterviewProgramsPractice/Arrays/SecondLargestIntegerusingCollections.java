package Arrays;
import java.util.*;

public class SecondLargestIntegerusingCollections {

	/**
	 * Here,we use set for avoiding duplicates and 
	 * we just return the second last element as we know set store in sorted order.
	 * @param args
	 */


	public static void main(String[] args) {


		// basic declaration and addition of elements in an array
		int h[] = {1,3,4,4,5,6,7,7};

		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}



		Integer number[] = {56,67,68,89,98,34};

		List<Integer> v = new ArrayList<>(Arrays.asList(number));

		//given ArrayList
		//List<Integer> v = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1));
		//inserting all the elements from ArrayList v to TreeSet s.
		Set<Integer> s = new TreeSet<>(v);
		//clear the ArrayList.
		v.clear();
		//insert all elements back in ArrayList in sorted order.
		for (int value : s) {
			v.add(value);
		}
		//the size of updated ArrayList.
		int n = v.size();
		//printing the second largest element in ArrayList.
		System.out.print("The Second Largest Element in ArrayList is: ");
		System.out.println(v.get(n-2));
	}
}



