
public class Exam_24 {

	public static void main(String[] args) {

		for(char i='A'; i<='Z'; ++i) {
			for(char j=i; j>='A'; --j) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
