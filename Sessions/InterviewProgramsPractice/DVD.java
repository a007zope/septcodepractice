
public class DVD {

	// The actual code for creating an Array to hold DVD's.
	static DVD[] dvdCollection = new DVD[15];

	// A simple definition for a DVD.

	public String name;
	public int releaseYear;
	public String director;

	public static void main(String[] args) {

// Firstly, we need to actually create a DVD object for The Avengers.
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

		DVD TheHoul = new DVD("THE HOWL", 2013, "lisa martin");

		DVD Agabaiarechya = new DVD("Agabaiarechya", 2010, "vasant deshmukh");

		DVD FUlrani = new DVD("Fulrani", 2011, "prashant ghatke");

		DVD Dhoom = new DVD("Dhoom", 2003, "yash chopra");

		// Next, we'll put it into the 8th place of the Array. Remember, because we
		// started numbering from 0, the index we want is 7.
		dvdCollection[14] = avengersDVD;
		dvdCollection[5] = Agabaiarechya;
		dvdCollection[6] = FUlrani;
		dvdCollection[8] = Dhoom;
		dvdCollection[9] = TheHoul;

		for (DVD f : dvdCollection) {
			System.out.println(f);
		}
	}

	public DVD(String name, int releaseYear, String director) {
	        this.name = name;
	        this.releaseYear = releaseYear;
	        this.director = director;
	    }

 public String toString() { 
	 return this.name + ", directed by " +this.director + ", released in " + this.releaseYear; }
  
 }
 
