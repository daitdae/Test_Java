
public class OutputTest_02 {

	public static void main(String[] args) {
		
		int x = 25, y = 3345000;
		System.out.printf("x = %-5d,y = %,d%n",x, y);
		//%d사이에 넣은 숫자는 자릿수 확보 +-둘다 가능 ,넣으면 3자리마다 ,
		
		double a = 256.55, b = 3345.545678;
		System.out.printf("a=%.2f,b=%,.2f %n",a, b);
		//.2: 소수점 2자리까지만 나타내라 반올림 되서 나타남 ,는 .2앞에 입력
		
		char ch = 'a';
		System.out.printf("문자 a = %c %n",ch); 
		//ch값을 받아서 출력한거 위에것들도 마찬가지
		
		char ch2 = 'a';
		System.out.printf("문자 a = %d %n",(int)ch2); 
		//문자를 강제형변환해서 문자번호를 나타나게 할수있다.
		
		double discount = 10;
		System.out.printf("할인율은 %.0f%%입니다",discount);

	}

}
