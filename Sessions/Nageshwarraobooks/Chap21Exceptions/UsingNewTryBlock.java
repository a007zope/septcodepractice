package Chap21Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingNewTryBlock {
	
/*
 * try(FileInputStream fi = new FileInputStream("ln.txt");
			FileOutputStream fout = new FileOutputStream("out.txt"))
 */
public static void main(String[] args) {
	
	try(FileInputStream fi = new FileInputStream("ln.txt");
			FileOutputStream fout = new FileOutputStream("out.txt"))
	{
		
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
}
