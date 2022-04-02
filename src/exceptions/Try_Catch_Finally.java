package exceptions;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		try {
			int i=10;
			int j=0;
			//start a service
		    System.out.println("Start Service");
			System.out.println("Division of two numbers :"+(i/j));
			
//if there is an exception then control will go to catch block
		} catch(Exception e) {
			System.out.println("Exception occured we are in catch block, Please enter value greater than zero");
			e.printStackTrace();

	}
		finally {
			System.out.println("We are in finally block,Stop service");
		}

} 
}
