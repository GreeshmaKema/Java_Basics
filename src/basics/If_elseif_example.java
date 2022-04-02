package basics;

public class If_elseif_example {

	public static void main(String[] args) {
		int marks=39;
		if(marks>=80) {
			System.out.println("this person is passed in distinction:"+marks);
		}
		else if (marks>=60 && marks<80) {
			System.out.println("this person is passed in first class:"+marks);
		}
		else if(marks>=40 && marks<60) {
			System.out.println("this person is passed in second class:"+marks);
		}
		else {
			System.out.println("this person is failed:"+marks);
		}

	}

}
