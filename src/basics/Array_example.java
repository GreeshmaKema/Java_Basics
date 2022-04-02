package basics;

public class Array_example {

	public static void main(String[] args) {
	String languages[]= {"java","Python","C","C++","C#","Ruby"};
	System.out.println("number of values in array:"+languages.length);
	System.out.println("get the third value from array:"+languages[3]);
	for(int i=0;i<languages.length;i++) {
		System.out.println("values in array:"+languages[i]);
	}
	for(int i=0;i<languages.length;i=i+2) {
		System.out.println("values in array with changed condition:"+languages[i]);
	}
	for(String value : languages) {
		System.out.println("values in array using foreach:"+value);
	}
	}
}
