	
public class IfTest_03 {

	public static void main(String[] args) {
		
		int kor = 80, eng = 89, math = 70;
		double avg = (kor+eng+math)/3.0;
		String result = null;
		
		if(avg>=90) 	 result="A학점";
		else if(avg>+80) result="B학점"; //90>avg>=80
		else if(avg>+70) result="C학점";
		else if(avg>+60) result="D학점";
		else 			 result="F학점";
		
		System.out.println(result);
		

}
}
