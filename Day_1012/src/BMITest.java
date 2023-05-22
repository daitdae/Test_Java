import java.util.Scanner;

/*[ 연습 문제 ] BMI 결과 판정하기
키(cm), 몸무게(kg)를 키보드로 입력받는다.
bmi = 몸무게(kg) / 키의 제곱(m)

double height, weight, bmi;
String result = null;

bmi >= 35 : "고도비만"
bmi >= 30 : "중도비만"
bmi >= 25 : "경도비만"
bmi >= 23 : "과체중"
bmi >= 18.5 : "정상"
bmi < 18.5 : "저체중"

<실행>
키(m) : xxx
몸무게(kg) : xxx

당신의 BMI는 23.54이고 '과체중'상태입니다.*/
public class BMITest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double height, weight, bmi;
		String result = null;
		
		System.out.print("키(cm): ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg): ");
		weight = sc.nextDouble();
		
		//bmi = weight / ((height*0.01)*(height*0.01));
		
		height = height * 0.01; //내가 한거보다 이게 더 나음 내건 위에거
		bmi = weight / (height * height);
		
		if (bmi >=35) 		 result = "고도비만";
		else if(bmi >= 30)   result = "중도비만";
		else if(bmi >= 25)   result = "경도비만";
		else if(bmi >= 23)   result = "과체중";
		else if(bmi >= 18.5) result = "정상";
		else 				 result = "저체중";
		
		//출력 방법을 모르겠음 소수점 두자리 찍는거
		//System.out.printf("당신의 BMI는 "+bmi+"이고 '"+result+"'상태입니다");
		System.out.printf("당신의 BMI는 %.2f 이고 '%s'상태입니다. %n", bmi, result);
		
	}

}
