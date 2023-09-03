
public class Car {
	/*
	 * We Cannot override static method but can overload static method
	 */
	
	//Method Hiding
	public static void start()
	{
	System.out.println("car---Start");	
	}
	
	public void stop()
	{
		System.out.println("car---Stop");	
		
	}
	public void refuel()
	{
		System.out.println("car---Refuel");		
	}
}
