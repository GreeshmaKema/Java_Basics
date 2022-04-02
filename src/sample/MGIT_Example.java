package sample;

public class MGIT_Example extends JNTU_Abstract {
	
public static void main(String[] args) {
	MGIT_Example me= new MGIT_Example();
	me.syllabus();
	me.library();
	me.playground();
}

@Override
public void library() {
	System.out.println("It has big library");
	
}

@Override
public void playground() {
	System.out.println("It has big playground");
	
}
}
