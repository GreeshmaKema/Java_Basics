package basics;

import sample.Accessmodifier_Example;

public class Am_Outside extends Accessmodifier_Example {

	public static void main(String[] args) {
	Accessmodifier_Example ae= new Accessmodifier_Example();
	//ae.default method(); 
	//default method cannot be accessed outside the package
	ae.public_method(); //public can be accessed outside the package
	//ae.private_method(); //private can't be accessed outside package
   //ae.protected_method();//it should have parent and child relation
	
	Am_Outside ao= new Am_Outside();
	ao.protected_method();

	}

}
