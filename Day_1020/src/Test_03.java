// .****
// *.***
// **.**
// ***.*
// ****.
public class Test_03 {

	public static void main(String[] args) {

		int[][] iary = new int[5][5];
		int count = 0;


		//입력
		for(int i=0; i<iary.length; ++i) {
			for(int j=0; j<iary[i].length; ++j) {
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
