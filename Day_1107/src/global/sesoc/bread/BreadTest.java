package global.sesoc.bread;

public class BreadTest {

	public static void main(String[] args) {
		Bread bread = new Bread("팥빵",1230);
		Cake cake = new Cake("초코케잌",25000,2);
		Roll roll = new Roll("롤",13500,10);
		
		System.out.println(bread);
		System.out.println(cake);
		System.out.println(roll);

	}

}