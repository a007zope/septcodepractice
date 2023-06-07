package HashMap;

import java.util.*;


/*
 * HashMap comparison based on three approach
 * 1) key-value
 * 2) keys
 * 3) values
 */
public class HashMapCompare {

	public static void main(String[] args) {

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();

		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");

		HashMap<Integer,String> map2 = new HashMap<Integer,String>();

		map2.put(3,"C");
		map2.put(1,"A");
		map2.put(2,"B");

		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(3,"C");
		map3.put(1,"A");
		map3.put(2,"B");
		map3.put(3,"D");

		//1 On the basis of key-value : use equals method

		System.out.println(map1.equals(map2));// true
		System.out.println(map1.equals(map3));//false


		//2 how will you compare if two hashmaps have same keys 
		// compare hashmap for the same keys


		System.out.println(map1.keySet().equals(map2.keySet()));//true

		System.out.println(map1.keySet().equals(map3.keySet()));//true as set will ignore the duplicate values

		//3 Find out the extra keys available 

		HashMap<Integer,String> map4 = new HashMap<Integer,String>();
		map4.put(3,"C");
		map4.put(1,"A");
		map4.put(2,"B");
		map4.put(4,"D");

		// combine the keys from both the maps using : HashSet:
		//add the keyset from map4

		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);





		// 4 Compare maps by Values 


		HashMap<Integer,String> map5 = new HashMap<Integer,String>();

		map5.put(1,"A");
		map5.put(2,"B");
		map5.put(3,"C");

		HashMap<Integer,String> map6 = new HashMap<Integer,String>();

		map6.put(4,"A");
		map6.put(5,"B");
		map6.put(6,"C");

		HashMap<Integer,String> map7 = new HashMap<Integer,String>();
		map7.put(1,"A");
		map7.put(2,"B");
		map7.put(3,"C");
		map7.put(4,"C");
		
		
		// 1 .Duplicates are not allowed  using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList(map6.values())));// true
		
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList(map7.values())));//false
		
		// 2 Duplicates are allowed using HashSet
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));// true
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true
		
		
		
		
		
		
		































	}

}
