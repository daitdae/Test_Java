/*[문제-32] 발생된 난수 중 최댓값과 최솟값 찾기
1차원 배열 10개 생성하여 1~100사이의 정수난수를 발생시켜 저장한다.
저장된 데이터 중 최댓값과 최솟값을 찾아 출력하는 프로그램을
작성하시오. (중복 허용)

<실행 결과>
발생된 전체 값
6 94 34 7 10 1 89 32 56 11

최솟값 : 1, 최댓값: 89*/

public class Exam_32 {

	public static void main(String[] args) {

		int[]arr =new int[10];
		System.out.println("발생된 전체 값");

		for(int i=0; i<arr.length; ++i) {
			arr[i]=(int)(Math.random()*100+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int max=arr[0];
		int min=arr[0];

		for(int i=1; i<arr.length; ++i) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("최솟값 : "+min+","+" 최댓값 : "+max);
	}
}
