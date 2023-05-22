

/*1차원 배열 10개 생성
 * 1~100 사이의 정수를 발생시켜 배열에 넣으시오
 * 단 배열내에 치환된 대이터는 중복된 값이 없어야 한다
 * temp = 17;
 * 8 15 17 
 * 5 7 67 45 17 47 8 9 11 12
 */
public class Exam_31 {

	public static void main(String[] args) {

		int []arr = new int [10];

		//중복 난수 발생
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*20+1);

			for(int j=0; j<i; ++j) {
				if(arr[i]==arr[j]) {
					--i;
					break;
				}
			}
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%3d",arr[i]);
		}

		System.out.println();

	}
}

