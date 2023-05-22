package v03;

public class Magazine extends Book {
	String type; // 발행되는 타입

	@Override
	public void output() {
		
		super.output();
		System.out.println("발행되는 타입:"+type);
	}
	
	

}
