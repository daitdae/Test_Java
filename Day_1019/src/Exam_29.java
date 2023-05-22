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
		// 변수선언
		Scanner keyin = new Scanner(System.in);
		String[] seat = new String[5]; // 5명의 예약좌석
		String name;// 예약자명
		int n;      // 좌석번호

		// 출력
		System.out.println("================================");
		for(int i=0; i<seat.length; ++i) {
			System.out.print(" [  ] ");
		}
		System.out.println("\n");

		// 입력 (이름: nextLine()으로 입력할 것)
		// 좌석은 1~5사이가 아니면 다시 입력
		for(int i=0; i<seat.length;++i) {
			System.out.print("예약자 이름 입력: ");
			name = keyin.nextLine();  // nextLine()

			System.out.print("좌석 입력 (1~5): ");
			n = keyin.nextInt(); // 5 (5-1)
			keyin.nextLine();

			if(n<1 || n>5) { // !(n >= 1  && n <= 5)
				System.out.println("** 좌석번호 다시 입력해 주세요");
				--i;
				continue;
			}

			if(seat[n-1] != null) {
				System.out.println("** 해당 좌석은 이미 예약이 되었습니다.");
				--i;
				continue;
			}

			seat[n-1] = name;
			System.out.println("** 예약 완료!");

			System.out.println("================================");
			for(int j=0; j<seat.length; ++j) {
				// 예약좌석이 없는 경우
				if(seat[j] == null)
					System.out.print(" [  ] ");
				else {
					System.out.print(" [");
					System.out.print(seat[j]);
					System.out.print("] ");
				}
			} // end inner for
			System.out.println("\n");

		} // end outer for 
		System.out.println("** 모든 예약이 완료되었습니다.");

	}

}
/*String name;
int seat;
String[]iary = new String[5];

Scanner sc = new Scanner(System.in);

System.out.println("========================================");
for(int i=0; i<iary.length; ++i) {
	System.out.print("[ ]");
}
System.out.println("\n");

System.out.print("예약자 이름 입력: ");
name = sc.next();
System.out.print("좌석 입력(1~5): ");
seat = sc.nextInt();

iary[seat-1] = name;

System.out.println("========================================");

for(int i =0; i<iary.length; ++i) {
	if(iary[i] !=null) {
		System.out.print("[ ");				
		System.out.print(iary[i]);
		System.out.print(" ]");
	}
	if(iary[i]==null)					
		System.out.print("[ ]");
}*/
