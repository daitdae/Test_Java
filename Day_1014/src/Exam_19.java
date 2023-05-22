import java.util.Scanner;

/*[ 문제-19 ] while문을 이용한 횟수 구하기
반복적으로 값을 입력받아 합계를 구하여 그 합계가 100을 초과하기까지 
몇 번의 입력이 있었는지 횟수를 세는 프로그램을 작성하시오

<실행결과>
정수 입력 : 12
현재까지 합계 : 12
정수 입력 : 63
현재까지 합계 : 75
정수 입력 : 12
현재까지 합계 : 87
정수 입력 : 56
현재까지 합계 : 143
총 4회 입력을 받았습니다.*/
public class Exam_19 { 			//변수가 몇개 필요한지부터 확인

	public static void main(String[] args) {
		int value, sum=0, cnt=0;			
		//합계구하는변수는 0으로 초기화해야함 카운트도 마찬가지
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수입력: ");
			value = sc.nextInt();
			++cnt; 						//한번입력받았으니 증가
			sum = sum + value;			//원래 sum에 방금 받은 value값넣어야 누적
			System.out.println("현재까지의 합계:"+sum);
			if(sum > 100) break;		//100일때 빠져나가야 하니깐
		}
		System.out.printf("총%d회 입력받았습니다.%n",cnt);
		//어떤코드가 while 안인지 밖인지 확인 잘해야함

	}

}
