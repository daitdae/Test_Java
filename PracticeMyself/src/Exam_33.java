/*[ 문제-33 ] 2차원 배열 다루기
5행 6열의 2차원 정수배열을 생성한 후
5행 5열에 1~10사이의 난수를 발생시켜 초기화 한다.
5번열에는 동일 행의 합계가 구해지도록 프로그래밍 한 후 전체 코드를 출력한다.

<실행 결과> 아래 예시를 확인하시오
1 4 6 2 3 15
6 8 1 5 4 24
1 1 5 5 4 16
3 5 7 1 9 25
2 3 5 1 2 14*/
public class Exam_33 {

	public static void main(String[] args) {

		int[][] arr = new int[5][6];

		int tatesum = arr[0].length - 1;

		for (int yoko = 0; yoko < arr.length; ++yoko) {
			for (int tate = 0; tate < arr[yoko].length; ++tate) {
				if (tate != tatesum) {
					arr[yoko][tate] = (int)(Math.random() * 10 + 1);

					arr[yoko][tatesum] += arr[yoko][tate];

				}
				System.out.printf("%3d ", arr[yoko][tate]);
			}
			System.out.println();
		}

	}


}




