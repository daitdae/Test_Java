import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest_01 {

	public static void main(String[] args) {
		
		// 1.객체 생성한다(Output)
		FileOutputStream fos = null;
		try {	
			//1번코드 익셉션이 발생되었다면??
			fos = new FileOutputStream("temp.txt"); //파일이 생성, 이미 있으면 Overwriting
			
			//2. 작업을 한다.
			int ch = 'A';					// 한글은 안됨
			for(int i=ch; i<(ch+26);++i ) {
				fos.write(i);
				//fos.write('\n');
			}
			ch = 'a';
			for(int i=ch; i<(ch+26); ++i ) {
				fos.write(i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fos !=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("작업종료");
			// 3. 마무리작업을 한다(특히 Output은 마무리 작업을 안하면 파일깨짐)

		}

	}
}
