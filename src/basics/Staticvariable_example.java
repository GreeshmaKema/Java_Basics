package basics;

public class Staticvariable_example {
static int i=10;static int j=12;
//variables declared inside the class with a keyword static, those are called static or class variables.
public void multiplication() {
	System.out.println("multiplication of two numbers:"+(i*j));
	//static variables can be used in any method.
}
	public static void main(String[] args) {
		System.out.println("multiplication of two numbers:"+(i*j));
		//static variables can also be used in main method.

	}

}
