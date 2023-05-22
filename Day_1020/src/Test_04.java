// 1 6 11 16 21
// 2 7 12 17 22
// 3 8 13 18 23
// 4 9 14 19 24
// 5 10 15 20 25
public class Test_04 {

	public static void main(String[] args) {

		int[][] iary = new int[5][5];
		int count = 0;


		//입력
		for(int j=0; j<iary.length; ++j) {
			for(int i=0; i<iary[j].length; ++i) {
				iary[i][j] = ++count;
				
			}
		}
		//출력
		for(int i=0; i<iary.length; ++i) {
			for(int j=0; j<iary[i].length; ++j) {
				System.out.printf("%3d",iary[i][j]);
			}
			System.out.println();
		}
		

	}

}
