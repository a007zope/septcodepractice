import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice1 {


	public static void main(String[] args) {

		HashMap<String,String> countryMap = new HashMap<>();

		countryMap.put("India","Delhi");
		countryMap.put("Germany","Berlin");	
		countryMap.put("US","Newark");
		countryMap.put("UK","London");
		countryMap.put("Russia", null);
		//System.out.println(countryMap.get("Russia"));
		countryMap.put("Russia","putin");
		countryMap.remove("UK");
		//System.out.println(countryMap.get("UK")+" "+countryMap.get("Russia"));


		//using Iterator on keys
		Iterator<String> it =	countryMap.keySet().iterator();
		while(it.hasNext())
		{
			String key =  it.next();

			System.out.println(key);
		}
		
		//using iterator on values 
		
		Iterator<Entry<String,String>> entry =countryMap.entrySet().iterator();
		
		    while(entry.hasNext())
		    {
		    	Entry<String,String> entryit =entry.next();
		    	System.out.println("The key is"+" "+entryit.getKey()+"and the value is"+" "+entryit.getValue());
		    }
		
		



	}

}
