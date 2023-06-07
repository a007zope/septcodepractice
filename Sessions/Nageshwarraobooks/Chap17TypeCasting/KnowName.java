package Chap17TypeCasting;

public class KnowName {

	public static  void printName(Object obj)
	{

		Class c =obj.getClass();
		String name =c.getName();

		System.out.println(" the classname ="+name);


	}

}
