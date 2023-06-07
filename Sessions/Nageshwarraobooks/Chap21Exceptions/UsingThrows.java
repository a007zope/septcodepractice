package Chap21Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingThrows {

	private String name;

	void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name:");

		name = br.readLine();		
	}

	void display()
	{
		System.out.println("Name:"+name);
	}



}
