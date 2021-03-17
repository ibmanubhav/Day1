import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFiledemo {
	public static void main(String[] args) {
		demo1();
		
	}

	private static void demo1() {
	Writer out;
	try {
		out = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(out);
		bw.write("Writing into a file");
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}

}
