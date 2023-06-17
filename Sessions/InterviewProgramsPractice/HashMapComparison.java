import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {


	public static void main(String[] args) {

		/*
		 * HashMap comparison using below
		 * 1) on the basis of key-value : use equals() method
		 * 2) for the same keys keySet() 
		 * 3) Find out the extra keys
		 * 4) Compare Maps By values
		 */
		
		HashMap<Integer,String> map1 = new HashMap<>();

		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");

		HashMap<Integer,String> map2 = new HashMap<>();

		map2.put(3,"C");
		map2.put(2,"B");
		map2.put(1,"A");

		HashMap<Integer,String> map3 = new HashMap<>();

		map3.put(1,"A");
		map3.put(2,"B");
		map3.put(3,"C");
		map3.put(3,"D");
		
		
		HashMap<Integer,String> map4 = new HashMap<>();

		map4.put(1,"A");
		map4.put(2,"B");
		map4.put(3,"C");
		map4.put(4,"D");
		
		
        // on the basis of key-value
		System.out.println(map1.equals(map3));
		System.out.println(map1.equals(map2));
		
		// for the same keySet()
    System.out.println(map1.keySet().equals(map2.keySet()));
    System.out.println(map1.keySet().equals(map3.keySet()));
    
       
    // find out the extra keys 
    
    HashSet<Integer> combineSet = new HashSet<>(map1.keySet());
    
    combineSet.addAll(map4.keySet());
    combineSet.removeAll(map1.keySet());
    
    System.out.println(combineSet);
    
    // compare Maps by values 
    
    

	HashMap<Integer,String> map5 = new HashMap<>();

	map5.put(1,"A");
	map5.put(2,"B");
	map5.put(3,"C");
	
	HashMap<Integer,String> map6 = new HashMap<>();

	map6.put(4,"A");
	map6.put(5,"B");
	map6.put(6,"C");
	
	HashMap<Integer,String> map7 = new HashMap<>();

	map7.put(1,"A");
	map7.put(2,"B");
	map7.put(3,"C");
	map7.put(4,"C");
	
	// using ArrayList which dont allow duplicate values
	System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<>(map6.values())));// true
	System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<>(map7.values()))); //false
	
	// using HashSet which ignores duplicate values 
	System.out.println(new HashSet<String>(map5.values()).equals(new HashSet<String>(map6.values())));//true 
	System.out.println(new HashSet<String>(map5.values()).equals(new HashSet<String>(map7.values())));// true
	
	
    
    
    
    
    







	}
}
