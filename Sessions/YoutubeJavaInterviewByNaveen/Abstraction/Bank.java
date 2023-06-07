package Abstraction;

public abstract class Bank {
	
	/**
	 * atleast one method should b ethere which is abstract 
	 * abstract means no method body only declaration
	 * abstraction means to hide the implementation logic
	 * 
	 * Through use of abstract class we are implementing partial abstraction 
	 * as we have loan method which is abstract but at the same time we have
	 * credit and debit method which are common to all hence we say partial abstraction
	 * 
	 * Abstract class can have abstract as well as non abstract methods
	 * 
	 * Cannot create the object of abstract classes
	 * 
	 *can define static and final variable in abstract class
	 */
	
	int amt = 100;
	final int rate = 10;
	static int loanRate =5;
	
	public abstract void loan();//abstract method --no method body
	
	//non-abstract methods
	public void credit()
	{
		System.out.println("Bank-----credit");
	}
	
	public void debit()
	{
		System.out.println("Bank-----debit");
	}
	
	

	
	
}
