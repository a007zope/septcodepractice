package Chap05Operators;

public class PrePostIncre {

	public static void main(String[] args) {	
		int a =1;
		int b =2;
		//a=++b;// a and b =3
		/*first increment the value of b and then assign the value to a*/
	//	a=b++; // 2 and 3 
		/*first assign and then increment the value of b*/
		System.out.println(a +" "+"and"+" "+"value of b is"+" "+b);
		
		
		/*
		 * Find the value of the expression ++k*k++
		 */

		int k =5;
	 //k =++k*k++;
		/*
		 * First increment the value and then multiply and then again the k's value will be incremented
		 */
	 
	// System.out.println(k);
	 k = k++*++k; //5*7
	 /*
	  * k value will be as it is and then will be incremented and then again increment will happen 
	  */
	 System.out.println(k);
	 
	 int j =9;
	 
	 j = j--*j++*--j;//9*8*8
	 
	 System.out.println(j);
	 
	}

}
