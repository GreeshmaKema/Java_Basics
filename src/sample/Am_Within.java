package sample;

public class Am_Within {

	public static void main(String[] args) {
		Accessmodifier_Example ae= new Accessmodifier_Example();
		ae.default_method();
		//default method is accessible with in  package
       ae.public_method(); //public can be accessed with in package
       //ae.private_method(); //private can't be accessed with in package
       ae.protected_method();

	}

}
