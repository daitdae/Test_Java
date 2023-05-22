import java.io.Serializable;

public class Friend implements Serializable{

	private static final long serialVersionUID = 4795278067970293992L;
	private String name;
	private String phone;

	public Friend() {
		super();
	}

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void output() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phone);
	}

}
