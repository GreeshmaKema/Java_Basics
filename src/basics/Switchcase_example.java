package basics;

public class Switchcase_example {

	public static void main(String[] args) {
		String day="Tuesday";
		switch(day) {
		case "Monday":
			System.out.println("play chess");
			break;
		case "Tuesday":
			System.out.println("play cricket");
			break;
		case "Wednesday":
			System.out.println("play soccer");
			break;
		case "Thursday":
			System.out.println("play baseball");
			break;
		case "Friday":
			System.out.println("play carroms");
			break;
		case "Saturday":
			System.out.println("play rugby");
			break;
			default:
				System.out.println("Today no games");
				break;
		}

	}

}
