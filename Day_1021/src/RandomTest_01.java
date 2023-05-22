// Random
// Math: 수학에 관련된 기능을 제공해주는 클래스
public class RandomTest_01 {

	public static void main(String[] args) {

		for(int i=0; i<10; ++i) {

			System.out.println(Math.random());  
			//0보다 크고 1미만의 난수 출력

			System.out.println(Math.random() * 10); 
			//0.0~9.9

			System.out.println((int)(Math.random() * 10)); 
			//정수형으로 강제 형변환 뒤에소수제거
			// 예를들어 곱하기 40은 발생시키고 싶은 숫자의 갯수 (0~39)니깐 40개
			
			System.out.println((int)(Math.random() * 100 -50));
			//-50~49
		}
		

	}

}
