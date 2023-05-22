import java.util.Scanner;

/*[ 문제-18 ] while과 if를 이용하여 약수 구하기
		정수를 입력 받아 약수를 모두 출력하는 프로그램을 작성하시오

		<실행 결과>
		정수를 입력 하세요.64
		1
		2
		4
		8
		16
		32
		64*/
public class Exam_18 { //while 밖에서 입력받아야함 17번처럼 계속 돌리는게 아님

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value, i=1;

		System.out.print("정수를 입력 하세요. ");
		value = sc.nextInt();

		while (value>=i) {
			if(value%i==0)
				System.out.println(i); //나는 i가 아니라 value를 넣어서 답이안나옴
			++i; //요부분 빠뜨림
		}
	}
}
