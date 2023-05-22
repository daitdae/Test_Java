package global.sesoc.bread;

public class Bread {
	
	private String name;
	private int price;
	
	public Bread() {
		super();
	}

	public Bread(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bread [name=" + name + ", price=" + price + "]";
	}


}
