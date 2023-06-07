package Chap18AbstractClass;

public class Maruti extends Car {

	public Maruti(int r) {
		super(r);

	}
	
	void registrationNum(int r)
	{
		System.out.println("registration number is"+r);

	}

	@Override
	void braking() {
		System.out.println("Maruti braking");
		
	}

	@Override
	void carType() {
		System.out.println("Maruti hatchback");
		
	}

	@Override
	void speedLimit(int sl) {
		
		System.out.println("speedlimit of santro is"+sl);
		
	}
	
	
	
	

}
