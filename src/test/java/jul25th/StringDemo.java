package jul25th;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {

	public static void main(String[] args) {
		
		
		findNoOfOccuranceOfEachCharacter("Hotel Application has 2 builds");

	}

	private static void findNoOfOccuranceOfEachCharacter(String str) {
		
		
		char[]  allChars=str.toCharArray();
		
		Map<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<allChars.length;i++)
		{
			
			if(hMap.containsKey(allChars[i]))
			{
				hMap.put(allChars[i], hMap.get(allChars[i])+1);
			}
			else
			{
				hMap.put(allChars[i], 1);
			}
			
		}
		
		System.out.println(hMap);
		
	}

}
