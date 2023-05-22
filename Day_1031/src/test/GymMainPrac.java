package test;
import java.util.Scanner;		//니가 쓰려는건 자바.유틸.스캐너에 있어
import service.GymServicePrac;		//서비스안에 든거를 참조에서 쓸거야(.)
								//패키지 먼저 그다음 임포트 여러개 좌르륵

public class GymMainPrac {

	public static void main(String[] args) {
		//GymService service = new GymService(); 오류남 같은 패키지가 아니라서
		GymServicePrac service = new GymServicePrac();
		Scanner sc = new Scanner(System.in);
		
		

	}

}
