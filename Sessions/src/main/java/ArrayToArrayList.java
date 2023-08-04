import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String [] nameList = {"Aditya","Shubham","Sanjay"};
		
		//List al = Arrays.asList(nameList);
		
		//System.out.println(al);
//		
//		al.add("Shivank");
//		al.add("Rahul");
//		al.add("Rakesh");
//		System.out.println(al);
		
		List<String> nl = new ArrayList<>();
		
  Collections.addAll(nl, nameList);
	
System.out.println(nl);
		
//		for(int i =0;i<nameList.length;i++)
//		{
//			nl.add(nameList[i]);
//		}
//		
//		System.out.println(nl);
//		
//	
	}

}
