
public class ReferenceType {

	public static void main(String[] args) {
		// 고객명,상품의가격,받은돈이 있을때 거스름돈을 출력하는 프로그램 작성
		
		String name;
		int price, money, change;  // ,넣으면 여러개 동시에 선언가능
		
		name = "손오공";
		price = 15000;
		money = 20000;
		change = money - price;
		
		System.out.println(name);
		System.out.println(change);

		//손오공님 거스름돈은 xxx입니다.
		System.out.println(name + "님 거스름돈은");
		System.out.println(change + "원입니다.");
	}

}
