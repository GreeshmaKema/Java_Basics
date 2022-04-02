package sample;

public class SBI_Example implements RBI_Interface {

	public static void main(String[] args) {
		SBI_Example se= new SBI_Example();
		se.deposit();
		se.withdraw();
		se.homeloan();
	}

	@Override
	public void withdraw() {
	System.out.println("Withdraw limit is 70k");		
	}

	@Override
	public void deposit() {
	System.out.println("Deposit limit is 80k");			
	}

	@Override
	public void homeloan() {
		System.out.println("home loan limit is 50k");
		
	}

}
