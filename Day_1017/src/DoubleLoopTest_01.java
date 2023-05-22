
public class DoubleLoopTest_01 {

	public static void main(String[] args) {
		for(int j=0; j<5; ++j) {				//줄제어
			//##### 찍고 다음줄로 내려가는걸 다섯번반복한거임
			//j는 i를 5번 반복해준것
			for(int i=0; i<5; ++i) {			//#개수제어
				System.out.print("#");
			}
			System.out.println();
		}
		
		for(int j=5; j>=1; --j) {				
			
			for(int i=1; i<j; ++i) {			
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
