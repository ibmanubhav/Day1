import java.io.IOException;

public class ReadFromConsole {
	public static void main(String[] args) {
		byte[] ip = new byte[100];
		try {
			System.in.read(ip);
			System.out.println(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
