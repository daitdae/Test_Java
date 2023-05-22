
public class OperatorTest_06 {

	public static void main(String[] args) {
		int x = 0;
		int result = 0;
		
		result = ++x; //x증가->증가된 x값 치환
		System.out.println(x+","+result);
		
		x = 0;
		result = x++; // result = x먼저 그 후 ++가 계산됨 그니깐 result결과값은 0이나옴
		              // 치환->x증가
		System.out.println(x+","+result);

	}

}
