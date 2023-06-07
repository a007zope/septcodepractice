package Strings;

public class StringImmutable {
	 public static void main(String[] args) {
	 String s = "selenium"; // -> creates one Object in SCP
	 String t = s + "Hello";  //-> Again creates a new entry containing seleniumhello object
	 
	/*
	 * Strings are Immutable objects and hence every time it
	 * makes a new entry in String constant pool
	 * selenium will be stored seperate 
	* Seleniumhello will be stored seperate . 
	* No changes wil be made to earlier stored selenium Object
	 * 
	*/
	 System.out.println(t);
	 System.out.println(s);
	 String st ="java";
	 System.out.println(st + "python");
	 System.out.println(st);
	 
	st = st +"Automation";
	 System.out.println(st);//javaAutomation
	 
	String u ="Java";
	 
	//mutable classes
	 //StringBuilder and StringBuffer
	 //StringBuilder is faster than StringBuffer.
	 // for manipulations in string we use stringBuilder class
	 
	StringBuilder sb = new StringBuilder("Testing"); // ->creates one string object named as Testing 
	 System.out.println(sb);
	 sb.append("Automation"); //-> Since StringBuilder is mutable 
	                            // and hence it make changes to the above string testing object.                    
	 System.out.println(sb);
	 
	/*
	 * In the below code there will be two entries created for string 
	* One is for " submit "; 
	* Second one is for pop.trim(); i e "submit"
	 * 
	* 
	*/
	 String pop =" submit ";
	 pop = pop.trim();
	 System.out.println(pop);
	 }
}
