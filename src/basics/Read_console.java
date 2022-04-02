package basics;

import java.util.Scanner;

public class Read_console {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter employee name:");
	String empname=s.nextLine();
	System.out.println("Enter employee id:");
	int empid=s.nextInt();
	System.out.println("Employee name is:"+empname);
	System.out.println("Employee id is:"+empid);

	}

}
