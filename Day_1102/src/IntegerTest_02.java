//		static int	bitCount(int i)
//		static int	compare(int x, int y)
//		boolean	equals(Object obj)
//		int	intValue()
//		static int	max(int a, int b)
//		static int	parseInt(String s)
//		static int	parseInt(String s, int radix)
//		static String	toHexString(int i)
//		static Integer	valueOf(int i)
public class IntegerTest_02 {

	public static void main(String[] args) {
		//number of one-bits 1의 개수반환(2진수로 바꿔서 1의 갯수)
		// ex.0000111=7 1011 = 11
		System.out.println(Integer.bitCount(11)); 
		
		//대소 비교 앞이 크면 1, 앞 작음-1, 같음 0 얼마나 큰지는 안나옴 
		System.out.println(Integer.compare(15, 20));
		
		//i값이 괄호 안의값과 같냐 안같냐 확인?
		//필요없음 ==이거 써라
		Integer i1 = 10;
		System.out.println(i1.equals(10)); //auto unboxing 
		
		//정수부분만 취함 20.5는 .5는 날아가고 20만 남음
		//아래에서 사용한 intvalue는 double클래스에 있는 것을 사용한 것임
		//사실 별의미없는거임
		Double i2 = 20.5;
		System.out.println(i2.intValue());
		
		//둘중 큰값 출력 그냥 부등호, 이것도 안씀
		System.out.println(Integer.max(123, 56));
		
		//Parses the string argument as a signed decimal integer.
		//문자열 인수를 부호 있는 십진 정수로 구문 분석합니다.
		//문자로 숫자를 넣었을때 그걸 정수로 인식하는거?
		//문자열 "45"를 정수 45로 바꿔줌 이건 많이씀
		String str = "45";
		int temp = Integer.parseInt(str);
		System.out.println(Integer.parseInt(str));
		
		//문자열을 16진수로 바꾼거?
		String str2 = "12";
		System.out.println(Integer.parseInt(str2, 16));
		
		//정수 10을 16진수 형태의 문자열 "a"로 반환
		System.out.println(Integer.toHexString(10));
		
		Integer i3 = Integer.valueOf(10); //필요없음
		Integer i4 = Integer.valueOf("10"); //문자열을 정수로 변환해줌 parseInt랑 같음
		
		System.out.println(i3+" "+i4);

	}

}
