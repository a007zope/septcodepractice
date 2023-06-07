package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap2ArrayList {

	public static void main(String[] args) {

		HashMap<String,String> compMap = new HashMap<String,String>();

		compMap.put("1","Aditya");
		compMap.put("2","Zope");
		compMap.put("3","Sanjay");
		compMap.put("4","Patil");
		compMap.put("5","Shantaram");
		compMap.put("6","Julie");

		//		Iterator<Entry<String,String>> it = compMap.entrySet().iterator();
		//		 while(it.hasNext())
		//		 {
		//			Entry<String,String> entry = it.next();
		//			
		//			System.out.println(entry.getKey()+"the value is"+entry.getValue());
		//			 
		//		 }

		System.out.println(compMap.keySet());
		System.out.println(compMap.values());

		ArrayList<String> nameList = new ArrayList<String>(compMap.keySet());

		for(String e : nameList)
		{	 
			System.out.println(e);	 
		}
		ArrayList<String> nameList2 = new ArrayList<String>(compMap.values());
		System.out.println(nameList2);

	}

}
