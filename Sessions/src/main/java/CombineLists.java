import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombineLists {


	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();

		l1.add("A");
		l1.add("B");

		List<String> l2 = new ArrayList<>();

		l2.add("C");
		l2.add("D");

		System.out.println(l1.addAll(l2));

		List<String> l3 = new ArrayList<>(l2);

		Collections.sort(l3);

		for(String e : l3)
		{
			System.out.println(e);
		}

	}

}
