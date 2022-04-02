package oops;

public class Pvr_child extends Theatre_parent {
public void shopping() {
	System.out.println("shopping is available");
}
	public static void main(String[] args) {
		Pvr_child pc=new Pvr_child();
		pc.shopping();
		pc.parking();
		pc.ticketbooking();
		//Parent class can be extended by multiple child class.
		//one class can extend only single class.
		//multiple classes cannot be extended.
		//This inheritance is called single level inheritance.

	}

}
