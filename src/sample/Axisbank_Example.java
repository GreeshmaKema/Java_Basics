package sample;

public class Axisbank_Example implements RBI_Interface {
	
 public void Personalloan()
 {
	 System.out.println("Axis bank provides personal loan");
 }
	public static void main(String[] args) {
		Axisbank_Example ae= new Axisbank_Example();
		ae.deposit();//interface method
		ae.withdraw();//interface method
		ae.Personalloan();
		ae.homeloan();
	}	
	@Override
	public void withdraw() {
	System.out.println("Withdraw limit is 50k per day");
		
	}
	@Override
	public void deposit() {
		System.out.println("Withdraw limit is 100k per day");
		
	}
	@Override
	public void homeloan() {
		System.out.println("This bank will provide home loan");
		
	}

}
