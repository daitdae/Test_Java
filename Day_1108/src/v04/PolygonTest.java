package v04;

import java.util.Scanner;

public class PolygonTest {

	public static void main(String[] args) {

		Polygon[]poly = new Polygon[10]; //원, 사각형
		int count = 0;
		String choice;
		Scanner sc = new Scanner(System.in);
		int x, y, radius, width, height;


		while(true) {
			System.out.println("1)원 2)사각형 3)출력 0)끝");
			choice = sc.next();

			switch(choice) {
			case"1": 
				System.out.print("x = ");
				x= sc.nextInt();
				System.out.print("y = ");
				y= sc.nextInt();
				System.out.print("radius = ");
				radius= sc.nextInt();
				MyCircle c = new MyCircle();
				
				c.x = x;
				c.y = y;
				c.radius = radius;
				
				poly[count] = c;
				++count;
				
				break;
				
			case"2":
				System.out.print("x = ");
				x= sc.nextInt();
				System.out.print("y = ");
				y= sc.nextInt();
				System.out.print("width = ");
				width= sc.nextInt();
				System.out.print("height = ");
				height= sc.nextInt();
				MyRectangle r = new MyRectangle();
				
				r.x = x;
				r.y = y;
				r.width = width;
				r.height = height;
				
				poly[count] = r;
				++count;
				
				break;
				
			case"3":
				for(int i=0; i<count; ++i) {
					poly[i].output();
				}
				break;
				
			case"0":
				System.out.println("**종료합니다");
				return;
			default:
				System.out.println("**선택오류");
			}
		}


		//		Polygon poly = new MyCircle();
		//		((MyCircle)poly).x = 10;
		//		((MyCircle)poly).y = 20;
		//		((MyCircle)poly).radius = 5;
		//		poly.output();
		//		
		//		Polygon poly2 = new MyRectangle();

	}

}
