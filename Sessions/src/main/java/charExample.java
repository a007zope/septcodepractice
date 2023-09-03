
public class charExample {

	public static char lostChar(String stringSent, String stringReceive)
	{
		char s ='t';
		
		for(int i =0;i<stringSent.length();i++)
		{
			for(int j =0;j<stringReceive.length();j++)
			{
				if((stringSent.charAt(i))!=(stringReceive.charAt(j)))
				{
					return stringSent.charAt(i);
				}
			}			
		}

		return s;
	}

	public static void main(String [] args)
	{
		System.out.println(lostChar("aaaaa","aagaa"));
	}
}
