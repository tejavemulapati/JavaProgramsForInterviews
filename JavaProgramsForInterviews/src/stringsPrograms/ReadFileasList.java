package stringsPrograms;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.*;


public class ReadFileasList {
	
	public void readfiles(String file_path ) {
		List<String> listobj = Collections.emptyList();
		try {
			listobj = Files.readAllLines(Paths.get(file_path), StandardCharsets.UTF_8);
		}catch(IOException e) {
			System.out.println("Input/output Exception occured");
		}
		Iterator<String> it = listobj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		ReadFileasList ReadFileList_obj = new ReadFileasList();
		ReadFileList_obj.readfiles("C:\\Users\\Teja\\git\\JavaProgramsForInterviews\\JavaProgramsForInterviews\\src\\resources\\input.txt");
	}

}
