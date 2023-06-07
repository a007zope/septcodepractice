package Chap18AbstractClass;

public class TestCar {

	public static void main(String[] args) {

		santro s = new santro(45676);
		System.out.println(s.regNo);
		s.braking();
		s.carType();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


		Maruti m = new Maruti(45677);
		System.out.println(m.regNo);
		m.braking();
		m.carType();
		m.registrationNum(45687);
		
		/* reference of a super class will only have access 
		 * to those methods which are declared in super class
		 * not to those which are exclusively written for any sub class
		 */

		Car c ;
		c= s;
		c.braking();
		
		c.noOfWheels();





	}

}
