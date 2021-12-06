package stringsPrograms;

import java.util.*;

public class CharacterOccurance {
	
	public static void main(String[] args) {
		character_occurance("bonssai");

	}
	
	public static void character_occurance(String input) {
		/*Need to use Hashmap
		 * We will use for loop to iterate the elements in the string.
		 * put an if condition, then if char already occurs just increase the count.
		 * Declare Haspmap and will try adding each character to hashmap as key,
		 * since key is unique whenever we find duplicate we just increase the value by 1
		 * or else no duplicate then by default the value is one for the character
		*/

		Map<Character,Integer> hmap = new TreeMap<Character, Integer>();
		for(int i=input.length()-1;i>=0;i--) {
			if(hmap.containsKey(input.charAt(i))){
				int count = hmap.get(input.charAt(i));
				hmap.put(input.charAt(i), ++count);
			}else {
				hmap.put(input.charAt(i), 1);
			}
		}
		System.out.println(hmap);
		
	}

}
