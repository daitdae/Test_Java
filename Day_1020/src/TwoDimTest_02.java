
public class TwoDimTest_02 {
	//행이 가지는 열의 개수가 다르게 코딩할 수 있다.
	public static void main(String[] args) {
		
		int[][] ary = new int[3][5];
		
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length; ++j) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
