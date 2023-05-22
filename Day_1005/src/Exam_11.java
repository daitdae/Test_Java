
public class Exam_11 {

	public static void main(String[] args) {
		//[문제-4] 제품의 바가지여부 확인하기
		//제품의 원가(product)와 실제구매가격(price)을 입력하여 얼마나 더 비싸게 
		//또는 싸게 샀는지 출력하는 프로그램을 작성 하시오.
		
		boolean result;
		int product, price;
		
		product = 5400;
		price = 9400;
		result = price - product > 0 /*(비싸다)*/ ||  price - product < 0; //(싸다)
		System.out.println(result);
		

	}

}
