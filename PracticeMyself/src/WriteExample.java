import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("test8.txt");
		
		char[]ch = {'a','b','c'};
		
		writer.write(ch);
		
		writer.flush();
		writer.close();
		
		System.out.println(ch);

	}

}
