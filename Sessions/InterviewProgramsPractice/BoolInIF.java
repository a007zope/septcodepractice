
public class BoolInIF {

	public static void main(String[] args) {

		int i=0;
		if(!(i==2))
		{
			System.out.println("Aditya codes in an awesome way");
		}
		int numbers[] = {1,2,3,4,5,6,7};

		int largest =numbers[0];
		int smallest = numbers[0];

		for(int a=1;a<numbers.length;a++)
		{
			if(numbers[a]>largest)
			{
				largest = numbers[a];
				
			}
			else if (numbers[a]<smallest)
			{
				smallest = numbers[a];
				}				
		}
		System.out.println("Largest number is "+largest);
		System.out.println("smallest number is"+ smallest);

	}

}
