import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoString {

	public static void main(String[] args)
	{
		String s ="Aditya";
		s = s+" "+"Zope";

		//System.out.println(s);

		s= s.replaceAll(" ","-");
		//System.out.println(s);

		String []splitArray =	s.split("-");
		//System.out.println(splitArray[0]);

		Map<String,String> newMap = new HashMap<String,String>();

		newMap.put(splitArray[0],splitArray[1]);
		newMap.put("Sanjay", "Zope");
		newMap.put("Ankur","Warikoo");
		newMap.put("Akshat","Shrivastava");

		//System.out.println(newMap.get(splitArray[0]));
		// Set<Entry<String,String>> entry =(Set<Entry<String,String>>)newMap.entrySet().iterator();

		/*
		 * Using keySet() method in iterator
		 */
		Iterator<String> it = newMap.keySet().iterator();
		while(it.hasNext())
		{
			//System.out.println(itr.next());
			String key =it.next();

			String value = newMap.get(key);

			//System.out.println("The value of key is"+" "+key+" "+"And its corresponding value is"+" "+value);
		}
		ArrayList<String> newList = new ArrayList<String>();



		/*
		 * Using entrySet() iterator
		 */
		Iterator<Entry<String,String>> it1 = newMap.entrySet().iterator();

		while(it1.hasNext())
		{
			Entry<String,String> entry = it1.next();

			//System.out.println("the value of key is"+" "+entry.getKey()+" "+"the value is"+" "+entry.getValue());
			newList.add(entry.getValue());
			newList.add(entry.getKey());

		}

		for(String e :newList)
		{
			System.out.println(e);
		}

	}


}
