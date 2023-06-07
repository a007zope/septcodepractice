package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsArrayUsingHashSet {
	
	public static void main(String[] args) {
		
		String [] languageName = {"Java","python","Javascript","ruby","Python","Java"};
		
		Set<String> langSet = new HashSet<String>();
		
		for(String l:languageName)
		{
			if(langSet.add(l)==false)
			{
				System.out.println("duplicate element is"+" "+l);
				
			}
		}
		
		
		
		
		
		
	}

}
