package exceptions;

public class Arthmetic_Example {

	public static void main(String[] args) {
		try {
		int i=10;
		int j=0;
		System.out.println("Division of two numbers :"+(i/j));

	} catch(Exception e) {
		System.out.println("Please enter value greater than zero");
		e.printStackTrace();
	}

  }
	
}
