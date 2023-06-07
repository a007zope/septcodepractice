import java.util.Arrays;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s = "!@$!@$@#%@#%@#%Aditya is HandSome$#$@#$@#%$#$#$$$$";
		
		s= s.replaceAll("[^a-zA-z0-9]","");
		System.out.println(s);
	}

}
