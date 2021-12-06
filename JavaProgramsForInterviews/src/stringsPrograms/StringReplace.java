package stringsPrograms;

public class StringReplace {

	public static void main(String[] args) {
		String s = "How are you";
		String res[] = s.split(" ");
		String space = " ";
		String final_res = "";
		for(String sa: res) {
			StringBuffer sb = new StringBuffer(sa);
			final_res = final_res + space +sb.reverse().toString();
		}
		System.out.println(final_res);

	}

}
