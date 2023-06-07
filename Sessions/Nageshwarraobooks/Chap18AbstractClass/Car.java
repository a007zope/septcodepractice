package Chap18AbstractClass;

public abstract class Car {

	int regNo ;

	public Car(int r )
	{
		regNo =r;
	}

	abstract void braking();

	abstract void carType();
	
	void noOfWheels()
	{
		System.out.println("no of wheels are 4");
	}
	
	abstract void speedLimit(int sl);

}
