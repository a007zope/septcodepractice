package Strings;

public class StringConceptNotes {
		
		/*
 *Case a)Whenever we use new keyword while declaring string 
* then only one object gets created in the heap memory 
* and no record gets created in String constant pool.
 * String h = new String("Selenium");
 * 
*Case b)Whenever we declare string as literal then the record i e string object gets created
 * inside the string constant pool area inside heap memory.
 * String a ="hello java";
 * 
*case c)If the string is already present in the string constant pool then 
* String l = "hello java"; won't create any new object in string constant pool.
 * instead the reference l is pointed to the already available Object in the string
 * constant pool.
 * 
*Case d)Whereas if we create string object using new keyword then 
* it will always create new object even though the same string object is already present 
* inside a heap memory.
 * String h2 = new String("Selenium");
 * 
*
 
Case a
 String h = new String("selenium");// only creates 1 object
 
Case b
 String h1 = "selenium";
 
System.out.println(h==h1);// false 

System.out.println(h.equals(h1));//true
 

Case c :
 String h2 = "selenium";// 0 object creation and h2 will refer the already present string object.
 System.out.println(h1.equals(h2));
 
Case d :
 String h3 = new String("selenium");//1 object will be created successfully in heap 
and will be referred by h3.
 System.out.println(h.equals(h3));

	*/

}
