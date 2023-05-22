package ch03;

public class Ex3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); //3
		System.out.println((double)Math.round(pi*1000)/1000); //3.142
		
		double shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);
		
		//만약 3.141을 얻으려면 형변환해준다
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000)/1000.0); //소수점 아래때문에 .0
	}

}
