class AClass{
	private String name;
	private int age;
	
	public AClass() {}  //기본생성자
	
	public AClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+", "+age;
	}
}

class BClass extends AClass {
	
	private String address;
	
	public BClass() {} //기본생성자
	
	public BClass(String address) {
//		super("모모",19); 부모의 기본생성자가 없어서 오류남 이러면 오류는 안나는데
//		부모의 기본생성자 넣어주는게 좋음
		this.address = address;
	}

		public BClass(String name,int age, String address) {
		super(name,age);
		this.address = address;
	} //할 수는 있는데 잘쓰이진 않음 자식은 자식만 신경쓰면 됨
		
	@Override
	public String toString() {
		return super.toString()+", "+ address;
	}
}

public class InheritanceTest_04 {
	public static void main(String[] args) {
//		concrete class 
		BClass b = new BClass("저팔계",20,"미국뉴욕");
		System.out.println(b);
	
	}
}
