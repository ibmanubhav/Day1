import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	public static void main(String[] args) {
	//	demo1();
		readingline();
		
	
	}
	private static void readingline() {
		try {
			Reader reader = new FileReader("./Input.txt");
			BufferedReader bufferreader = new Bufferreader(reader);
		}
	}
	private static void demo1() {
		try {
			Reader reader = new FileReader("Input.txt");
			int character = reader.read();
			while(character != -1) {
				System.out.println((char)character);
				character = reader.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
