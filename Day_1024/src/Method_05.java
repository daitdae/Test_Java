//public static string positive(int a) a가 양수인지 음수인지 판단해라
public class Method_05 {

	public static void main(String[] args) {
		String result;
		result = positive(5);
		System.out.println(result);
		
	}
	
	public static String positive(int a) {
		//1번 방법
		String str;
		if(a>0) str = "양수";
		else if(a<0) str = "음수";
		else str = "0";
		
		return str;
		
		//2번 방법
		//return (a > 0) ? "양수" : (a < 0) ? "음수" : "0";
	}

}
