
public class Exam_02 {

	public static void main(String[] args) {
		/* 산술연산자 연습
		 * 사과 개당 4300원(price)인 사과가 2335개(count) 있다.
		 * 도매상(person) 13명이 나눠서 가져가려고 하면 한명당 얼마를 내야하는가?*/
		
		/*내가한거
		int price = 4300 , count = 2335 , person = 13;
		int total = price * count;
		int avg = total/person;
		System.out.println(avg);*/
		
		int price = 4300 , count = 2335; //선생님이 한거
		int person = 13;                 //우선순위가 동일하면 왼쪽부터 계산
		System.out.println((price * count) / person);
		
		

	}

}
