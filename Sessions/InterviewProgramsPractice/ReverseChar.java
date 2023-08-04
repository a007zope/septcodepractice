
public class ReverseChar {	
	public static void main(String[] args) {		
		String s = "this is sample test";
		int i =0;
		int j = s.length()-1;	
	char ch[] =	s.toCharArray();	
		for(;i<=j;)
		{
			char temp;
			temp = ch[i];
			ch[i]= ch[j];
			ch[j]=temp;
			i++;
			j--;			
		}		
		System.out.println(ch);
	}

}
