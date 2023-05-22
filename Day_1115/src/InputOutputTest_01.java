import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputTest_01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		File file = new File("song.txt");

		if(!file.exists()) {								//파일 유무 확인
			System.out.println("파일이 존재하지않습니다");
			return;
		}
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream("copy.txt");
			int data;
			while(true) {
				data = fis.read();
				if(data==-1) break;
				
				fos.write(data);
			}

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("복사 완료");


	}

}
