
public class ExceptionTest_05 {

	public static void main(String[] args) {
		try {
			String[] str = {"abc","0.1"};	//일부러 오류내려고 만드는 코드임
			int data = Integer.parseInt(str[0]);
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {			//try쓰고 catch 꼭 써야함
			System.out.println("Exception 발생");
			e.printStackTrace();
			//return;					//리턴해도 finally 는 나온다 근데 밑에 프로그램종료는 무시
			//System.exit(0);			//exit은 finally도 무시
		} finally {						//마무리작업 실시
			System.out.println("마무리");
		}
		
		System.out.println("=====프로그램 종료=====");

	}

}
