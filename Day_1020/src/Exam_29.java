import java.util.Scanner;

/*문제-29 ] 배열을 이용한 예약프로그램 작성
좌석이 5개 있는 소극장에 예약을 받는 시스템을 작성하려고 합니다. 예약자의 이름과 좌석 1~5을 입력 받아 전체 출력하는 프로그램을 작성하세요. (모든 좌석이 만석일 때까지 예약가능)

<실행결과>
=================================
[    ][    ][    ][    ][    ]

예약자 이름 입력 : James
좌석 입력 (1~5): 5
=================================
[    ][    ][    ][    ][James]

예약자 이름 입력 : Smith
좌석 입력 (1~5): 1
=================================
[ Smith][    ][    ][    ][James]

예약자 이름 입력 : Tom
좌석 입력 (1~5): 1
이미 예약이 되었습니다.
    if(iary[seat-1] != null  ) 메출, --i, cont

예약자 이름 입력 : Tom
좌석 입력 (1~5): 2
=================================
[ Smith][ Tom ][    ][    ][James]


...

// 5개의 방에 입력이 완료된 후 아래와 같이 출력한다.

 ** 예약 결과
[ Smith ][ Tom ][  Jennifer  ][ LeeSS   ][James]*/

public class Exam_29 {

	public static void main(String[] args) {

		String name;
		int n;
		String[]seat = new String[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("========================================");
		for(int i=0; i<seat.length; ++i) {
			System.out.print("[ ]");
		}
		System.out.println("\n");
		System.out.println("========================================");
		//입력(이름: 넥스트라인으로 입력할것)
		for(int i =0; i<seat.length; ++i) {
		System.out.print("예약자 이름 입력: ");
		name = sc.nextLine();
		
		System.out.print("좌석 입력(1~5): ");
		n = sc.nextInt();
		if(n<1 || n>5)      //!(n>=1 && n<=5)
		System.out.println("**좌석번호 다시 입력해주세요");
		--i; continue;
		}

	}

}

/*if(iary[seat-1] != null) {
	System.out.print("이미예약이 되었습니다."); 
} else {
	--i; continue;
}*/
