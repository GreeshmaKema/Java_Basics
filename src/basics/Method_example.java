package basics;

public class Method_example {
public void addition() {
	System.out.println("addition of two numbers:"+(5+7));
}
public static void main(String[] args) {
	System.out.println("this is example for method");
	//create an object for class
	//step1 create a variable for class
	//step2 use new keyword
	//step3 use constructor-same as your class name nut a method
	Method_example me=new Method_example();
	me.addition();
	me.multiplication();
}
public void multiplication() {
	System.out.println("multiplication of two numbers:"+(4*5));
}
}
