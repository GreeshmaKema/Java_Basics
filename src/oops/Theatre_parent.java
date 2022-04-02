package oops;

public class Theatre_parent {
public void ticketbooking() {
	System.out.println("ticket booking is available:");
}
public void parking() {
	System.out.println("parking is available:");
}
	public static void main(String[] args) {
	Theatre_parent tp=new Theatre_parent();
	tp.ticketbooking();
	tp.parking();

	}

}
