package HashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CreateconcurrentHashMap {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String,String> concurrentMap = new ConcurrentHashMap<String,String>();
		
		concurrentMap.put("1","Aditya");
		concurrentMap.put("2","Zope");
		concurrentMap.put("3","Sanjay");
		concurrentMap.put("4","Patil");
		concurrentMap.put("5","Shantaram");
		concurrentMap.put("6","Julie");
		
		Iterator<String> it = concurrentMap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key =it.next();
			String value = concurrentMap.get(key);
		System.out.println("the key is"+key+"and the value is"+value);
		}
		
		
	}

}
