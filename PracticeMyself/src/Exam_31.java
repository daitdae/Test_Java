

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

		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()*100+1);
			int chk = 0;
			for(int j=0; j<arr.length; j++) {
				if(tmp == arr[j]) {
					chk=1;
					break;
				}
			}
			if(chk == 1) {
				i--;
				continue;
			}
			arr[i] = tmp;
		}

		for(int i=0; i<arr.length; i++) {
			if(i%10 == 0 && i != 0) System.out.println();
			System.out.print(arr[i] + " ");
		}
	}
}

