
public class Exam_33_byTeacher {

	public static void main(String[] args) {
		int[][]ary=new int[5][6];

		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length-1; ++j) {
				ary[i][j]=(int)(Math.random()*10+1);
				
				ary[i][5]+=ary[i][j];
			}

			//for(int i=0; i<ary.length; ++i) {
				for(int j=0; j<ary[i].length;++j) {
					System.out.printf("%3d",ary[i][j]);
				}

			}


		}

	}
