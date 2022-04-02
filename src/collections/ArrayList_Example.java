package collections;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
	     ArrayList<String> al = new ArrayList<>();
	     //add values to array list
         al.add("java");
         al.add("C");
         al.add("C++");
         al.add("Python");
         //get number of values in array list
         System.out.println("Number of values in arraylist : "+al.size());
         //add some values in array list
         al.add("ruby");
         al.add("html");
         //get number of values in array list
         System.out.println("Number of values in arraylist after adding : "+al.size());
         //delete values from arraylist
         al.remove(1);
         System.out.println("Number of values in arraylist after deleting : "+al.size());
         //arraylist will allow duplicate values
         al.add("java");
         System.out.println("Number of values in arraylist after adding duplicate value : "+al.size());
         //get specific value
         System.out.println("Get 3rd values from array list :"+al.get(2));
	}
}
