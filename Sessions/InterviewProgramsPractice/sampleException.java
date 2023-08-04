import java.io.IOException;

public class sampleException {
	
	
	public static void main(String[] args) throws Exception {
		
		m1();
	}
	
	public static void m1() throws Exception 
	{
		System.out.println("IO Exception");
		int a = 34, b =45;
		
		int c = a+b;
		System.out.println(c);	
		m2();
	}
	

		public static void m2() throws Exception
		{
			try
			{
				throw new OwnException("grounded Exception");
				
				
			}
			finally
			{
				System.out.println("resources closed successfully");
				
			}
			
		}
			
}


