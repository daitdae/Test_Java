
public class WhileTest_03 {

	public static void main(String[] args) {
		int i = 0;
		while(true) {
			System.out.println(i++);
		  //System.out.println(i); i++; 이렇게 두개를 한줄로 만든게 위에거
		  //break; 무조건실행하므로 출력문이 1회만 실행 (break만썻을경우)
			if(i == 10) break; //10은 출력이 안된다
		}
		System.out.println("End!"+i); //+i 넣으면 10까지 출력
	}

}

/*10이 출력이 안되는 이유 위부터 내려오니깐 10되면 그냥 나가버려서 위에 한번을
  더 돌지 않기 때문에 9까지 출력이 됨*/