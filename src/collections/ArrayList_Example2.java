package collections;

import java.util.ArrayList;

public class ArrayList_Example2 {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<>();
	     //add values to array list
         al.add("java");
         al.add("C");
         al.add("C++");
         al.add("Python");
         for(int i=0; i<al.size(); i++) {
        	 System.out.println("Values in arraylist : "+al.size());
         }
         //print values using for each loop
         for(String value : al) {
        	 System.out.println("Values using foreach loop :"+value);
         }

	}

}
