
public class OwnException extends Exception {
	
	
	public OwnException(String str)
	{
		super(str);
	
	}
	
	public static void main(String[] args) {
	
		OwnException e = new OwnException("new exception thrown successfully");
		e.printStackTrace();
}

}
