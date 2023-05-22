import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdReaderTest_01 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		BufferedWriter bw = null;

		FileReader fr = null;
		FileWriter fw = null;
		fr = new FileReader(new File("score.txt"));
		fw = new FileWriter(new File("score_result.txt"));
		//br = new BufferedReader(new FileReader(new File("score.txt"))); 을 간단히 한게 밑에거

		br = new BufferedReader(fr); //fr 업그레이드 위한 코드
		bw = new BufferedWriter(fw);

		//여러명을 읽어내는 작업(while 돌려서 확인)
		String score;
		String name;
		int it, japanese, basic, total;
		double avg;

		while(true) {
			score= br.readLine();
			if(score==null) break;

			//split(" ");
			String[] ary = score.split(" ");

			name = ary[0];
			it = Integer.parseInt(ary[1]);	//문자열을 인티저로 정수값으로 파싱
			japanese = Integer.parseInt(ary[2]);
			basic = Integer.parseInt(ary[3]);
			
			ScoreVO vo = new ScoreVO(name,it,japanese,basic);

			System.out.println(vo);		//화면으로
			
			bw.write(vo.toString());	//파일로
		}

		br.close();
		fr.close();

		bw.close();
		fw.close();
	}
}


