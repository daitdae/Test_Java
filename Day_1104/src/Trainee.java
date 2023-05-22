
public class Trainee {
	
	private String name;	// 이름
	private int it;			// it점수
	private int japanese;	// 일본어점수
	private int basic;		// basic 점수
	private double avg;		// 평균 => IT 40%, 일본어 30%,  베이직 30%
	
	// 기본생성자 alt+s source generate constructor using field
	// 기본생성자는 deselect 하면 됨
	public Trainee() {
		super();
	}

	public Trainee(String name, int it, int japanese, int basic) {
		super();
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;
		calcAvg();
	}
	private void calcAvg() {
		this.avg = ((it*0.4)+(japanese*0.3)+(basic*0.3));
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

	public double getAvg() {
		return avg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIt(int it) {
		this.it = it;
		calcAvg();
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
		calcAvg();
	}

	public void setBasic(int basic) {
		this.basic = basic;
		calcAvg();
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", it=" + it + ", japanese=" + japanese + ", basic=" + basic + ", avg=" + avg
				+ "]";
	}
	
	
	
	
}
