import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest_01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//가장먼저 할일은 ScoreVO를 객체생성해준다
		ScoreVO vo1 = new ScoreVO("홍길동",89,88,100);
		ScoreVO vo2 = new ScoreVO("임꺽정",95,78,80);
		
		FileOutputStream fos = new FileOutputStream("score.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(vo1);	//저장하는 코드
		oos.writeObject(vo2);	
		oos.close();			//잊지말고 반드시, 안하면 파일 깨짐
		fos.close();			//Stream 두개 열었기 때문에 두개 다 닫아준다
		
		System.out.println("쓰기(저장) 작업종료");
		
		//읽는 작업
		FileInputStream fis = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(true) {
			try {
				ScoreVO obj1 = (ScoreVO) ois.readObject();
				System.out.println(obj1);
			} catch(EOFException e) {
				System.out.println("읽기작업종료");
				break;
			}
		}
		
//		Object obj = ois.readObject();		//object타입으로 데이터 잡은거
//		(ScoreVO) temp = (ScoreVO) obj;
		
//		ScoreVO obj = (ScoreVO) ois.readObject();		//위에 두개를 합친코드
		
		fis.close();
		ois.close();
		
		System.out.println(vo1);
		System.out.println(vo2);
		
		System.out.println("읽기 작업 종료");
		
	}

}
