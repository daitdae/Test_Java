import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputTest_03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		File file = new File("song.txt");
		byte[] buff = new byte[15];

		if(!file.exists()) {								//파일 유무 확인
			System.out.println("파일이 존재하지않습니다");
			return;
		}
		try {
			fis = new FileInputStream(file);		//40=>15
			fos = new FileOutputStream("copy.txt");
			int data;
			int loop = 0;
			while(true) {
				data = fis.read(buff); //15, 15, 10
				//System.out.print("\n"+data); // 몇번읽었는지 확인하는 코드
//				++loop;
				if(data < buff.length) {
//					for(int i =0; i<data; ++i) {
//						fos.write(buff[i]);
					fos.write(buff, 0, data); //for문 대신 쓸수있는 방법
					break;
//					}
				}
				fos.write(buff);	//15개를 다 저장하겠다는 의미
				
			
			}
			//System.out.println("loop: "+loop);

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
