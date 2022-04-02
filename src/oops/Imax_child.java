package oops;

public class Imax_child extends Theatre_parent {
public void foodcourt() {
	System.out.println("foodcourt is available");
}
	public static void main(String[] args) {
		Imax_child ic=new Imax_child();
		ic.foodcourt();
		ic.ticketbooking();
		ic.parking();
//Inheritance is a process where one class acquires the properties of another class.
//The class which inherits the properties of other class is called sub class or child class.
//The class whose properties are inherited is known as super or parent or base class.
//Extends is the keyword used to inherit the properties of parent class.
	}

}
