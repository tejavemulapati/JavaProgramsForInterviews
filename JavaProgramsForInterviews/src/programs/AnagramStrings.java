package programs;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		//If the first string is ABC, second string should be formed with the same characters
		//present inside the first string, then its called Anagram.
		
		//Logic- Write a boolean method to check if length is same after converting into char array
		//sort the array, if length is equal, compare all elements in the array.		
		
		System.out.println(checkAnagram("ABC","CAB"));
	}
	
	public static boolean checkAnagram(String first_string, String second_string) {
		char firstStringcharArray[] = first_string.toCharArray();
		char secondStringcharArray[] = second_string.toCharArray();
		if(firstStringcharArray.length!=secondStringcharArray.length) {
			System.out.println("Length is not equal, not Anagram");
			return false;
		}
		Arrays.sort(firstStringcharArray);
		Arrays.sort(secondStringcharArray);
		
		for(int i=0;i<firstStringcharArray.length; i++) {
			if(firstStringcharArray[i]!=secondStringcharArray[i]);
				return false;
		}
		return true;
	}

}
