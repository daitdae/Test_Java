package v01;

class Parent02{
	String name;		
	void methodA() {
		System.out.println("Parent02-"+name);
	}
}
class Child02 extends Parent02{
	int age;
	void methodB() {
		System.out.println("Child02-"+age);
	}
}


public class PolyTest_02 {

	public static void main(String[] args) {
		
		//다형성 ==> 인터페이스와 함께 사용해야 효과가 좋다!
		
		Parent02 p2 = new Child02();	
		//p2는 자기가 부모라고 생각한다(Parent02 라고) up casting 근데 실제로는 자식을 가르키고 있음
		p2.name="홍길동";
		p2.methodA();
		
//		p2.age = 34; 오류
//		p2.methodB(); 오류
		
		//down casting: 실제 사용하려는 시점에서는 다운캐스팅이 필요하다.
		((Child02)p2).age=33;
		((Child02)p2).methodB();
//		(Child02)p2.methodB(); 오류남 앞에 다운캐스팅보다 먼저 methodB를 불러오려고 하기때문
	}

}
