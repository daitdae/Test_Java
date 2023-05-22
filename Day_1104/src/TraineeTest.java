
public class TraineeTest {

	public static void main(String[] args) {

//		int[]arr = new int[10];
//		String[] str = new String[10];
		
		Trainee[] student = new Trainee[6];	//객체배열
		
		String[] s = {
				"홍길동 100 89 78",
				"손오공 99 89 75",
				"저팔계 80 70 50",
				"사오정 100 66 50",
				"이몽룡 70 100 68",
				"김방자 88 90 70"
		};

		for(int i=0; i<s.length; ++i) {
			String[]temp = s[i].split(" "); //배열로 리턴
			Trainee trainee = new Trainee(temp[0],
					Integer.parseInt(temp[1]),
					Integer.parseInt(temp[2]),
					Integer.parseInt(temp[3]));
			student[i]=trainee; //객체배열 완료
		}
		
		// 전체 데이터 출력
        for(int i=0; i<student.length; ++i) {
        	System.out.println(student[i]);
        }
        
		//3번방 학생의 이름과 평균을 출력하세요
		System.out.println(student[3].getName()+", "+student[3].getAvg());
	}

}


