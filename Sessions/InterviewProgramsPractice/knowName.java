
public class knowName {
	
	public static void printName(Object obj)
	{
		Class c =obj.getClass();

		String name = c.getName();

		System.out.println("the name of the class is "+name);



	}

}
