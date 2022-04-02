package oops;

public class Pvr_grandchild extends Pvr_child {
public void games() {
	System.out.println("games are available");
}
	public static void main(String[] args) {
		Pvr_grandchild pgc=new Pvr_grandchild();
		pgc.games();
		pgc.shopping();
		pgc.parking();
		pgc.ticketbooking();
		//This is called multi level inheritance.
		//Pvr_grandchild will get methods from Pvr_child and Theatre_parent

	}

}
