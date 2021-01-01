

import java.util.HashMap;
import java.util.Map;

public class j21_Map {

	public static void main(String[] args) {

		Map<String, String> fruits = new HashMap<>();
		fruits.put("red", "apple");
		fruits.put("yellow", "banana");
		fruits.put("white", "radish");
		fruits.put("green", "apple");
		
		System.out.println(fruits.get("red"));

		for (Map.Entry pairEntry: fruits.entrySet()) {
			System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
		}
	}
}

/*
 *   Map: Interface
 * 		.containsKey("red");
 *		.containsValue("apple");
 *		.size();
 *		.remove("red");
 *		.clear();
 *		.keySet();
 *   Map Properties
 * 		 1. Not ordered
 *       2. "KEY" should be unique
 *       3. "VALUE" can be duplicate
 *
 *   HashMap:
 * 		Class that implements interface Map
 * */
