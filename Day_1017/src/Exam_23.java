
public class Exam_23 {

	public static void main(String[] args) {


		for(int line = 26; line>=1; --line) {
			for(int al = 'A'; al <= 'Z'; ++al) {
				System.out.print((char)al);
			}
			for(int em=line-25; em<=1; ++em) {
				System.out.print(" ");
			}


			System.out.println();

		}
	}
}
















/* SQL Developer (project_table.sql),(member.sql) 참고

 1. 테이블 작성
 	CREATE TABLE addr();
	CREATE TABLE members();
 	
 2. 시퀀스 작성
 	CREATE SEQUENCE addr_seq;
 	
 3. 데이터 삽입
	INSERT INTO members VALUES('hong', '홍길동', 'hong@naver.com', 1);
	
 4. 시퀀스 데이터 삽입
	INSERT INTO addr VALUES (addr_seq.NEXTVAL, '서울시', '종로구'); 
	
 5. COMMIT;
 
 6. JOIN하는 코드 만들기 (project_table.sql),(member.sql) 참고
    * 부모테이블의 레코드가 지워졌을때 자식테이블의 레코드도 지우고 싶을때 쓰는게 on delete cascade
      꼭 설정해야하는건 아니다
 
 
 JAVA
 
 1. project 만들기
 
 2. db.properties, (member)Mapper.xml, mybatis-config.xml 파일복사하기
	Mapper 파일은 많이 바꿔줘야 함 
    mybatis-config.xml 파일은 나중에 (<typeAliases>,<mappers>) 부분 수정해야함
    
 3. Package - dao,main,service,ui,vo 만들기
 
 4. jar파일 두개 복사해와서 build path 시켜준다(src안에)
 
 5. dao package에다가 MybatisConfig.java 복사해서 가져오기 (바꿀거없음)
 
 6. src파일 안에 sql파일 만들어줘서 오라클내용 복붙
 
 7. vo에 클래스 생성(Table수만큼) 
 	* 테이블 만든 것과 같은 내용의 vo파일 생성(클래스명 = table명)
 	  (table 내용 복사해와서 주석처리하고 타입맞추고 앞에 private) ex. private int addrno;
	* 생성자, 새터,게터, tostring 만들기
	* 자바에선 대소문자 따지고 오라클에선 안따짐(클래스명 앞엔 대문자로)
	* vo에 join쿼리문의 select쪽 컬럼들이랑 매칭되는 vo를 만들어줘야함(class명은 임의로)
	  (join에서 나오는 결과물을 받기위한 형태의 vo파일) (fullname 알아둬야함)
	* 테이블 여러개 조인됬다 쳐도 vo는 하나만 만들면됨 (package Soccer_Player.vo; 참조)
	
 8. dao에 interface 만들어준다 (쿼리 날려주기 위함) (ex.MemberMapper.java)
 	* 자바 오라클 연동 목적, 오라클에서 해야하는 작업의 정의부분
 	* CRUD insert, selectone, selectall, update, delete
 	* 테이블이 두개면 insert도 두개가 있어야 함 (insertMember,insertAddr)
 	* 회원을 insert 할거니깐 members vo 따라서 insertMember(Members member); , addr도 동일
 	* 회원에 대한 정보를 가진 테이블은 members이기 때문에 public int insertMember(Members member);
 	  (오라클에서 리턴할때 정수로 하기때문에(1행이 삽입) int로 해줘야 하는것이다
 	* selectone은 문자열 usrid로 검색해서 받아줄거기 때문에
 	  정보를 다보기 위해서 합쳐서 보기 위해 public MemberInfo selectOne(String usrid); 를 쓴다
 	  (조회하는 애들은 Member_info(join vo 파일)로 받아줘야 한다
 	* selectall은 전체 정보 리턴타입을 리스트로(회원이 한명이 아니기 때문) (join vo 파일)
 	* update는 업뎃이 됬다 안됬다니깐 insert처럼 int로 받아준다
 	* delete도 업뎃과 마찬가지 근데 그사람이 가진 유일한 값인 유저 아이디를 준다
 	* 전체 임포트
 	
  9. dao 에 MemberDAO.java생성 
    * dao쪽에 MemberMapper를 이용하는 클래스 = (MemberDAO.java) 
    * 메소드를 만들어준다 
    * 세션오픈하고 메퍼인터페이스를 통해서 데이터를 받아서 리턴하는 작업해줘야함
    * List<MemberInfo> list = mapper.selectAll(); 이처럼 리턴 이름 맞춰서 잘해줘야함
		return list;
 	
 10. ui작업 (MemberUI)
 	* interface에서 작업한 만큼 ui에 들어가야한다
 	* 제일먼저 Scanner
    * ui->service->dao 로 가도록 서비스쪽으로 전달을 하기위엔 메소드 콜이 필요하기때문에 서비스 클래스가 필요
      MemberService service = new MemberService(); (오류가 나지만 나중에 만들거 일단 주석처리)
    * public MemberUI() {} 만들고 초이스 변수 만들고 메인메뉴 호출
    * mainMenu();이렇게 만들어 놓으면 오류날건데 마우스 가져다 대고 create method 하고 메인메뉴 만들기
    * while문 안에 잘보자 
    * findbyid 가 selectone이랑 같은거
    * 메인메뉴 부분을 계속 반복해 받아야 하기 때문에 while로 메인메뉴 부분 감싸줌
 	* default: keyin.nextLine(); 하는 이유는 키보드 버퍼를 지워주기 위함
 	* 여기까지 했을때 아직 ui와 dao는 연결되어있지 않은 상태
  10-1 	
 	 1) findbyid 등도 마찬가지로 마우스 가져다 대고 create method
 	 2) 니가 조회하고 싶은 사용자의 id가 뭐냐(입력받아야함) 그리고 초기화 
 	 3) 입력받은 정보를 service로 넘겨야함 그 후엔 dao로 service역할은 그냥 받아서 넘기는거임
 	 4) 이제 서비스 만들어 준다 위에 주석 처리한 부분 주석해제 후 create class 후 12로
 	 5) 다시 ui로 넘어와서 서비스를 만들어준 뒤 넘겼다 다시 받기위해 
 	   MemberInfo info = service.findById(usrid); 부분 추가
 	 6) 있으면 출력 없으면 출력 안되게 하기 위해 if문 삽입
 	 7) 오류날텐데 service에 findbyid가 없기 때문 마우스 오류나는데 가져다 대고 create 해주면 됨 그리고 다시 서비스로
 	
 11. 메인 만들어주기 (MemberMain.java) 참조	
 
 12. 서비스 만들기 (MemberService.java) 참조
   1) 위에 ui 주석해제하고 create class 하는데 경로 package 부분 수정 해줘야 함 그리고 다시 ui로
   2) 위 7)에서 추가되고 dao객체가 있어야함(실행위해서) 그래서 MemberDAO dao = new MemberDAO(); 추가 
   3) dao쪽은 selectone MemberInfo info = dao.selectOne(usrid); 그리고 받은데이터 리턴
   4) 이걸 하고 쿼리문 삽입해줘야한다 mybatis-config.xml로 넘어간다
   
 13. mybatis-config.xml 열어본다
   1) <mapper resource="memberMapper.xml" /> 부분 확인
   
 14. membermapper.xml로 들어간다 
   1)<mapper namespace= 인터페이스의 풀네임> 이 들어가야함 부분 확인 .java는 쓰면x  
   2) sel까지 치고 ctrl+space누르면 <select id="" ></select> 요렇게 나옴
   3) 다 입력하고 대신 result타입부분은 입력하지 말고 밑에 쿼리문 먼저한다
   4) 복붙해서 세미콜론부터 지운다
   5) 이값은 받아쓸거다 라는 의미로 #{usrid} 받아온다 
   6) result type 부분에는 쿼리문을 받는 vo가 들어오면 된다
   7) 원래는 global.scit~~~ memberinfo 가 들어가야하지만 별칭을 줄수가 있다 그걸 그냥 MemberInfo로 한거임
   
 15. mybatis-config.xml로 간다
   1) 별칭을 짓고 그건 mybatis-config에서 주는거다 mybatis-config 들어가서 <properties>와 <environments> 사이에
      <typeAliases>
		<typeAlias type="global.scit.member.vo.MemberInfo" alias="MemberInfo" /> </typeAliases>이런식으로
		어떤타입에 어떤 별칭을 줄거다라는 말임
   2) vo에 대한 별칭 다 준다 
   
 ** selectall부분은 녹음 파일이 없음 근데 selectone과 대충 비슷한 흐름
 ** selectone과 selectall은 조인부분에서 가져온거임 여기서는
 
 **iterator method
	1) hasNext(): 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드 있으면 true, 없으면 false 를 반환한다. 
	2) next(): 다음 요소를 가져온다. 
	3) remove(): next()로 읽어온 요소를 삭제한다.
		메소드의 호출 순서는 hasNext() -> next() -> remove() 이다.
 
 insert member 만드는법
 16. 일단 ui로 간다
 	1) switch문에 case추가
 	2) 메소드 없으니 오류날텐데 메소드 만들어준다
 	3) 지역변수 필요 (String usrid; 등)
 	4) 아이디 존재여부 확인
 	   MemberInfo info = service.findById(usrid);
 	5) 시퀀스 삽입 부분을 그냥 하드 코딩으로 한다(ui부분 참조해보면 이해감)
 	6) 객체를 만들어준다 Members m = new Members(usrid, usrname, email, addrno);
		int result = service.insertMember(m);
	7)객체 만들었으니 서비스로 보내준다 오류날텐데 create하면 자동으로 service 부분에 생김
		int result = service.insertMember(m); 
	8)if 로 저장여부 확인하는 코드 작성 int니깐 1 or 0
	9)서비스에서 int result = dao.insertMember(m); 하면 오류 create해서 dao로 넘어감
	10) dao문 작성 다른것들과 동일하다
	11) dao에서 새로 받은정보는 저장을 해줘야한다.( session.commit(); )
		* 커밋 반드시 해줘야한다!! (commit or rollback)
	12) 그후 insert 쿼리문 작성 xml에서
	    사용자가 입력한 값은 #으로 대체해야한다 #{usrid} 식으로
	    
 delete member 만드는법
 17. 일단 조회해서 있으면 삭제 없으면 삭제 불가능
 
 exception 처리!!(ui밑에 써놓음 참조)
 18. 주소 목록 부분 밑에 
  1) addrno = keyin.nextInt(); 요부분을 먼저 try로 감싸준다	
  	try{
  		addrno = keyin.nextInt();
  	} catch(exception e) {
  		sysout(오류라는걸 알려준다)
  	} 
  2) 여기서 주소만 다시 입력 받게 해주기위해서 while(true) 문을 써준다 중괄호는 캣치 끝난 중괄호 밑에
     원래는 while문 안에 주소가 들어가야함 
  3) 문자열 부분에 남아있기 때문에 버퍼 지우는 작업을 해야한다 
  4) 주소를 잘입력했을 경우엔 while문을 빠져나갈수 있게 break 해줘야한다.
  5) ui밑에 써준건 숫자 대신 문자가 들어갔을때의 오류만
  6) 숫자이상한게 들어가면 오라클쪽에서 constraint 오류가 터진다
  7) 그러므로 이상한 숫자가 들어갔을때 처리해주기 위해 if문 만들고 내가 일부러 오류를 내서 던져준다 코드보면 앎
   
  
	  
 */

