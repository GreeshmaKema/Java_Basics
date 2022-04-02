package basics;

public class Methodreturn_example {
public int addition(int a,int b) {
	return (a+b);
}
public void substraction(int x, int y) {
	System.out.println("substraction of two numbers:"+(x-y));
}
	public static void main(String[] args) {
		Methodreturn_example mr=new Methodreturn_example();
	int i=mr.addition(3, 7);
	mr.substraction(i, 5);

	}

}
