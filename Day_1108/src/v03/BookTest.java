package v03;

public class BookTest {
	public static void main(String[] args) {
		
		Book book;
		book = new Book();
		
		book.id = "1";
		book.title = "그림으로 보는 자바";
		book.output();
		
		book = new Magazine();
		book.id="2";
		book.title="오늘의 집";
		((Magazine) book).type="월간";
//		book.output();		//실제 가르키고 있는 객체의 메소드 호출
		
		book = new Novel();
		book.id="3";
		book.title="토지";
		((Novel) book).author="박경리";
		book.output();
		
		
	}
}
