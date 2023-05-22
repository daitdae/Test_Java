package v01;

class Parent01{
	String name;		//default package
	void methodA() {
		System.out.println("Parent01-"+name);
	}
}
class Child01 extends Parent01{
	int age;
	void methodB() {
		System.out.println("Child01-"+age);
	}
}
class Neighbor {
	String address;
	void methodC() {
		System.out.println("Neighbor-"+address);
	}
}

public class PolyTest_01 {

	public static void main(String[] args) {
		Parent01 p1 = new Parent01();
		p1.name = "홍길동";
		p1.methodA();
		
		Child01 c1 = new Child01();
		c1.name = "손오공";
		c1.age = 21;
		
		c1.methodA();
		c1.methodB();
		
		Neighbor n = new Neighbor();
		
//		연산자 (instanceof)
		System.out.println(p1 instanceof Parent01); //p1이 parent01이 맞니? 물어보는거
		System.out.println(c1 instanceof Child01); //왼쪽의 자기 자신이나 위에가 나와야 트루뜸
		
		System.out.println(c1 instanceof Parent01);
		
		System.out.println(c1 instanceof Object);
		
//		System.out.println(c1 instanceof String); 족보안에 어디에도 속해 있지 않으면 걍 오류남
//												  아얘 비교자체가 안됨
		System.out.println(p1 instanceof Child01);
		
//		System.out.println(n instanceof Child01); 네이버랑 차일드랑 전혀 상관없는 객체여서 오류남
//		System.out.println(c1 instanceof Neighbor); 아무상관없는애랑 비교하지말아라

	}

}
