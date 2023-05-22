
public class ContinueTest {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i==5) continue;     //continue는 조건에 맞을때 그 밑에 코드는 전부무시
			System.out.println("현재 값 : "+i); //5일때 출력을 무시했기때문에 5안나옴
		}
		System.out.println("끝");
		
		for(int i=0; i<10; i++) {
			if(i%2==0) continue;
			System.out.println("현재 값 : "+i);
		}
		System.out.println("끝");
		
		//int i =0; //main method가 자신의 지역
		int j = 0;
		while(true) {
		//int j = 0; //while 안이 자신의 지역
			++j;
			if(j==10) break;
			if(j%2==0) continue;
			System.out.println(j);
		}
	
	
		for(int i=0; i<10; i++) {
			if(i==5) break;
			System.out.println("현재 값 : "+i);
		}
		System.out.println("끝");
		
	}

}
