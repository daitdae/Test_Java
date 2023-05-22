import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest_01 {

	public static void main(String[] args) {
		FileWriter fw = null; // close 하는게 중요
		Scanner sc = new Scanner(System.in);
		
		char[] ch = {67, 68, 69, 70, 97, 140};
		
		try {
			fw = new FileWriter(new File("temp.txt"));
			fw.write(ch);
			
//			while(true) {
//				System.out.print("값 입력: ");
//				int value = sc.nextInt();
//				if(value ==-1) break;
//				fw.write(value);
//			} 

			System.out.println("작업종료");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {

					e.printStackTrace();
				} // close
		}

	}

}
