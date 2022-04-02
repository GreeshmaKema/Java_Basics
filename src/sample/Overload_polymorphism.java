package sample;

public class Overload_polymorphism {
public  void addition(int i, int j)
{
	System.out.println("Addition of two numbers :"+(i+j));
}
public void addition(int i,int j,int k)
{
	System.out.println("Addition of three numbers :"+(i+j+k));
}
//same method name with different parameters is called overloading.
	public static void main(String[] args) {
		Overload_polymorphism  op =new Overload_polymorphism(); 
			op.addition(2, 4);
	        op.addition(4, 5, 8);

	}

}
