package basics;

public class Method_parameter {
public void addition(int a,int b) {
	System.out.println("addition of two numbers:"+(a+b));
}
public void substraction(int a,int b) {
	System.out.println("substraction of two numbers:"+(a-b));
}
	public static void main(String[] args) {
		 Method_parameter mp=new  Method_parameter();
		 mp.addition(4, 5);
         mp.addition(9, 12);
         mp.substraction(9, 6);
         mp.substraction(7, 2);
	}

}
