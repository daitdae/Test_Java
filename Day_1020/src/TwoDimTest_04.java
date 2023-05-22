
public class TwoDimTest_04 {

	public static void main(String[] args) {

		int[][] ary = new int[3][5];
		int count = 0;
		
		/*1 2 3 4 5
		  6 7 8 9 10
		 11 12 13 14 15
		 나오게 출력*/

		//입력
		
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length; ++j) {
				++count;
				ary[i][j] = count;
			}
		}

		//출력
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length; ++j) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}


	}

}
