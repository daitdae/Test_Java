package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num = 12345, sum=0;
		
//		System.out.print("숫자를 입력하세요> ");
//		
//		Scanner sc = new Scanner(System.in);
//		String temp = sc.nextLine();
//		
//		num = Integer.parseInt(temp);
//		
//		while(num!=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num /= 10;  //num = num/10
//		}
		
		
//		System.out.println(num%10); 10으로 나머지 연산을 하면 마지막 자리를 얻는다
		
		//12345 1234 123 12 1
//		for(num=12345; num>0; num=num/10) {
//			System.out.println(num%10);
//			//sum = sum+(num%10);
//			sum += num%10;
//		}
		
		while(num>0) {		//반복문 잘모르겠을때 중간에 sysout 넣어서 과정 찍어보면서 해라
			sum += num%10;	
			
			num = num/10;
			System.out.println("sum="+sum + ", num%10="+num%10);
		}
		
		
		System.out.println("각자리 숫자의 합: "+sum);

	}

}
