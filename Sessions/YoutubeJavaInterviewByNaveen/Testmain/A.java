package Testmain;

public class A {
	
	/*
	 * if we try to call class b main method . We can call it but if we again try to call class A method 
	 * via B class then it will stackoverflow error (java.lang.stackoverflowerror)
	 */
	public static void main(String[] args) {
		System.out.println("main method-A");
		B.main(args);
	}

}

