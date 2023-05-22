
public class TwoDimTest_03 {
	
	public static void main(String[] args) {
		
		int[][] ary = new int[3][5];
		int count = 0;
		
		//입력
		//값 넣는 코드 0행은 1로, 1행은 2로, 2행은 3으로 넣어 초기화 시키시오
		for(int i=0; i<ary.length; ++i) {
			++count;
			for(int j=0; j<ary[i].length; ++j) {
				ary[i][j] = count;
			}
		}
		
		//출력
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length; ++j) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
