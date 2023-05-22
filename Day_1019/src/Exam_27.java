import java.util.Scanner;

/*[ 문제-27 ] 배열을 이용한 예약프로그램 작성
좌석이 10개 있는 소극장에 예약을 받는 시스템을 작성하려고 합니다. 
예약자의 이름과 좌석 1~10을 입력 받아 전체 출력하는 프로그램을 작성하세요. (1회만 입력 가능)
keyin.next 문자열배열 string[]seat=new string[10]; string name; seat[rn-1] = name; 
<실행결과>
=================================
[    ][    ][    ][    ][    ][    ][    ][    ][    ][    ]

예약자 이름 입력 : James
좌석 입력 (1~10): 5
====================================
[    ][    ][    ][    ][James][    ][    ][    ][    ][    ]*/
public class Exam_27 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String name; 							 //사람이름
		int seat;  								 //예약한 좌석번호
		String[]sary = new String[10];			 //sary 변수명 무슨? 참조변수[]칸이름

		System.out.println("========================================");
		for(int i=0; i<sary.length; ++i) {
			System.out.print("[ ");				//같이써도 됨
			System.out.print(" ]");
		}

		System.out.println("\n");

		System.out.print("예약자 이름 입력: ");
		name = sc.next();
		System.out.print("좌석 입력(1~10): ");
		seat = sc.nextInt();

		sary[seat-1] = name;

		System.out.println("========================================");

		for(int i=0; i<sary.length; ++i) {

			if(sary[i] !=null)	{					//null을 없애주는 명령어
				System.out.print("[ ");				//null이 아닐때 출력방법
				System.out.print(sary[i]);
				System.out.print(" ]");
			}

			if(sary[i]==null)						//null일때 출력
				System.out.print("[ ]");
		}



	}








}


