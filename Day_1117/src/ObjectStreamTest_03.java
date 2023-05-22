import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamTest_03 {		//배열로 입출력하는 방법

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileOutputStream fos = new FileOutputStream("score.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List<ScoreVO> list = new ArrayList<>();
		
		list.add(new ScoreVO("홍길동",89,88,100));
		list.add(new ScoreVO("임꺽정",95,78,80));
		list.add(new ScoreVO("손오공",67,66,100));
		list.add(new ScoreVO("저팔계",77,78,70));
		
		
		oos.writeObject(list);	
		
		oos.close();			
		fos.close();			
		
		System.out.println("쓰기(저장) 작업종료");
		
		//읽는 작업
		FileInputStream fis = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		@SuppressWarnings("unchecked")
		List<ScoreVO>temp = (List<ScoreVO>)ois.readObject();
		
		fis.close();
		ois.close();
		
		for(ScoreVO s : temp) {				//향상된 for문
			System.out.print(s);
		}
		
		System.out.println("읽기 작업 종료");

	}

}
