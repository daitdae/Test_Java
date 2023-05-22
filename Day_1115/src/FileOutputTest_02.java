import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest_02 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file = new File("Temp2.txt");  //Directory,File을 다룸
		byte[]by = {65,78,45,123,-127};

		try {
			//fos = new FileOutputStream(file);
			fos = new FileOutputStream(new File("Temp2.txt"));

			fos.write(by);		//for문 대신 배열에 넣어서 다섯번 돌린다 for문보다 효율적
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos !=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작업종료!!");

	}

}
