package geekforgeeksEasy;

/*
 * Given a string S as input. Delete the characters at odd indices of the string.
 * Input: S = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1
and "k" at index 3.
 */

public class DeleteAlternativeCharcters {

	public static void main(String[] args) {
		System.out.println(delAlternate("Geeks"));

	}
	
	public static String delAlternate(String S) {
        String b="";
        for(int i=0;i<S.length();i++){
            b = b + S.charAt(i);
            i = i+1;
        }
        return b;
    }

}
