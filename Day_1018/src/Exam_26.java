/*정수 배열 10개를 선언하고 임의의 값을 입력받는다.
입력받은 배열의
가장 앞에 위치한 데이터와 마지막 위치의 데이터의 값을 교환
1번방 데이터와 마지막-1방 위치의 데이터 값 교환..

<실습결과>
데이터를 입력하시오: (10개 입력함)

바뀌기 전
5 3 8 10 12 4 1 22 34 2

바뀐 후
2 34 22 1 4 12 10 8 3 5*/

import java.util.Scanner;

public class Exam_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[]ary = new int[10];
		int temp;				 				//교환할때 사용할 temp변수

		// 입력
		for(int i=0; i<ary.length; ++i) {
			System.out.print(i+"번째 방 : ");
			ary[i] = sc.nextInt();
		}
		
		//확인
		System.out.println("**바뀌기전");
		for(int i=0; i<ary.length; ++i) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();

		//처리 ==> 절반만 돌아야한다
		for(int i =0; i<ary.length/2; ++i) {
			temp = ary[i];			
			ary[i] = ary[ary.length-(1+i)]; //가장끝방
			ary[ary.length-(1+i)] = temp;	
		}


		//확인
		System.out.println("**바뀐 후");
		for(int i=0; i<ary.length; ++i) {
			System.out.print(ary[i] + " ");
		}


	}

}
