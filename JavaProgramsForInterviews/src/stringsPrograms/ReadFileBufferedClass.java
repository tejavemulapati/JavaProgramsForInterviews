package stringsPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedClass {
	
	public void readFile(String filepath) throws IOException {
		BufferedReader br = null;
		try {
		File file_obj = new File(filepath);
		br = new BufferedReader(new FileReader(file_obj));
		String sr;
		while((sr = br.readLine())!=null){
			System.out.println(sr);
		}
		}catch(FileNotFoundException e) {
			System.out.println("File is not found in the location");
		}catch(IOException e) {
			System.out.println("File input/output operation failed");
		}finally{
			if(br!=null)
			br.close();
		}
	}

	public static void main(String[] args) throws IOException {
		ReadFileBufferedClass ReadFile_obj = new ReadFileBufferedClass();
		ReadFile_obj.readFile("C:\\Users\\Teja\\git\\JavaProgramsForInterviews\\JavaProgramsForInterviews\\src\\resources\\input.txt");

	}

}
