import java.util.Arrays;

//String a= "대한민국"; 
//char ch =a.charAt(2)
//char	charAt(int index)
//int	codePointAt(int index)
//int	compareTo(String anotherString)
//String	concat(String str)
//boolean	contains(CharSequence s)
//boolean	endsWith(String suffix)
//boolean	equals(Object anObject)
//int	indexOf(int ch)
//boolean	isEmpty()
//int	length()
//String	replace(char oldChar, char newChar)
//String[]	split(String regex)
//String	substring(int beginIndex)
//String	substring(int beginIndex, int endIndex)
//String	toLowerCase()
//String	toUpperCase()


public class StringTest_02 {

	public static void main(String[] args) {
		
		String temp1 = "무궁화 꽃이 피었습니다.";
		char ch = temp1.charAt(4);
		System.out.println(ch);
		//1)지정된 index위치에 해당하는 하나의 문자반환, 띄어쓰기 포함
		
		String temp2="abcABC";
		int i = temp2.codePointAt(0);
		System.out.println(i);
		// 2)지정된 index 위치에 해당하는 하나의 문자의 유니코드값
		
		i = temp2.compareTo("ABCabc");
		System.out.println(i);
		// 3)앞의 문자열과 전달인자의 문자열을 비교하여
		//   처음으로 달라지는 위치의 문자값의 차이를 정수로 반환
		//만약 모든 문자열이 동일하면 0리턴
		
		
		String temp3 = temp1.concat("송아지 송아지 얼룩송아지");
		System.out.println(temp3);
		// 두개의 문자열을 결합 +연산과 동일
		
		String a = "abcd";
		String b = "efgh";
		boolean d = a.contains(b);
		System.out.println(d);
		//문자열 a에 괄호안 문자가 포함되어있는가?
		
		String asd = "가나다라마바사";
		boolean e = asd.endsWith("사");
		System.out.println(e);
		//뒤에 글자가 ()으로 끝나는지 확인
		
		boolean f = a.equals(b);
		System.out.println(f);
		// a 와 b 의 문자열이 같은지 확인
		
		int index = temp1.indexOf('꽃');
		System.out.println(index);
		// 문자열중 입력받은 문자가 있으면 해당문자의 위치(index)값을 리턴하고 문자가 없으면
		// -1을 리턴한다. 문자열 조회는 index값 0부터 시작
		
		System.out.println("".isEmpty());
//		boolean g = a.isEmpty();
//		System.out.println(g);
		//문자열의 길이가 0인 경우에, true를 리턴
		
		System.out.println(temp1.length()); //메소드
//		int k = a.length();
//		System.out.println(k);
		//문자열의 길이 나타냄 몇글자인지
		
		String str = temp1.replace('무', '유');
		System.out.println(str);
		//대체하는거, 원본을 바꾸는 것이 아님
		
		//token: "컵라면 떡볶이 김밥" 
		String data = "컵라면 떡볶이 김밥";
		String[]token = data.split(" ");
		System.out.println(token[0]);
		System.out.println(token[1]);
		System.out.println(token[2]);
		System.out.println("갯수 : "+ token.length); //속성
		
		data = "컵라면.떡볶이.김밥.순대"; //.은 구분자로 사용불가
		token = data.split(" ");		  //StringTokenizer
		System.out.println("갯수 : "+ token.length); 
//		System.out.println(token[1]);
//		System.out.println(token[2]);
//		System.out.println("갯수 : "+ token.length); 
		
		
		data = "컵라면 떡볶이 김밥 순대 쫄면";
		System.out.println(data.substring(8));
		System.out.println(data.substring(4, 9));
		
		String m = "ABCDEFGHIJK";
		String ab = m.substring(4);
		System.out.println(ab);
		//()안숫자뒤 부터 표시 부분문자
		
		//String	substring(int beginIndex, int endIndex)
		String cd = m.substring(2, 5);
		System.out.println(cd);
		// ()안에 입력한 숫자 처음 거 자르고 두번째 숫자 부터 뒤로 자른다 사이값 표시
		
		//String	toLowerCase()
		String ef = m.toLowerCase();
		System.out.println(ef);
		//소문자로 변경
		
		String n ="abcdefghijk";
		String gh = n.toUpperCase();
		System.out.println(gh);
		//대문자로 변경
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Object isEmpty() {
		// TODO Auto-generated method stub
		return null;
	}

}
