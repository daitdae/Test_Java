
public class PolygonMain {

	public static void main(String[] args) {
		PolygonVO p = new PolygonVO();
		
		p.setType(4);
		p.setName("사각형");
		
		p = new PolygonVO();
		p.setType(5);
		p.setName("오각형");
		
		p = null;
	  //p.setType(3); //null pointer exception 오류 참조하고 있는게 없는데 값을 넣었다
		
		//p.type= 4;					//데이터에 직접접근해서 수정
		//p.name= "사각형";			
		

	}

}
//접근지정자