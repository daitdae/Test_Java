package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1; //1~100사이의 임의의 수를 저장
		System.out.println(answer);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자를 입력하세요: ");
//		input = sc.nextInt();
//		
//		//while문으로 했을경우엔 입력 두번 받아야 해서 do while로 하는게 좋음
//		while(input != answer) {
//			System.out.print("숫자를 입력하세요: ");
//			input = sc.nextInt();
//			
//			if(input > answer) {
//				System.out.println("더 작은 수로 시도해보세요");
//			} else if(input < answer){
//				System.out.println("더 큰수로 시도해보세요");
//			} 
//		}
//		System.out.println("정답입니다.");
//		
		do {	//조건식의 연산결과가 참일때 수행될 문장들
			System.out.print("숫자를 입력하세요: ");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 시도해보세요");
			} else if(input < answer){
				System.out.println("더 큰수로 시도해보세요");
			} 
		} while(input!=answer); //조건식
		
		System.out.println("정답입니다.");

	}

}
