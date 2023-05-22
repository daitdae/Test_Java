
public class ScoreVO {
	
	private String name;
	private int it;
	private int japanese;
	private int basic;
	private int total;
	private double avg;
	
	public ScoreVO() {
		super();
	}

	public ScoreVO(String name, int it, int japanese, int basic) {
		super();
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;
		calc();
	}

	private void calc() {
		total = it+japanese+basic;
		avg = (it*0.4+japanese*0.3+basic*0.3);	
	}

	public String getName() {
		return name;
	}

	public int getIt() {
		return it;
	}

	public int getJapanese() {
		return japanese;
	}

	public int getBasic() {
		return basic;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIt(int it) {
		this.it = it;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		
		String data = String.format("%4s it:%2d 일본어:%2d 베이직:%2d 합계:%2d 평균:%.2f%n",
				name,it,japanese,basic,total,avg);
		
		return data;
	}
	
}
