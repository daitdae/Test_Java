package global.sesoc.bread;

public class Roll extends Bread {
	//int length,생성자 3 세터게터 toString
	
	private int length;

	public Roll() {
		super();
	}
	public Roll(int length) {
		super();
		this.length = length;
	}
	public Roll(String name, int price, int length) {
		super(name,price);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return super.toString()+",length=" + length;
	}
	
	
	
	
}
