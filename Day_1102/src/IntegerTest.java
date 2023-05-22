
public class IntegerTest {

	public static void main(String[] args) {
		System.out.println("최대값: " +Integer.MAX_VALUE);
		System.out.println("최소값: " +Integer.MIN_VALUE);
		System.out.println("Size: " +Integer.SIZE);
		System.out.println("Byte: " +Integer.BYTES);
		
		Integer i1 = new Integer(15);		//앞으로 쓰지말라는 경고표시 
		Integer i2 = new Integer("123");	
		
		System.out.println(i1);		//오토 언박싱 기능 (Auto Unboxing)
		System.out.println(i2);
		
		System.out.println(i1.getClass()); 	//i1이 무슨 클래스인지 확인할때 
		
		Integer i3 = 45; 
		//int i3 = 45; 오토박싱, 자동으로 기초자료형을 객체자료형으로 바꿔줌
		System.out.println(i1+i3);  //오토 언박싱
	}

}
