
public class StringCogniInterviewQuestion {
	
	public static void main(String[] args) {
			
		String s = "this is the test program";
		
		String rev ="";
		
		int len = s.length();
		
		for(int i =len-1;i>=0;i--)
		{
			rev = rev +s.charAt(i);
		}
		
		System.out.println(rev);
			
	}
}
