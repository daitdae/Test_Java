// 나이<10살, 요금-1000을 할인해준다. 
public class IfTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 7;
		int charge = 12000;
		
		if(age<10) {
			charge = charge - 1000;
		}
		
		// if(age < 10) charge = charge -1000; 
		//if 문안에 문장이 하나기대문에 이런식으로 중괄호 생략 가능
		
		System.out.printf("지불할요금: %,d원", charge);

	}

}
