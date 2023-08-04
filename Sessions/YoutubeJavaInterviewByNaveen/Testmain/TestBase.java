package Testmain;

public class TestBase {
	
	//JVM will call only this method signature
	public static void main(String[] args) {
		System.out.println("main Method-1");
		main("testing");
		main(8,7);
		main(6);
	}
	
	
	public static void main(String args) {
		System.out.println("main Method-2");
	}
	
	
	public static void main(int a , int b) {
		System.out.println("main Method-3");
	}
	

	public static void main(int a ) {
		System.out.println("main Method-4");
	}
	
	
	
	
	
	
	
	

}
