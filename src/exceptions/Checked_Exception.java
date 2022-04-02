package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {
	
    //checked exceptions
	//without executing program exceptions will be known at compilation time
	public static void main(String[] args) throws FileNotFoundException {
	FileReader f = new FileReader("D:/abc.txt");	

	}

}
