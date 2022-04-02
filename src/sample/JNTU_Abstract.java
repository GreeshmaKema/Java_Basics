package sample;

public abstract class JNTU_Abstract {
//we cannot create an object for abstract class
	//Abstract class will have a keyword abstract
	public void syllabus()
	{
		System.out.println("University will provide syllabus");
	}
	//if we use keyword abstract then it will become abstract method
	public abstract void library();
	public abstract void playground();
}
