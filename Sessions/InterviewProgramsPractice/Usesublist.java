import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Usesublist {


	public static void main(String[] args) {

		ArrayList<String> bigList = new ArrayList<>(Arrays.asList("java","python","javascript","selenium","APi","Postman","Testng"));

		List<String> smallList =bigList.subList(1,5);

		//System.out.println(smallList);

		/*
		 * use of retainAll method
		 */

		ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("java","pythonade","javascriptwaali","seleniumwala","APibatliwala","Postmanlala","Postmanlala"));

		//	employeeList.retainAll(Collections.singleton("Postmanlala"));
		//	System.out.println(employeeList);

		bigList.retainAll(employeeList);
		//		System.out.println(bigList);
		//		System.out.println(employeeList);


		//use of toArray method 

		ArrayList<String> languageList = new ArrayList<>(Arrays.asList("java","pythonade","javascriptwaali","seleniumwala","APibatliwala","Postmanlala","Postmanlala"));

		Object [] p = languageList.toArray();

		String po =    Arrays.toString(p);
		System.out.println(po);

	}



}
