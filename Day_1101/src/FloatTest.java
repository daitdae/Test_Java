
public class FloatTest {

	public static void main(String[] args) {
		//IEEE754 ==> Floating Point 부동소숫점
		System.out.println(1.1);
		System.out.println(1.3);
		System.out.println(1.1+1.3); //변환하고 연산하면서 생긴 오차
		System.out.println((1.1+1.3) == 2.4); //2진수로 변환되면서 생기는 오차 false
		//부동소수점 연산할때는 같냐(==) 말고 크냐 작냐 크거나같다 작거나 같다 이런식으로 범위 연산 해야한다
		System.out.println((1+3) == 4 );
		
		//System.out.println(5/0); 0으로 나누면 오류뜸 
		
		System.out.println(5.0/0.0); //Infinity
		System.out.println(5.0/-0.0);//-Infinity
		

	}

}
