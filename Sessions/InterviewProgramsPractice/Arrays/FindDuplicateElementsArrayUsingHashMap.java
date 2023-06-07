package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsArrayUsingHashMap {
	
	public static void main(String[] args) {
		
		String [] languageName = {"Java","python","Javascript","ruby","python","Java"};
		
		Map<String,Integer> languageMap =new HashMap<String,Integer>();
		
		// To put the values in a HashMap
		
		for(String lang :languageName)
		{
			Integer count =languageMap.get(lang);
			
			if(count ==null)
			{
			  languageMap.put(lang,1);
			}
			
			else
			{
				languageMap.put(lang, ++count);
			}
		}
			//To retrieve the values in a HashMap				
		Set<Entry<String,Integer>> entrySet = languageMap.entrySet();
		
		for(Entry<String,Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("duplicate element is"+" "+entry.getKey());
			}
		}		
	}
}
