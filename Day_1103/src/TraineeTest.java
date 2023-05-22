//1) TraineeTest.java
//public class TraineeTest {
//    public static void main(String[] args) {
//        String[] s = {
//                "홍길동 100 89 78",
//                "손오공 99 89 75",
//                "저팔계 80 70 50",
//                "사오정 100 66 50",
//                "이몽룡 70 100 68",
//                "김방자 88 90 70"
//        };
//    }
//}

public class TraineeTest {
	public static void main(String[] args) {
		
		Trainee t = new Trainee();
		String[] s = {
         "홍길동 100 89 78",
         "손오공 99 89 75",
         "저팔계 80 70 50",
         "사오정 100 66 50",
         "이몽룡 70 100 68",
         "김방자 88 90 70"
     };
		t.output();
	}
}
