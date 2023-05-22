package ch04;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		int menu=0;
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("1. square");
			System.out.println("2. square root");
			System.out.println("3. log");
			System.out.println("원하는 메뉴를 선택하시오(종료:0)");
			
			String temp = sc.nextLine();
			menu = Integer.parseInt(temp);
			
			if(menu==0) {
				System.out.println("종료합니다");
				break;
			} else if(!( 1 <= menu && menu <= 3)){ //무조건 아닌걸로 해야함
				System.out.println("메뉴를 잘못선택했음");
				continue;
			}
			
			for(;;) {
				System.out.print("계산할 값을 입력하세요(계산종료:0, 전체종료:99");
				temp = sc.nextLine();		  //화면에서 입력받은 내용을 temp에 저장
				num = Integer.parseInt(temp); //입력받은 문자열 temp를 숫자로 전환
				
				if(num == 0)
					break;	//계산종료 for문을 벗어난다
				
				if(num == 99)
					break outer; //전체 종료 for문과 while문을 모두 벗어난다
				
				switch(menu) {
					case 1 : 
						System.out.println("result="+ num*num);
						break;
					case 2:
						System.out.println("result="+ Math.sqrt(num));
						break;
					case 3 :
						System.out.println("result="+Math.log(num));
						break;
				}
			} //for(;;)의 끝
		}//while의 끝
		System.out.println("프로그램 종료");
	}
}
