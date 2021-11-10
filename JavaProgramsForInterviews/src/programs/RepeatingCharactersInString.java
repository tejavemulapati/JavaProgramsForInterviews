package programs;

public class RepeatingCharactersInString {

	public static void main(String[] args) {
		//Ex-POWERSTORE
		//1)Convert the string into char array
		//2)Use 2 loops, in 1st loop iterate through char array
		//3)In 2nd loop, will compare the selected character with rest of chars in the string
		//4)If Match found, increase the count by 1 & set duplicates of char by 0
		//to mark them visited, after 2nd loop if count of char is >=1 then it has
		//duplicates in the string

		String input_string = "This is a string";
		int count = 0;
		int number_of_times =0;
		String string_allsmall1= (input_string.toLowerCase());
		String string_allsmall = string_allsmall1.replaceAll("\\s+", "");
		char char_array[] = string_allsmall.toCharArray();
		for(int i=0;i<char_array.length;i++) {
			count =1;
			for (int j=i+1;j<char_array.length;j++) {
				if(char_array[i]==char_array[j] && char_array[i]!=' ') {
					number_of_times = count++;
					char_array[j]='0';
				}
			}
			
			if(count>=1 && char_array[i]!='0') {
				System.out.println(char_array[i]+" has occured "+number_of_times);
			}
		}
		

		
	}

}
