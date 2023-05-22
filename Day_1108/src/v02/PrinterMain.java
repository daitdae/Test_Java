package v02;

public class PrinterMain {

	public static void main(String[] args) {
		
		Printer p;
		
		p = new Printer();
		p.maker="Samsung";
//		System.out.println(p.maker);
//		print(p);
		
		inkjet p1 = new inkjet();
		p1.maker="Cannon";
		p1.color="red";
//		System.out.println(p.maker+", "+((inkjet)p).color);
//		print(p1);
		
		Laser l = new Laser();
		l.maker="hp";
		l.toner="10ml black";
		print(l);

	}
	
//	public static void print(Printer p) {
		public static void print(Object p) { //오브젝트로 하면 다잡는데 안쓰는 이유 못들음 ㅜ
		if(p instanceof Printer) return;
		
		
//		System.out.println(p instanceof inkjet); 상위클래스가 올때에는 false
		
		if(p instanceof inkjet) {
			inkjet p1 = (inkjet)p;
			System.out.println(p1.maker+","+p1.color);
		}
		else if(p instanceof Laser) {
			Laser p1 =(Laser)p;
			System.out.println(p1.maker+","+p1.toner);
		}
		else if(p instanceof Printer) {
			Printer p1 =(Printer) p;
			System.out.println(p1.maker);
		}	//부모클래스는 바닥에 깔아줘야한다.
			
	}

}
