package global.sesoc.polygon;

public class MyPolygonTest {

	public static void main(String[] args) {
		MyCircle mc    = new MyCircle(1,1,5);
		MyRectangle mr = new MyRectangle(0,0,4,5);
		MyTriangle mt  = new MyTriangle(5,5,7,6);
		
		System.out.println(mc); //자동으로 mc.toString()으로 코드가 바뀜
		System.out.println(mr); //자동으로 mc.toString()으로 코드가 바뀜
		System.out.println(mt); //자동으로 mc.toString()으로 코드가 바뀜

	}

}
