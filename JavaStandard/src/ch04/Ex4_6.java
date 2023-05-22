package ch04;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		
		System.out.print("현재 월을 입력하십시오: ");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
			case 3: case4: case5: 
				System.out.println("현재 계절은 봄입니다");
			case 6: case7: case8:
				System.out.println("현재 계절은 여름입니다");
			case 9: case10: case11:
				System.out.println("현재 계절은 가을입니다.");
			//case 1: case2: case12: 
			default:
				System.out.println("현재 계절은 겨울입니다.");
			
		}

	}

}
