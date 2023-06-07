package Chap18AbstractClass;

public class Different {


	public static void main(String[] args) {


		/* we can provide a reference to abstract class
	even if cannot create an object of the abstract class
	but still we can  pass the value of the subclass Object to that reference.
	Myclass ref;
	Class1 c1 = new Class1(); where class1 is the subclass of Myclass
		ref = c1;
		ref.calculate(2);

		 */
		Myclass ref;

		Class1 c1 = new Class1();
		ref = c1;
		ref.calculate(2);

		Class2 c2 = new Class2();

		c2.calculate(4);

		Class3 c3 = new Class3();
		c3.calculate(2);


	}

}
