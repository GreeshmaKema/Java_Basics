package sample;

public class Override_Child extends Override_parent{
//overriding method
	public void car_color()
	{
		System.out.println(" My Car color is silver in child method");
	}
	
	//to use parent class method
	public void parentMethod()
	{
		super.car_color();
	}
	
	public static void main(String[] args) {
		Override_Child oc= new  Override_Child();
		 oc.car_color();
		 oc.parentMethod();

	}

}
