package basics;

public class String_example {

	public static void main(String[] args) {
		String language="Java learning";
		System.out.println("number of letters in a string:"+language.length());
		System.out.println("Get fifth letter from the word:"+language.charAt(5));
		System.out.println("Get the position of the letter:"+language.indexOf('g'));
		System.out.println("get the position of word:"+language.indexOf("learning"));
		System.out.println("change the word to upper case letter:"+language.toUpperCase());
		System.out.println("change the word to lower case letter:"+language.toLowerCase());

	}

}
