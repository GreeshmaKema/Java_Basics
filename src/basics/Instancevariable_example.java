package basics;

public class Instancevariable_example {
int i=3; int j=7;
//variables declared outside the method and inside the class are called instance variable
public void addition() {
	System.out.println("addition of two variables:"+(i+j));
	//instance variables can be used in any method except main method
}
	public static void main(String[] args) {
		//System.out.println("addition of two variables:"+(i+j));
		//instance variables cannot be used in main method.

	}

}
