import java.util.Scanner;

/*[ 문제-22 ] 특정 년도 구하기
연도를 입력 받아 서기 0년~입력 년도 n사이의 모든 돼지의 해를 출력하시오

<Hint>
돼지의 해는 연도를 12로 나누어 나머지가 3인 해이다.

<실행 결과>
년도 입력 : 2019
1년 2019년까지 돼지의 해 :
3년
15년
27년
39년
51년
63년
75년
…
2019년
서기 1년~2019년까지 돼지의 해는 몇번있습니다.*/

public class Exam_22 {

	public static void main(String[] args) {

		int year,cnt=0;

		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		year = sc.nextInt();

		for(int i=1; i<=year; ++i) {
			if(i%12==3) 
				System.out.printf("%d년%n",i); 
			++cnt;
			System.out.printf("서기1년~%d년까지 돼지의 해는%d번있습니다.%n",year,cnt);

		}
	}
}
