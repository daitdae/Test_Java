class Parent {
	//constructor 기본생성자
	private String data;
	public Parent() {
		System.out.println("부모클래스");
	}
	public Parent(String data) {
		this.data = data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
}

class Child extends Parent { 
	//상속받은거중 public 데이터는 다 와있다고 생각하면 됨(setdata getdata)
	//기본생성자
	private int number;
	public Child() {
//		super(); //부모클래스의 기본생성자를 호출
		System.out.println("자식클래스");
	}
	public Child(int number) {
//		super(); //슈퍼는 항상 상단에 있어야함
		this.number = number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
}

public class InheritanceTest_01 {

	public static void main(String[] args) {
		Child c2 = new Child(27);
		System.out.println(c2.getData()+" "+c2.getNumber());
//		Child c1 = new Child();
//		Parent p1 = new Parent(); 
		
//		Parent p = new Parent();
//		p.setData("대한민국");
//		System.out.println(p.getData());
//		
//		Child c = new Child();
//		c.setData("일본");
//		c.setNumber(10);
//		System.out.println(c.getData()+" "+c.getNumber());
		
		

	}

}
