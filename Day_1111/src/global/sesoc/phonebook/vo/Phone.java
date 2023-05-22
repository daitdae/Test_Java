package global.sesoc.phonebook.vo;

public class Phone {
	//전화번호, 이름, 관계, 나이
	private String phone;
	private String name;
	private String relation;
	private int age;
	
	
	//생성자, 세터/게터, toString
	public Phone() {
		super();
	}
	
	public Phone(String phone, String name, String relation, int age) {
		super();
		this.phone = phone;
		this.name = name;
		this.relation = relation;
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	public String getRelation() {
		return relation;
	}
	public int getAge() {
		return age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "phone=" + phone + ", name=" + name + ", relation=" + relation + ", age=" + age;
	}
	
	
	
}
