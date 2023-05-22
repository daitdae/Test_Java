import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest_01 {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("song1.txt");
			while(true) {
				int data = fr.read();
				if(data < 0 ) break;
				System.out.print((char)data);
			} 
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
