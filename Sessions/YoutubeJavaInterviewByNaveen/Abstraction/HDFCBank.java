package Abstraction;

public  class HDFCBank extends Bank {
	
	
	/**
	 * Whenever we extend any abstract class then its the responsibility of the child class 
	 * to provide the implementation to the abstract method of the parent class
	 * 
	 * There is  no need to define other methods .HDFCBank can directly inherit those methods from
	 * parent class.
	 * 
	 *
	 */
	
	public void loan()
	{
		System.out.println("HDFC --Loan method");
	}
	
	public void funds()
	{
		System.out.println("HDFC--FUNDS");
	}
}
