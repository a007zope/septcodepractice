package Chap18AbstractClass;

public class santro extends Car {

	public santro(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	void registrationNum(int r)
	{
		System.out.println("registration number is"+r);

	}

	void braking() {
		System.out.println("santro braking");

	}


	void carType() {

		System.out.println("santro hatchback");

	}


	void speedLimit(int sl) {

		System.out.println("speedlimit of santro is"+sl);

	}
	
	void autoGearfacility()
	{
		System.out.println(" the system for gear is automatic");
	}





}
