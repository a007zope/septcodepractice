
public class charExample2 {

		static char findExtraChar(String s1, String s2)
		{
			int n1 = s1.length();
			int n2 = s2.length();
			int i, j;
			for (i = 0; i < n1; i++) {
				for (j = 0; j < n2; j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						break;
					}
				}
				if (j == n2) {
					return s1.charAt(i);
				}
			}
			return s2.charAt(n2 - 1);
		}
		public static void main(String[] args)
		{
			String s1 = "cbtdae";
			String s2 = "cbda";
			System.out.println(findExtraChar(s1, s2));
		}
	}



