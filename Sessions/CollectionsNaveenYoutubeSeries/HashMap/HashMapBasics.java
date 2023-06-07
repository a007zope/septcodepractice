package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		// no order - no indexing 
		// stores value -key -value<k,v>
		// key cannot be duplicate
		// Allows multiple null values but only one null key
		// HashMap is not thread safe or synchronized


		HashMap<String,String> capitalMap = new HashMap<String,String>();

		capitalMap.put("India","Delhi");
		capitalMap.put("UK","London");


		// key cannot be duplicate. it will update with the next value 
		capitalMap.put("USA","Washington DC");
		capitalMap.put("USA","NewArk");

		//Only one null key is allowed
		capitalMap.put(null,"berlin");
		capitalMap.put(null,"moscow");

		//Allows multiple null values
		capitalMap.put("Russia", null);
		capitalMap.put("Ukraine",null);

		
		capitalMap.remove("ukraine");
		
		System.out.println(capitalMap.get("ukraine"));

		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		System.out.println(capitalMap.get("ukraine"));

		//iterator over the keys using keySet()

		Iterator<String> it  = capitalMap.keySet().iterator();

		while(it.hasNext())
		{
			String key=it.next();

			String value = capitalMap.get(key);
			
			System.out.println("key =" + key +" "+ "value ="+ value);
		}
		
		//Iterator over the set(pair): by using entrySet
		
		Iterator<Entry<String,String>> it1 =capitalMap.entrySet().iterator();
		
		while(it1.hasNext())
		{
			
			Entry<String,String> entry =it1.next();
			System.out.println("key is :"+" "+entry.getKey()+" "+"and value is:"+" "+entry.getValue());
			
		}
		
		System.out.println("-----------------------------------------------");
		
		// Iterate hashmap using java 8 for each  and lambda
		capitalMap.forEach((k,v) -> System.out.println("key is :"+k+" "+"value is :"+v));




	}

}
