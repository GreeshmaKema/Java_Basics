package sample;

public class Override_parent {

	//this is overridden method(because child class is 
	public void car_color()
	{
		System.out.println("Car color is black in parent class");
	}
// child class method is already present in parent class then its method overriding	
	public static void main(String[] args) {
		Override_parent op= new Override_parent();
		op.car_color();
	}

}
