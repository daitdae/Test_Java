
public class DoubleLoopTest_02 {

	public static void main(String[] args) {

		for(int line = 5; line>=1; --line) { //
			for(int dot = 1; dot<line; ++dot) { 
				System.out.print(".");
			}
			for(int star=line-4; star<=1; ++star) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


