import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sublistMethod {
	
	public static void main(String[] args) {
		
		ArrayList<String> companyList = new ArrayList<String>(Arrays.asList("Atos","Facebook","Siemens","Capgemini","Cognizant"));
	
	List<String> selectiveList = companyList.subList(2, 4);
		
		for(String e : selectiveList)
		{
			System.out.println(e);
		}
		
		
	}

}
