//[ 연습문제 ] 피트니스 프로그램을 참조하여 아래의 코드를 작성해보세요
//1) 애완동물 관리 프로그램을 작성하시오
//
//VO --> Pet.java
//
//- 이름 (name) : 문자열 (초롱이, 민수와 같은 동물이름
//- 종류 (kind) : 문자열 (강아지, 고양이, 거북이등)
//- 나이 (age)  :
//
//Service --> PetService.java
//1. 애완동물 등록
//2. 출력
//3. 종료
//
//main --> PetMain.java
//
//<실행 예>
//=====PetShop====
//1.애완동물등록
//2.출력
//0.종료
//===============
//선택 : 1
//
//이름을 입력 해주세요. : 로키
//종류를 입력 해주세요. : 부엉이
//나이를 입력 해주세요. : 2
public class Pet {
	
	//프라이빗 데이터 입력( name, kind, age)
	private String name;
	private String kind;
	private int age;
	
	//기본생성자 선언
	public Pet() {}
	
	//생성자 오버로딩
	public Pet(String name, String kind, int age) {
		this.name=name;
		this.kind=kind;
		this.age=age;
	}
	
	//세터
	public void setName(String name) {
		this.name=name;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//게터
	public String getName() {
		return name;
	}
	public String getKind() {
		return kind;
	}
	public int getAge() {
		return age;
	}
	
	//아웃풋
	public void output() {
		System.out.println("이름: "+name);
		System.out.println("종류: "+kind);
		System.out.println("나이: "+age);
	}

}
