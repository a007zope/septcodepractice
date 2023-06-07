package Abstraction;

public interface Car {
	
	/**
	 * In interface there is no method body, Only method declaration
	 * We can achieve 100 % abstraction through the use of interface
	 * methods in interface are by default abstract in nature so no need of writing keyword abstract
	 * with method name
	 * 
	 * can not create the object of interface
	 * 
	 * Only final and static variables are defined ie by default the variable declared is static and final
	 */
	
	
	
int wheel = 4;

	public void start();
	public void stop();
	public void refuel();
	
	default void NamingConventionsForCar()
	{
		System.out.println("car name should be in camelCase Format");
		
	}
	
	

}
