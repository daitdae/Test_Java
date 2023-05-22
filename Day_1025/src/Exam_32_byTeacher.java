
public class Exam_32_byTeacher {

	public static void main(String[] args) {
		
		int[]ary = new int[10];
		int min=0,max=0;
		
		for(int i=0; i<ary.length; ++i) {
			ary[i]=(int)(Math.random() * 100 +1);
			
			if(max < ary[i]) max = ary[i];
			if(min > ary[i]) min = ary[i];
		}
		System.out.println("발생된 전체값");
		for(int i=0; i<ary.length; ++i)
			System.out.print(ary[i]+" ");
		
		System.out.println();
		
		System.out.println("\n최대값:"+max);
		System.out.println("\n최초값:"+min);

	}

}
