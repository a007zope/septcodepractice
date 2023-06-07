package Strings;

public class StringSwapWithoutThirdVariable {

	public static void main(String[] args) {
		String a ="Hello";
		String b = "World";

		a = a+b;

		b = a.substring(0,a.length()-b.length());

		a = a.substring(b.length());

		System.out.println("the values after swap are "+" "+a);
		System.out.println("the values after swap are "+" "+b);
	}

}
