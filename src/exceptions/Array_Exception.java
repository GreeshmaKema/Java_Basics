package exceptions;

public class Array_Exception {

	public static void main(String[] args) {
		try {
	         String lang[]= {"Selenium", "Java", "Python", "Ruby"};
	         System.out.println("Nth value is : "+lang[6]);
		} catch (Exception e) {
            System.out.println("Please enter values less than or equal to 3");
            e.printStackTrace();
            //unchecked or runtime exceptions
	}
		
	}
}
