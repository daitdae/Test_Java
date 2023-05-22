
public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.kor = 59;
		s.eng = 89;
		s.math = 98;
		s.avg= (s.kor+s.eng+s.math)/3;
		s.output();

	}

}
