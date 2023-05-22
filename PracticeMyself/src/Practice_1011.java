//Test01 나이<10살, 요금-1000을 할인해준다.
//Test02

public class Practice_1011 {

	public static void main(String[] args) {
		int age = 7;
		int charge = 12000;
		
		if(age<10) {
			charge = charge-1000;
		}
		System.out.printf("지불할요금: %d원",charge);
	}

}
