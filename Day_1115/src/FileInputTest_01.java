import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest_01 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			File file = new File("data.txt");
			if(!file.exists()) {							//파일 존재여부 확인
				System.out.println("파일이 존재하지 않습니다");
				return;										//리턴했때문에 밑에 안나옴
			}
			
			
			fis = new FileInputStream("temp.txt");	//input은 파일이 있어야 한다
			int result = 0;
			while(true) {
				result = fis.read();			  //-1이 리턴되면 데이터가 없음을 나타냄
				if(result == -1) break;			  //종료
				System.out.print((char)result);	  //int라 숫자로 나오는데 형변환해준다
			}

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis !=null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
