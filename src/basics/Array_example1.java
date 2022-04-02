package basics;

public class Array_example1 {

	public static void main(String[] args) {
		int marks[]= {20,30,40,45,55,65,78};
		for(int i=0;i<marks.length;i++) {
			System.out.println("marks are:"+marks[i]);
		}
		for(int i : marks) {
			System.out.println("marks using foreachloop:"+i);
		}

	}

}
