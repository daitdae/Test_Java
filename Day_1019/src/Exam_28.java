import java.util.Scanner;

/*변수선언->입력받음 무한->for(i=0; i<ary.lengthi++)
 * [문제-28] 배열에 특정 데이터 입력받기
정수 배열 5개 선언 후 키보드로 데이터를 입력받아 값이 3의 배수인 경우만 배열의 각 요소에 대입하는 프로그램을 작성하시오.
5개의 배열에 값이 모두 채워지면 프로그램을 종료한다.

<실행 결과>
4
3 입력
6 입력
1
9 입력
7
2
12 입력
11
1
3 입력

입력 완료 결과
3 6 9 12 3*/
public class Exam_28 {

	public static void main(String[] args) {

		int[]ary = new int[5];       //칸수
		int num;					 //넣을 숫자

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<ary.length; ++i) {
			System.out.print("정수입력: ");     
			num = sc.nextInt();
			
			if(num % 3 == 0) {						//마름모는 if쓰라는거
				ary[i] = num;
			} 
			else {
				--i;		//아닐때 그냥 돌아가서 ++i가 되면 안되서 그대로 되게
				continue;	//--i를 넣어준다 continue없어도 되긴함
			}
		}
		System.out.println("입력 완료 결과: ");
		for(int i=0; i<ary.length; ++i)		//배열방 5개니깐 출력할때 for문을 넣어줌 
			System.out.print(ary[i]+" ");
	}

}


