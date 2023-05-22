package v04;

public class MyRectangle implements Polygon {
	
	int x;
	int y;
	int width;  //밑변
	int height; // 높이
	
	@Override
	public void output() {
		System.out.println("x= "+ x + ",y=" + y + ",width="+width+",height="+height);

	}

}
