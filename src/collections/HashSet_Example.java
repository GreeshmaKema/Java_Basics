package collections;

import java.util.HashSet;

public class HashSet_Example {
	
	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<>();
		hs.add("selenium");
		hs.add("sahi");
		hs.add("katalon");
		System.out.println("Number of values in hashset : "+hs.size());
		hs.add("testcomplete");
		hs.add("appium");
		System.out.println("Number of values in hashset after adding : "+hs.size());
		//hash set will not have any index
		//un ordered list
		//it will not allow duplicates
		hs.add("sahi");
		System.out.println("Number of values in hashset after adding duplicate: "+hs.size());
		hs.remove("sahi");
		System.out.println("Number of values in hashset after deleting : "+hs.size());	
		//print values in hashset
		for(String value : hs) {
			System.out.println("values in HashSet using for each:"+value);
		}
	}

}
