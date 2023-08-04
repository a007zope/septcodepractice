
public class AlternatePostiveAndNegative {
		
	public static int[] reArrange(int []num)
	{
		int pos =0,neg=1;
		
		int t [] = new int[num.length];
		
		for(int i =0;i<num.length;i++)
		{
			if(num[i]>=0)
			{
			  t[pos] =num[i];
			  pos+=2;
			}
			else
			{
				t[neg]=num[i];
				neg+=2;
			}		
		}
	return t;		
	}
		
	public static void main(String[] args) {
		
		int []num = {9,-7,89,-5,8,10,-34,19,-5};
		
		  int []p =  reArrange(num);
		  
		  for(int i =0;i<p.length;i++)
		  {
			  System.out.println(p[i]);
			   }
		
	}

}
