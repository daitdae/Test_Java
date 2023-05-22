//public static boolean is Max(int a, int b); 앞크 t, 뒷크f
//public static boolean is Max(float a, float b); 앞크 t, 뒷크f
//public static boolean is Max(String a, String b); 앞크 t, 뒷크f
public class OverloadingTest_02 {

	public static void main(String[] args) {
		
		int a=10,b=20;
		float x=12.1f,y=8.5f;
//		String s1 = "hello", s2="world";
		String s1 = "Hello", s2="hello";
		
		isMax(a,b);
		isMax(x,y);
		boolean bool = isMax(s1,s2);
		if(bool) {
			System.out.println(s1+"이"+s2+"보다 크다");
		} else {
			System.out.println(s1+"이"+s2+"보다 작거나 같다");
		}
		
	}
//		call by value
	public static boolean isMax(int a, int b) {
//		if(a>b) 			이걸 줄여서 나온게 밑에거
//		return true;		굳이 if쓸 필요 없음
//		return false;
		return a>b;
	}
	public static boolean isMax(float a, float b) {
		return a>b;
	}
	
//      call by reference String이 8가지 안에 안들어가서 밸류아님
	public static boolean isMax(String a, String b) {
//		a>b // 값을 비교하는것이 아니라 참조를 비교하는 것이다
//		char ch = b.charAt(0); //charAt(int index) : char
		int temp = a.compareTo(b); 
		//그냥 출력하면 -15나오는데 이게 h와 w사이 크기 근데 이게 -면 뒤에가 크고 +면 앞이큰데
		//이걸 t or f출력하려면 밑에처럼 if넣어서 true false로 바꿔줘서 출력
		if(temp>0) return true;
		return false;
		
	}
//	public class String{
//		멤버변수, 멤버베소드, 생성자
//	}
		
}
