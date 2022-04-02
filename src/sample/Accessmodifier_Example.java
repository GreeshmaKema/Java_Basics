package sample;

public class Accessmodifier_Example {
//if we do not mention any access modifier then it is default
  void default_method()
  {
	  System.out.println("Example for default access modifier");
  }
  public void public_method()
  {
	  System.out.println("Example for public access modifier");
  }
  private void private_method()
  {
	  System.out.println("Example for private access modifier");
  }
  protected void protected_method()
  {
	  System.out.println("Example for protected access modifier");
  }
	public static void main(String[] args) {
		Accessmodifier_Example ae= new Accessmodifier_Example();
		ae.default_method();
		ae.public_method();
		ae.private_method();
		ae.protected_method();

	}

}
