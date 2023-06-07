package Chap18AbstractClass;

public class TestElectricityBill {
	
	/**
	 * Calculating elec bill using abstract clas concept 
	 * of abstract class Plan,subclass DomesticPlan, CommercialPlan
	 * @param args
	 */

	public static void main(String[] args) {

		Plan p;
		DomesticPlan dp = new DomesticPlan();
		CommercialPlan cp = new CommercialPlan();

		p=dp;// reference of super abstract class which is use to refer a sub class object.
		p.calculateBill(50,p.getRate());
		System.out.println("##########################################");
		cp.calculateBill(100, 5);

	}

}
