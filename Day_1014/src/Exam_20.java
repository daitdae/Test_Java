//[ 문제-20 ] for문을 이용하여 1~10 자연수의 합계 구하기
//1~10까지 자연수를 모두 더한 합계를 출력하시오
public class Exam_20 {

	public static void main(String[] args) {
		int sum=0, i;
		for(i=1; i<=10; i++) {
			sum= sum + i;
		}
		System.out.println("1~부터 10까지 더한값: " +sum);

	}

}
