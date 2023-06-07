package Chap18AbstractClass;

public abstract class Plan {


	/**
	 * WAP to write an abstract class with an instance variable rate, a concrete method getRate()
	 * and an abstract method calculateBill()
	 */

	protected double rate;
	
	/*
	 * public Plan(double rate) { this.rate = rate;
	 * 
	 * }
	 */

	public abstract double getRate();

	public void calculateBill(int units, double rate)
	{
		System.out.println(" the calculated bill is "+rate*units);

	}



}
