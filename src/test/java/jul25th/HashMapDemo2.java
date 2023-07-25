package jul25th;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Developer", "Ravi");
		hMap.put("Tester", "Sam");
		hMap.put("UI Devloper", "Gopi");
		
		System.out.println(hMap);
		

	}

}
