import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListIteration {

	public static void main(String[] args) {


		ArrayList<String> tvSeries = new ArrayList<>();

		tvSeries.add("GameOfThrones");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("Breaking Bad");


		//1 Using java 8 foreach loop and lambda expressions

		System.out.println("---------------print using for each with lamda in Java 8------------------");

		tvSeries.forEach(shows->{

			System.out.println(shows);
		});






		System.out.println("---------------print using Iterator------------------");

		//2 Using Iterator

		Iterator<String>it =	tvSeries.iterator();

		while(it.hasNext())
		{
			String shows =	it.next();

			System.out.println(shows);

		}




		//3  using iterator and java 8 lambda forEachRemaining() method

		System.out.println("---------------print using Iterator and java 8 forEachRemaining() method------------------");

		it = tvSeries.iterator();
		it.forEachRemaining(show ->{
			System.out.println(show);
		});




		//4 . using for each loop

		System.out.println("-----Print using for each loop-----");
		for(String show:tvSeries)
		{
			System.out.println(show);
		}




		// 5 using for loop with order/index

		System.out.println("-----Print using for loop with order/index-----"); 

		for(int i=0;i<tvSeries.size();i++)
		{
			System.out.println(tvSeries.get(i));
		}




		// 6 using a listIterator() and to traverse in both the directions

		System.out.println("-----Print using a listIterator() to traverse in both the directions-----"); 

		ListIterator<String> tvSeriesListIterator =  tvSeries.listIterator(tvSeries.size());

		while(tvSeriesListIterator.hasPrevious())
		{
			String show =tvSeriesListIterator.previous();
			System.out.println(show);
		}










	}
}

