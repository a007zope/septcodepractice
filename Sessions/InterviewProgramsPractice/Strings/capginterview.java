package Strings;

public class capginterview {
	

	  public static void main(String []args){  
		  
		String st = "JavaTpoi$?@=+nt123456789";  
		
		/*
		 * If special characters are used like below 
		 * 
		 * //$?@=+
		 */
		
		String st3 =st.replaceAll("[^$?@=+]","");
		String st1=st.replaceAll("[^A-Za-z]", "");  
		String st2=st.replaceAll("[^0-9]", "");  
	
		System.out.println("String b = "+st1);  
		System.out.println("Int c = "+st2);  
		System.out.println(st3);
		
		
		     }  
	  }
		
	
