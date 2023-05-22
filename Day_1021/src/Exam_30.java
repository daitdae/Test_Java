import java.util.Scanner;

//1~100 난수를 발생시킨후 출력하지는 말고 맞추는 게임을 작성하시오(5회안에 맞춰라)
//up,down, 오 천재시군요 쯧, 틀렸습니다 정답은?
public class Exam_30 {

	public static void main(String[] args) {

		int num; //입력한숫자
		int i;

		String result = null;
		Scanner sc = new Scanner(System.in);

		i = (int)(Math.random() * 100 +1);	
		for(i=0;  i<5; ++i) {
			System.out.println("숫자를 입력하세요:");
			num = sc.nextInt();

			if(num==i) 	  {
				System.out.println("오 천재시군요");;
			}
			else if (num<i) {
				System.out.println("up");
			}
			else if(num>i) {
				System.out.println("down");
			}
			else {
				System.out.println("정답은"+i+"입니다");
			}



		}

	}


}


