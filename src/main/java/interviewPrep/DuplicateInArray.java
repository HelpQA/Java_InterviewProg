package interviewPrep;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "java", "javascript", "ruby", "C", "python", "java"};

		// 1 : but is worst method O(N^2)
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is : " + names[i]);
				}
			}
		}

		System.out.println("********************");

		// 2 : using HashSet : Java Collection : it stores unique value O(n)
		Set<String> strore = new HashSet<String>();
		for (String name : names) {
			if (!strore.add(name)) {
				System.out.println("Duplicate element is : " + name);
			}
		}
		
		System.out.println("********************");
		// 3 Using HashSet
		Map<String,Integer> storeMap = new HashMap<String, Integer>();
		for(String name:names)
		{
			Integer count = storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
		}
		
		//Get values from HashMap 
		Set<java.util.Map.Entry<String,Integer>> entrySet = storeMap.entrySet();
	}

}
