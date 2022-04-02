package collections;
 
import java.util.HashMap;

public class HahMap_Example {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(122, "Raju");
		hm.put(123, "Ravi");
		hm.put(125, "Ram");
		System.out.println("Number of values in Hash Map :"+hm.size());
		//add values
		hm.put(130, "Kishore");
		hm.put(135, "Hari");
		System.out.println("Number of values in Hash Map :"+hm.size());
		//delete values
		hm.remove(130);
		//it will not allow duplicate keys
		System.out.println("Number of values in Hash Map after deleting:"+hm.size());
		
	}

}
