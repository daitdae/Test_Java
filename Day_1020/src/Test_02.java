// .****
// *.***
// **.**
// ***.*
// ****.
public class Test_02 {

	public static void main(String[] args) {

		char[][] cary = new char[5][5];


		//입력
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				if(i+j == cary.length-1) cary[i][j]='.';
				else cary[i][j]='*';
			}
		}
		//출력
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				System.out.print(cary[i][j]);
			}
			System.out.println();
		}


	}

}
