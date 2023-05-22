
public class StringTest_01 {

	public static void main(String[] args) {
	
		//String 생성자 사용해보기
		
		// 1. String()
		String s1 = new String(); //empty string 객체 생성
		System.out.println(s1);
		
		// 2. String(byte[]bytes)
		byte[] by = new byte[5];
		byte[] by1 = {65,66,97,99,100};
		String s2 = new String(by1); //"ABacd" 코드값이 나옴 잘 안씀
		System.out.println(s2);
		
		// 3. String(char[]value)
		char[]ch = {'A','B','C','D','E'};
		String s3 = new String(ch); //"ABCDE"
		System.out.println(s3);
		
		// 4. String(String original)
		String s4 = new String("대한민국");
		System.out.println(s4);
		
		// 5.
		String s5 = "대한민국";    		 // String pool 영역에 들어감
		String s55 = "대한민국";		 // 객체를 새로 생성하지 않고 이미 있는거 가르키기만 함
										 // 그래서 결과적으로 같은 주소가 나옴
		//s55 = s55+"Korea";			 // 새로운 값을 넣어준거가 된다.
		System.out.println(s5 == s55);   // 주소비교 
		
		String s6 = new String("대한민국"); // heap
		String s7 = new String("대한민국");
		System.out.println(s6 == s7); 		// 주소비교가 같지않다
		System.out.println(s6.equals(s7));  // 값(데이터)비교
		
		System.out.println(s5.equals(s6));	// 데이터 비교
		System.out.println(s5.equals(s55));
		
		
		

	}

}
