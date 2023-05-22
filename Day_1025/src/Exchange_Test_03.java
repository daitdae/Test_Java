/*아래와 같이 정수배열 10개짜리 2개를 선언한다.
 * int[] score = new int[10];
 * int[] rank = new int[10];
 * 
 * score배열은 50~100까지의 난수를 발생시켜 초기화
 * score배열의 값을 이용해 등수를 구한 후 출력
 * 
 * <실행 예>
 * -score출력/rank출력
 * 70 89 100 67 66 99 100 50  51 88  //score
 *  5 3 1 6 7 3 1 9 8 4 //rank
 */
public class Exchange_Test_03 {

	public static void main(String[] args) {	//변수의 이름과 메소드의 이름은 다르게 만든다
		
		int[] score = new int[10];
		int[] rank = new int[10];
		
		init(score); 							//score 배열에 난수를 발생시켜 초기화
		ranking(score, rank);
		output(score, rank);
		
		
	}
	public static void init(int[]score) {
		for(int i=0; i<score.length;++i) {
			score[i]=(int)(Math.random()*51+50);
		}
	}
	
	public static void ranking(int[]score,int[]rank) {
		for(int i=0; i<score.length; ++i) {
			rank[i]=1;
			for(int j=0; j<i; ++j) {
				if(score[i] < score[j])       ++rank[i];
				else if(score[i] > score[j])  ++rank[j];
			}
		}
	}
	
	public static void output(int[]score,int[]rank) {
		System.out.printf("%3s: ","점수");
		for(int i=0;i<score.length;++i)
			System.out.printf("%3d",score[i]);
		System.out.println();
		
		System.out.printf("%3s: ","등수");
		for(int i=0;i<rank.length;++i)
			System.out.printf("%3d",rank[i]);
		System.out.println();
		
	}
	//init();
	//ranking();
	//output();
}
