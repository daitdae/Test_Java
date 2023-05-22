//public static double max(double a, double b)

public class Method_04 {

	public static void main(String[] args) {
		double result;
		result = max(10,20);
		System.out.println(result);
	}
	public static double max(double a, double b) {
		return(a > b)? a : b;
	}

}
