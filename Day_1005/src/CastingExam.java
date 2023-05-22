
public class CastingExam {

	public static void main(String[] args) {
		
		// int c, f 15.56
		// c = (f-32) * 5/9
		
		/* 내가 한건데 틀림
		double c, f = 60;
		c = (double) (f - 32) * 5/9;
		System.out.println(c);
		*/
		
		double c, f = 60;
		c = (f - 32) * (5/9.0); //5뒤에.0 혹은 9뒤에.0
		System.out.println(c);
		

	}

}
