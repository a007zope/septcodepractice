package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateSynchronizedMap {
	
   public static void main(String[] args) {
	   
	   
	   Map<String,String> map1 = new HashMap<String,String>();
		   
	map1.put("1","Naveen");
	map1.put("2","Aditya");
	map1.put("3","Sanjay");
	map1.put("4","Zope");
	map1.put("5","khunteta");
	map1.put("6","AutomationLead");
	
	Map<String,String> syncMap = Collections.synchronizedMap(map1);
	
//	synchronized(syncMap)
//	{
		Iterator<String> it = syncMap.keySet().iterator();
		while(it.hasNext())
		{
		  String key =	it.next();
		  String value = syncMap.get(key);
		  System.out.println("the key is"+key+"and the value is"+value);
			
		}
	}
	
	
}
//}
