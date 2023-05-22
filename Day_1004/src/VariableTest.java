
public class VariableTest {

	public static void main(String[] args) {
		//정수 변수 선언
		int age;   // 선언(declaration)
		age = 31;  // 변수선언하고 처음넣은 값은 초기화라고 한다
		           // =뜻은 오른쪽의 값을 왼쪽변수에 대입해라
		System.out.println(age); //31이란 값을 안에 넣는것과 동일함
		
		age = 45;
		System.out.println(age);
		
		int grade = 4; //선언과 초기화를 동시에 한거임
		System.out.println(grade);
		
		byte by = 125;
		short sh =125;
		int in = 125;
		long lg = 125; // 작은데이터가 큰변수안에 들어가는건 가능, 정확한건 long lg = 125L;
		
		float fl = 42.195F; // F안넣으면 오류남 , 더블형(8)인데 왼쪽의 작은 변수에 넣으려니 오류남
		double dbl = 42.195; 
		
		//문자형
		char ch = '%';
		
		//불린형
		boolean bool = true;

	}

}
