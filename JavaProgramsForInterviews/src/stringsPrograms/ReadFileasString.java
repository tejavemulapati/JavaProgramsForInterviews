package stringsPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileasString {
	
	public void readFileasString(String file_path) {
		String fileinput = "";
		try {
		fileinput = new String(Files.readAllBytes(Paths.get(file_path)));
		}catch(IOException e) {
			System.out.println("Input/output error occured for file operation");
		}
		System.out.println(fileinput);
	}
	public static void main(String[] args) {
		ReadFileasString ReadFileasString_obj = new ReadFileasString();
		ReadFileasString_obj.readFileasString("C:\\Users\\Teja\\git\\JavaProgramsForInterviews\\JavaProgramsForInterviews\\src\\resources\\input.txt");
	}

}
