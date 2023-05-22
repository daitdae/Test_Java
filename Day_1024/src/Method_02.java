

public class Method_02 {

	public static void main(String[] args) {
		System.out.println("main method");
		int value1=10, value2=20;
		
		add(value1, value2); 
		minus(value1, value2);
		
		System.out.println("End");
	}
	
	
	public static void add(int value1, int value2) {
		int result = value1+value2;
		
		System.out.println("결과: " + result);
	}

	public static void output() {
		System.out.println("output method");
		return;
	}

	public static void minus(int value1, int value2) {
		int result = value1-value2;
		System.out.println("결과: " + result);
	}
	
	
	
	
}
