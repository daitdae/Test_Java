//
//public class Oracle_SQL {
//	-- 2022년 11월 21일(월)
//	-- 밑으로 내려서 적어도 됨
//
//	-- 1)조회 (select): 
//	-- select 컬럼명 from 테이블명;
//	select * from regions;
//	select * from countries;
//	select * from locations;
//
//	select * from departments;
//	select * from employees;
//	select * from jobs;
//	select * from job_history;
//
//	--이름을 조회
//	select first_name, last_name from employees;
//
//	--이름(first_name) 급여(salary)
//	select first_name, salary from employees;
//
//	--사원번호(employee_id), 이름(first_name), 급여(salary), 부서번호(department_id)
//	select employee_id, first_name, salary, department_id from employees;
//
//	--이름 부서번호 입사일
//	select first_name, department_id, hire_date from employees;
//
//	--부서번호 (distinct: 중복데이터 제거하고 출력, all: 다 출력)
//	select distinct
//	    department_id 
//	from employees;
//
//	-- 정렬해주는거 : order by 뒤에 컬럼명(어찌 정렬할건지 적음) 문장 가장 마지막에 적어줌 asc 생략가능(오름차순) desc(내림차순)
//	select distinct
//	    department_id 
//	from employees 
//	order by department_id desc;
//
//	--11월 22일
//
//	SELECT employee_ID,first_name,hire_date,salary FROM employees;
//
//	SELECT employee_ID, first_name, salary from employees order by salary desc;
//
//	SELECT first_name, phone_number, department_ID 
//	from employees
//	order by first_name;
//
//	SELECT DISTINCT department_ID
//	from employees;
//
//	----------------------------------------------------------------------------
//	-- 문자열 결합 연산자 ||
//	SELECT first_name || '님 안녕하세요?' as "Hello!"  -- Java문자열은"" 이건 '' as는 컬럼네임변경(특문 띄어쓰기 안되는데 ""쓰면가능)
//	FROM employees;
//	--홑 따옴표 : 오라클의 문자열
//	--겹따옴표 : 문자열아님!! 특수데이터 처리용
//
//	SELECT first_name, salary as "현재급여", salary*1.1 as "인상된 급여"
//	FROM employees;
//
//	--조건절의 사용
//	/*SELECT [ALL/DISTINCT] 컬럼명 FROM 테이블명
//	WHERE 조건절
//	ORDER BY 컬럼명 [ASC/DESC]*/
//
//	--[문제] 급여가 10,000달러 이상인 직원들의 이름,급여,부처,직급을 조회하시오
//	SELECT first_name, salary, department_ID, job_ID
//	From employees
//	WHERE salary>=10000;
//
//	--이름, 부서, 입사일을 2005년 이후에 입사한 직원을 입사일 순으로 조회하시오
//	SELECT first_name, department_ID, hire_date
//	FROM employees
//	WHERE hire_date>='05/01/01'     
//	ORDER by hire_date;
//
//	--2005년 이전에 입사한 직원의 이름, 부서, 입사일을 이름순로 조회하시오
//	SELECT first_name, department_ID, hire_date
//	FROM employees
//	WHERE hire_date<'05/01/01'
//	ORDER by first_name;
//
//	--[문제] 급여가 5000~10000사이인 직원의 이름, 부서번호, 급여 급여 내림차순으로 조회
//	SELECT first_name, department_ID, salary
//	FROM employees
//	WHERE salary>=5000 AND salary<=10000 
//	ORDER by salary DESC;
//
//	--[문제] 부서번호가 50이거나 80인 직원의 이름, 부서번호, 부서 오름차순으로 조회
//	SELECT first_name, department_ID
//	FROM employees
//	WHERE department_ID=50 OR department_ID=80
//	ORDER by department_ID ASC;
//
//
//	--[문제] 부서번호가 50이거나 80인 직원의 이름, 부서번호, 부서 오름차순으로 이름은 내림차순으로 조회
//	SELECT first_name, department_ID
//	FROM employees
//	WHERE department_ID=50 OR department_ID=80
//	ORDER by department_ID ASC, first_name DESC;
//
//
//	--[문제] 급여가 5000~10000사이인 직원의 이름, 부서번호, 급여 급여 내림차순으로 조회
//	--컬럼명 between 첫번째 값 and 두번째 값 
//	SELECT first_name, department_ID, salary
//	FROM employees
//	--WHERE salary>=5000 AND salary<=10000 
//	WHERE salary between 5000 and 10000  --위랑 같은말
//	ORDER by salary DESC;
//
//	--[문제] 급여가 5000미만 10000초과하는 직원의 이름, 부서번호, 급여 급여 내림차순으로 조회
//	--컬럼명 not between 첫번째 값 and 두번째 값 
//	SELECT first_name, department_ID, salary
//	FROM employees
//	WHERE salary NOT between 5000 and 10000
//	ORDER by salary DESC;
//
//	--[문제] 부서번호가 50이거나 80인 직원의 이름, 부서번호, 부서 오름차순으로 이름은 내림차순으로 조회
//	-- 컬럼명 in (값, 값)
//	SELECT first_name, department_ID
//	FROM employees
//	--WHERE department_ID=50 OR department_ID=80
//	WHERE department_ID IN (50,80)  -- 결과값은 위와 동일
//	ORDER by department_ID ASC, first_name DESC;
//
//	--[문제] 부서번호가 50이거나 80이 아닌 직원의 이름, 부서번호, 부서 오름차순으로 이름은 내림차순으로 조회
//	-- 컬럼명 NOT in (값, 값)
//	SELECT first_name, department_ID
//	FROM employees
//	WHERE department_ID NOT IN (50,80)  
//	ORDER by department_ID ASC, first_name DESC;
//
//	--[문제] 이름, 부서번호, 급여, 커미션비율을 이름오름차순으로 조회 commission_pct 
//	SELECT first_name, department_ID, commission_pct
//	FROM employees
//	ORDER by first_name;
//
//	--컬럼명 is null, is not null
//	SELECT first_name, department_ID, commission_pct
//	FROM employees
//	WHERE commission_pct IS NOT NULL
//	ORDER by first_name;
//
//	--컬럼명 is null, is not null
//	SELECT first_name, department_ID, commission_pct
//	FROM employees
//	WHERE commission_pct IS NULL
//	ORDER by first_name;
//
//	--[문제]관리자가 없는 사람을 조회 (이름 직급아이디job id 부서번호department id)
//	SELECT first_name, job_id, department_id
//	FROM employees
//	WHERE manager_ID IS NULL;
//
//	--[문제]커미션을 받는 직원의 이름 기본급여 커미션비율 커미션 금액 총급여를 조회(총금액 내림차순)
//	SELECT
//	    first_name, salary, commission_pct, salary*commission_pct as "커미션비율",salary+salary*commission_pct as 총급여
//	FROM 
//	    employees
//	WHERE
//	    commission_pct IS NOT NULL
//	ORDER by 
//	    총급여 DESC;
//
//	/* 문제 */
//	-- 1) 사원번호(EMPLOYEE_ID), 이름, 부서번호, 급여, 직급(JOB_ID)을 급여별로 내림차순 조회
//	SELECT employee_ID, first_name, department_id, salary, job_id
//	FROM employees
//	ORDER by salary DESC;
//
//	-- 2) 급여가 10000 이상인 사람의 이름, 급여, 부서번호 조회
//	SELECT first_name, salary, department_ID
//	FROM employees
//	WHERE salary>=10000;
//
//	-- 3) 100번 부서에 소속된 사람들의 이름, 부서번호, 급여를 이름순으로 오름차순 정렬하여 조회
//	SELECT first_name, department_ID, salary
//	FROM employees
//	WHERE department_ID = 100
//	ORDER by first_name;
//
//	-- 4) 입사일이 '07/02/07' 이후에 입사한 사람의 이름, 입사일을 날짜별 오름차순으로 조회
//	SELECT first_name, hire_date
//	FROM employees
//	WHERE hire_date>='07/02/07'
//	ORDER by hire_date;
//
//	-- 5) 이름, 입사일, 급여, 부서번호를 조회, (부서별 오름차순, 이름순 오름차순)
//	SELECT first_name, hire_date, salary, department_ID
//	FROM employees
//	ORDER by department_ID ASC, first_name ASC;
//
//	-- 6) 부서에 소속되지 않은 사람의 이름, 입사일, 급여, 부서번호를 조회
//	SELECT first_name, hire_date, salary, department_ID
//	FROM employees
//	WHERE department_ID IS NULL;
//
//	-- 7) 성과급이 있는 직원의 이름, 급여, 커미션비율, 성과급, 합계를 조회하시오. (별칭을 사용할 것)
//	SELECT first_name, salary, commission_pct, salary+salary*commission_pct as "합계"
//	FROM employees
//	WHERE commission_pct IS NOT NULL;
//
//	-- 8) 성과급이 있는 직원의 이름, 급여, 성과급, 합계를 조회하시오. (별칭을 사용할 것)
//	--   단, 성과급의 금액이 1000 이하인 직원들만 조회
//	SELECT first_name as "이름", salary as "급여", commission_pct as "성과급", salary+salary*commission_pct as "합계"
//	FROM employees
//	WHERE commission_pct IS NOT NULL
//	AND commission_pct<=1000;
//
//	--11월 23일(수)
//	--ROLE : previlege의 묶음을 의미한다
//
//	--연산자 : LIKE연산자 +(특수기호 %_)
//	-- % : 글자를 대신해서 사용된다 0~n개의 글자
//	-- _ : 한개의 글자를 의미한다
//
//	--[문제] CLERK직급의 사람이름, 직급을 조회
//	SELECT 
//	    first_name, job_id
//	FROM
//	    employees
//	--WHERE 
//	--  job_id LIKE '___CLERK'
//	WHERE 
//	    job_id LIKE '%CLERK'          -- 위 아래 결과문은 같음
//	ORDER BY
//	    job_id;
//	    
//	--[문제] 'J'로 시작하는 직원의 이름을 조회하시오
//	SELECT
//	    first_name
//	FROM
//	    employees
//	WHERE 
//	    first_name LIKE 'J%';
//	    
//	--[문제] 1월에 입사한 직원의 이름, 입사일, 전화번호를 조회하시오 '___01___' or '__/01/__' or 
//	--                                          '%01%'(이건 앞에 데이터가 없어도 되서 01년이나 1일에 입사한 사람까지 나온다)
//	SELECT
//	    first_name, hire_date, phone_number
//	FROM
//	    employees
//	WHERE
//	    hire_date LIKE '__/01/__';
//	    
//	--[문제] 전화번호가 515로 시작하는 직원의 이름,입사일 전화번호를 조회하시오.
//	SELECT
//	    first_name, hire_date, phone_number
//	FROM
//	    employees
//	WHERE
//	    phone_number LIKE '515%';
//
//	--desc employees : employees 안에 뭐가 있는지 확인할수 있는 코드
//
//	--DDL(Data Definition Language) : Create, Alter, Drop
//	/*CREATE TABLE 테이블명(
//	    컬럼명 데이터 타입 [CONSTRAINT 제약조건명]  제약조건들,
//	    컬럼명 데이터 타입 [CONSTRAINT 제약조건명]  제약조건들,
//	    컬럼명 데이터 타입 [CONSTRAINT 제약조건명]  제약조건들,
//	    제약조건명 : 테이블명_컬럼명_타입
//	); 
//	*/
//	CREATE TABLE customer (
//	    usrid CHAR(5) CONSTRAINT customer_usrid_pk PRIMARY KEY,
//	    age NUMBER(3) NOT NULL,
//	    usrname VARCHAR(20),
//	    height NUMBER(10,2) DEFAULT 0,            -- 소수점(넉넉잡은 수, 자릿수)
//	    weight NUMBER(10,2) DEFAULT 0,
//	    address VARCHAR(100) 
//	);
//
//	--DROP TABLE customer; 테이블 없애는 방법
//
//	SELECT * FROM customer;
//
//	/*INSERT: 데이터 삽입명령
//
//	INSERT INTO 테이블명
//	(컬럼명...) 1,2,3,4,5
//	VALUES
//	(데이터...) 1,2,3,4,5 ; 컬럼명과 맞춰서 데이터 순서대로 삽입
//	*/
//
//	INSERT INTO customer
//	(usrid,age,usrname,height,weight,address)
//	VALUES
//	('aaa', 31, '홍길동', 176, 67.5, '서울시 영등포구');
//
//	INSERT INTO customer        --순서대로 다 넣었을 경우엔 컬럼명 생략가능 (usrid...생략가능)
//	VALUES
//	('bbb', 32, '저팔계', 188, 88.5, '서울시 동작구');
//
//	INSERT INTO customer
//	(usrid,age,address)     --일부만 넣었을땐 컬럼명 생략 불가
//	VALUES
//	('ccc', 23, '서울시 동작구');
//
//	INSERT INTO customer
//	(usrid, usrname, age,address)     
//	VALUES
//	('ccc', '손오공', 23, '서울시 동작구');
//
//
//
//	COMMIT; --save //commit 하면 롤백 안됨
//
//	--DELETE : 레코드 삭제 0~ALL 가능
//	DELETE FROM customer;
//
//	--DELETE + WHERE : 조건별 삭제
//	DELETE FROM customer
//	WHERE usrname IS NULL;
//
//	COMMIT;
//
//	--UPDATE : 레코드 수정 WHERE 조건절 필요함 없으면 한번에 다 바뀜
//	UPDATE customer
//	SET
//	    height = 177.7
//	    ,weight = 77.7
//	WHERE
//	    usrid='ccc';
//	    
//	SELECT
//	    *
//	FROM customer;
//
//	ROLLBACK;       --트랜지션이 마무리 된 상태까지 되돌리는거 커밋이전은 불가능
//
//	-- "member" 테이블명 만들때 안된다 하면 큰 따옴표 붙이면 가능하긴 한데 비추
//
//
//	/*[문제] members 테이블을 생성한 후 insert update delete commit rollback 연습하기
//	seqno 정수 pk
//	usrid 가변문자열 30자리 unique nn
//	usrname  가변문자열 30자리 nn
//	birth 날짜
//	joindate 날짜
//	gender 성별 고정길이 문자열 1byte
//	*/
//
//	CREATE TABLE members(
//	 seqno NUMBER CONSTRAINT members_seqno_pk PRIMARY KEY,
//	 usrid VARCHAR(30) CONSTRAINT members_usrid_uqnn UNIQUE NOT NULL,
//	 usrname VARCHAR(30) CONSTRAINT members_usrname_nn NOT NULL,
//	 birth DATE,
//	 joindate DATE,     -- 현재날짜 입력 : DATE DEFAULT SYSDATE;
//	 gender CHAR(1)     -- 한정된 값만 들어가게 하는 제약조건 : 
//	                    -- DEFAULT 'M'(값이 없으면 디폴트값 M넣겠다 다만 순서가 무조건 앞에와야 함) 
//	                    CONSTRAINT members_members_ck CHECK (gender IN ('M', 'F'))
//	);
//
//
//	INSERT INTO members
//	(seqno, usrid, usrname, birth, joindate, gender)
//	VALUES
//	(1,'aaa','name','01/10/10', '03/12/12', 'm');
//
//	INSERT INTO members
//	(seqno, usrid, usrname, birth, joindate, gender)
//	VALUES
//	(2,'bbb','james','01/10/10', sysdate , 'm');    -- 현재날짜 삽입: sysdate
//
//	UPDATE members
//	SET 
//	    birth = '03/01/25', 
//	    usrid = 'Paul'
//	WHERE
//	    usrid = 'aaa';
//	    
//	DELETE FROM members;
//
//	ROLLBACK;
//
//	SELECT
//	    *
//	FROM members;
//
//
//
//
//	/* 11월 24일(목) 
//	FK - 
//	   부모테이블 + 자식테이블
//	   
//	Sequence 객체 생성 및 사용
//	*/
//
//
//	/* 관계 형성하기 */
//	DROP TABLE child_1;
//	DROP TABLE parent_1;
//
//	-- 부모테이블 생성
//	CREATE TABLE parent_1
//	(
//	    seqno     NUMBER PRIMARY KEY,
//	    usrname  VARCHAR2(20) NOT NULL,
//	    phone     VARCHAR2(10)
//	);
//
//	CREATE TABLE child_1
//	(
//	    seqnum  NUMBER PRIMARY KEY,
//	    jumin     VARCHAR2(13) NOT NULL,
//	    address  VARCHAR2(50),
//	    seqno    NUMBER  REFERENCES parent_1(seqno)
//	);
//
//	-- 부모테이블에 데이터 삽입
//	INSERT INTO parent_1 VALUES(1, '홍길동', '1111');
//	INSERT INTO parent_1 VALUES(2, '저팔계', '2222');
//	INSERT INTO parent_1 VALUES(3, '사오정', '3333');
//
//
//	-- 자식테이블에 데이터 삽입
//	INSERT INTO child_1 VALUES(11, '921124', '서울', 1);
//	INSERT INTO child_1 VALUES(12, '931124', '부산', 2);
//	INSERT INTO child_1 VALUES(13, '941124', '인천', 2);
//	INSERT INTO child_1 VALUES(14, '951124', '제주', 3);
//
//	SELECT * FROM parent_1;
//	SELECT * FROM child_1;
//	-- 
//	DELETE child_1
//	WHERE seqno = 2;
//
//	DELETE parent_1
//	WHERE seqno = 2;
//
//	-- 새로운 테이블 생성하기
//
//	DROP TABLE parent_2;
//
//
//	CREATE TABLE parent_2
//	(
//	    seqnum NUMBER PRIMARY KEY,
//	    usrid     VARCHAR2(20) UNIQUE NOT NULL,
//	    usrname VARCHAR2(20) NOT NULL,
//	    email     VARCHAR2(30) UNIQUE
//	);
//
//	-- 일련번호 발생하는 객체 생성하기(SEQUENCE)
//	DROP SEQUENCE parent2_seq;
//
//	CREATE SEQUENCE parent2_seq;  -- 1부터 발생시키기 시작함
//
//	-- parent2_seq.nextval : 다음 값을 발생시킴
//	-- parent2_seq.currval : 마지막으로 발생시킨 일련번호의 값을 알고자 할 때
//
//	SELECT parent2_seq.nextval FROM dual; -- 가상테이블(더미테이블)
//
//	SELECT parent2_seq.currval FROM dual; -- 가상테이블(더미테이블)
//
//	-- parent_2 테이블에 sequence를 이용해 값 삽입하기
//	INSERT INTO parent_2
//	(seqnum, usrid, usrname, email )
//	VALUES
//	(parent2_seq.nextval, 'aaa', '홍길동','aaa@korea.com' );
//
//
//	INSERT INTO parent_2
//	(seqnum, usrid, usrname, email )
//	VALUES
//	(parent2_seq.nextval, 'bbb', '손오공','bbb@korea.com' );
//
//	SELECT * FROM parent_2;
//
//	/*
//	[ 문제 ] score_2 테이블을 생성하시오
//	seqno : 시퀀스 번호 (시퀀스 객체 생성해서 사용할 것 : score2_seq ) PK
//	seqnum : FK (on delete cascade 설정할 것) FK
//	kor : 0
//	eng : 0
//	mat : 0
//	*/
//	DROP TABLE score_2;
//	DROP SEQUENCE score2_seq;
//
//	CREATE TABLE score_2
//	(
//	    seqno    NUMBER PRIMARY KEY,
//	    seqnum NUMBER REFERENCES parent_2(seqnum) ON DELETE CASCADE,
//	    kor       NUMBER(3) DEFAULT 0,
//	    eng      NUMBER(3) DEFAULT 0,
//	    mat      NUMBER(3) DEFAULT 0
//	);
//
//	CREATE SEQUENCE score2;
//
//	-- 자기 자신의 컬럼을 참조하는 테이블 생성하기 
//	DROP TABLE emp;
//
//	CREATE TABLE emp
//	(
//	    empno NUMBER PRIMARY KEY,
//	    ename VARCHAR2(20) NOT NULL,
//	    jobtitle VARCHAR2(30),
//	    mgrno NUMBER REFERENCES emp(empno)  
//	);
//
//	INSERT INTO emp VALUES(1, '홍길동', '대표이사', NULL);
//	INSERT INTO emp VALUES(2, '손오공', '전무', 1);
//	INSERT INTO emp VALUES(3, '사오정', '사무', 1);
//
//	INSERT INTO emp VALUES(4, '이몽룡', '기획팀장', 2);
//	INSERT INTO emp VALUES(5, '성춘향', '홍보팀장', 3);
//
//	/* 문제 */
//	-- 1) Den 의 모든 정보를 조회하시오 (DEN, den, DEn)
//
//
//	-- 2) D로 시작하는 이름을 가진 모든 사람의 정보를 조회하시오 
//	--   (%:글자제한 없음, _ 글자제한)
//
//
//	-- 3) 이름이 3글자인 모든 사람의 정보를 조회하시오.
//
//
//	-- 4) 부서가 10이거나 50이거나 60번 부서의 직원의 정보(이름, 급여, 부서)를 조회하시오.  
//
//
//	-- 5) 부서가 60이거나 이름이 A로 시작하는 시작하는 직원의 정보(이름, 급여, 부서)를 조회하시오.
//
//
//	-- 6) 급여가 10000을 초과하면서 JOB_ID가 'SA_REP'인 사람의 이메일, 이름, 전화번호, JOB_ID 정보를 조회하시오
//
//
//	-- 7) 매니저가 103인 직원의 정보(아이디, 이름, 부서, 매니저번호)를 조회하시오.
//
//
//	/*
//	■ 다음과 같은 내용으로 테이블을 생성하시오
//
//	1. 
//	테이블 명 : STAR_WARS (영화 정보를 저장하는 테이블)
//	컬럼 : 
//	 - EPISODE_ID : 에피소드 아이디로써, 정수형 타입으로 기본 키
//	 - EPISODE_NAME : 에피소드에 따른 영화 제목을 저장하는 컬럼이며, 
//	                가변 길이 문자형 타입(50 BYTE)
//	 - OPEN_YEAR : 개봉 년도로써, 정수형 타입(4자리)
//	 
//	2. 
//	테이블 명 : CHARACTERS (등장인물 정보를 저장하는 테이블)
//	컬럼 : 
//	 - CHARACTER_ID : 등장인물 아이디로써,  정수 5자리으로 기본 키
//	 - CHARACTER_NAME : 등장인물 명으로 가변 길이 문자형 타입(30 BYTE)이다.
//	 - MASTER_ID : 등장인물이 제다이일 경우 마스터 아이디 값을 가지는 컬럼. 정수 5자리
//	 - ROLE_ID : 등장인물의 역할 아이디로써, 정수형 타입.
//	 - EMAIL : 등장인물의 이메일 주소로 가변길이 문자형 타입(40 BYTE).
//
//	3. 테이블 명 : CASTING (등장인물과 실제 배우의 정보를 저장하는 테이블)
//	 컬럼 : 
//	 - EPISODE_ID: 에피소드 아이디로써, 숫자형 타입(5자리)으로 기본 키.
//	 - CHARACTER_ID: 등장인물 아이디로써, 숫자형 타입(5자리)이며 기본 키.
//	 - REAL_NAME : 등장인물의 실제 이름을 저장하는 컬럼으로, 가변길이 문자형 타입(30 BYTE).
//
//desc employees; 
//--employee_id, first_name, last_name, email, phone_number,hire
//-- 1) Den 의 모든 정보를 조회하시오 (DEN, den, DEn)
//SELECT 
//    *
//FROM
//    employees
//WHERE
//    First_name LIKE 'Den';
//
//-- 2) D로 시작하는 이름을 가진 모든 사람의 정보를 조회하시오
//--   (%:글자제한 없음, _ 글자제한)
//SELECT
//    *
//FROM 
//    employees
//WHERE
//    First_name Like 'D%';
//
//
//-- 3) 이름이 3글자인 모든 사람의 정보를 조회하시오.
//SELECT
//    *
//FROM
//    employees
//WHERE
//    first_name Like '___';
//
//
//-- 4) 부서가 10이거나 50이거나 60번 부서의 직원의 정보(이름, 급여, 부서)를 조회하시오.  
//SELECT 
//    first_name, salary, department_ID
//FROM 
//    employees
//WHERE
//    department_ID IN (50,60);
//    
//
//-- 5) 부서가 60이거나 이름이 A로 시작하는 시작하는 직원의 정보(이름, 급여, 부서)를 조회하시오.
//SELECT
//    first_name, salary, department_ID
//FROM
//    employees
//WHERE 
//    department_ID=60 or First_name LIKE'A%';
//
//
//-- 6) 급여가 10000을 초과하면서 JOB_ID가 'SA_REP'인 사람의 이메일, 이름, 전화번호, JOB_ID 정보를 조회하시오
//SELECT
//    email,first_name,phone_number,job_id
//FROM
//    employees
//Where
//    salary>=10000 AND Job_id = 'sa_rep';
//
//
//-- 7) 매니저가 103인 직원의 정보(아이디, 이름, 부서, 매니저번호)를 조회하시오.
//
///*11월 24일(목)
//FK - 
//    부모테이블+자식테이블
//    
//    Sequence 객체 생성 및 사용
//*/
//
///*관계형성하기
//DROP TABLE child_1
//DROP TABLE Parent_1 없앨땐 아이먼저*/
//
//--부모테이블 생성
//CREATE TABLE Parent_1
//(
//    seqno NUMBER PRIMARY KEY,
//    usrname VARCHAR2(20) NOT NULL,
//    phone VARCHAR2(10)
//    );
//    
//CREATE TABLE child_1
//(
//    seqnum NUMBER PRIMARY KEY,
//    jumin VARCHAR2(13) NOT NULL,
//    address VARCHAR2(50),
//    seqno NUMBER REFERENCES Parent_1(seqno) ON DELETE CASCADE --참조무결성 부모의 레코드를 지우면 관련된 자식의 레코드도 지운다
//    );
//    
//--부모테이블에 데이터 삽입
//INSERT INTO parent_1 VALUES(1, '홍길동', '1111');
//INSERT INTO parent_1 VALUES(2, '저팔계', '2222');
//INSERT INTO parent_1 VALUES(3, '사오정', '3333');
//
//--자식테이블에 데이터 삽입
//INSERT INTO child_1 VALUES(11, '921224', '서울', 1);
//INSERT INTO child_1 VALUES(12, '930111', '부산', 2);
//INSERT INTO child_1 VALUES(13, '940112', '대구', 2);
//INSERT INTO child_1 VALUES(14, '951124', '대전', 3);
//
//--데이터 삭제
//DELETE parent_1
//WHERE seqno =2;
//
//--ON DELETE CASCADE 걸고 안걸고 차이 안걸려있으면 자식거 먼저 지워야 한다
//--원래 드랍을 하던 DELETE를 하건 자식먼저 지우는게 원칙
//DELETE CHILD_1
//WHERE seqno =2;
//
//--새로운 테이블 생성하기
//DROP TABLE parent_2;
//CREATE TABLE parent_2 (
//    seqnum NUMBER PRIMARY KEY,
//    usrid VARCHAR2(20) UNIQUE NOT NULL,
//    usrname VARCHAR2(20) NOT NULL,
//    email VARCHAR2(30) UNIQUE
//);
//
//-- 시퀀스 삭제 할 때
//DROP SEQUENCE parent2_seq;
//
//-- 일련번호를 발생하는 객체 생성하기(SEQUENCE)
//CREATE SEQUENCE parent2_seq;    --1부터 발생시키기 시작함
//
//--parent2_seq.nextval: 다음 값을 발생시킨다(앞에 어떤시퀀스의 넥스트인지 시퀀스명과 .을 찍어준다)
//--parent2_seq.currval: 현재 얼마까지 발생되었는가?(마지막으로 발생시킨 일련번호의 값을 알고자 할때)
//
//SELECT parent2_seq.nextval FROM dual;
//SELECT parent2_seq.currval FROM dual; -- 가상테이블(더미 테이블)
//
//--parent_2 테이블에 sequence 를 이용해 값 삽입하기
//INSERT INTO parent_2
//(seqnum, usrid, usrname, email) --생략가능
//VALUES
//(parent2_seq.nextval, 'aaa', '홍길동', 'aaa@korea.com');
//
//INSERT INTO parent_2
//(seqnum, usrid, usrname, email) 
//VALUES
//(parent2_seq.nextval, 'bbb', '손오공', 'bbb@korea.com');
//
//SELECT*FROM parent_2;
//
//
///*[문제] score_2테이블을 생성하시오
//seqno: 시퀀스번호(시퀀스 객체 생성해서 사용할것: score2_seq)
//seqnum: FK (on delete cascade 설정할것
//kor : 0
//eng : 0
//mat : 0 */
//DROP TABLE score_2;
//DROP SEQUENCE score2_seq;
//
//CREATE TABLE score_2(
//    seqno NUMBER PRIMARY KEY,
//    seqnum NUMBER REFERENCES Parent_2(seqnum) ON DELETE CASCADE,
//    kor NUMBER(3) DEFAULT 0,
//    eng NUMBER(3) DEFAULT 0,
//    mat NUMBER(3) DEFAULT 0
//);
//
//CREATE SEQUENCE score2_seq;
//
//--자기 자신의 칼럼을 참조하는 테이블 생성하기
//DROP TABLE emp;
//CREATE TABLE emp
//(
//    empno NUMBER PRIMARY KEY,
//    ename VARCHAR2(20) NOT NULL,
//    jobtitle VARCHAR2(30),
//    mgrno NUMBER REFERENCES emp(empno)  
//);
//
//INSERT INTO emp VALUES(1, '홍길동', '대표이사', NULL);
//INSERT INTO emp VALUES(2, '손오공', '전무', 1);
//INSERT INTO emp VALUES(3, '사오정', '상무', 1);
//INSERT INTO emp VALUES(4, '이몽룡', '기획팀장', 2);
//INSERT INTO emp VALUES(5, '성춘향', '홍보팀장', 3);
//
//SELECT
//    employee_id, FIRST_NAME, JOB_ID, MANAGER_ID
//FROM employees;
//
///*함수 서브쿼리 조인*/
//
//--initcap은 첫글자만대문자
//SELECT FIRST_NAME, lower(first_name), upper(first_name), initcap(first_name) 
//FROM employees;
//
//--length(), concat()
//SELECT FIRST_NAME, length(FIRST_NAME), concat(FIRST_NAME,'님')
//FROM employees;
//
//-- substr(문자열, n), substr(문자열, n1, n2) 오라클은 인덱스가 1부터 시작
//SELECT substr('무궁화 꽃이 피었습니다.', 7)
//FROM dual;          --존재하지않으므로 더미에서
//
//SELECT substr('무궁화 꽃이 피었습니다.', 5, 1)
//FROM dual;   
//
//--substr을 이용해서 월에 해당하는 정보만 추출하시오
//SELECT sysdate, substr(sysdate,4,2)
//FROM dual;
//
//--employees 테이블에서 hire_date칼럼에서 입사연도만(substr)로 추출하시오.
//SELECT hire_date, substr(hire_date,1,2)
//FROM employees;
//
//--employees 테이블에서 hire_date칼럼에서 입사연도(substr, concat)로 추출하시오. 03
//SELECT hire_date,concat(substr(hire_date,1,2), '년')
//FROM employees;
//
//--replace()
//SELECT '010-1234-4567' as "전화번호", replace('010-1234-4567', '-' ,'/') as "수정된 전화번호"
//FROM dual;
//
//--숫자함수
//SELECT 
//    1234.5678, 
//    ROUND(1234.5678, 2),
//    ROUND(1234.5678, 0),
//    ROUND(1234.5678, -1)
//FROM dual;
//
//SELECT 
//    1234.5678, 
//    ceil(1234.5678),
//    floor(1234.5678)
//FROM dual;
//
//SELECT 
//    -1234.5678, 
//    ROUND(-1234.5678, 2),
//    ROUND(-1234.5678, -1),
//    ceil(-1234.5678),
//    floor(-1234.5678)
//FROM dual;
//
//
//
//
//-- 11월 25일(금)
///* 함수, 서브쿼리, 조인
//내장함수의 종류   
//1)단일행 함수
//    - 문자열 함수 : lower(), upper(), initcap(), {영문에만 해당} length(), concat(), substr(문자열, n), substr(문자열, n1, n2)
//                    replace(문자열, 찾는 문자열, 바꾸는 문자열)
//    - 숫자 함수 : ceil() - 올림, floor() - 버림, round()-반올림
//    - 날짜 함수 : add_months(), months_between()
//    - 변환 함수 : to_date(), to_number(), to_char()
//2)그룹행 함수 : 집계하는 용도
//*/
//
//SELECT sysdate,systimestamp
//FROM dual;
//
//SELECT sysdate, sysdate+1 AS "내일", sysdate-1 AS "어제"    -- +-만 가능
//FROM dual;
//
//SELECT sysdate - '91/11/15'  -- 오류 : 문자열로 인식해서 못함, 하려면 전환함수를 통해 날짜형태로 변환한 후 작업해야한다.
//FROM dual;
//
//--입사일 이후 현재까지 총 근무일
//SELECT first_name, ceil (sysdate - hire_date) as "총 근무일"    --ceil이나 floor 넣어서 소수점 없애줌
//FROM employees
//ORDER by "총 근무일" DESC;
//
//-- ADD_MONTH(날짜데이터,정수)
//SELECT 
//    sysdate, ADD_MONTHS(sysdate, 3), ADD_MONTHS(sysdate, -3)
//FROM 
//    dual;
//    
//-- MONTHS_BETWEEN(날짜데이터,정수)
//SELECT 
//    first_name, hire_date, CEIL(MONTHS_BETWEEN(sysdate, hire_date)) as "근무 개월"
//FROM 
//    employees;
//    
//--[문제] 근속년수 구하기
//SELECT
//    first_name, hire_date, 
//    ROUND (MONTHS_BETWEEN(sysdate, hire_date), 1) as "근무 개월",  
//    CEIL (MONTHS_BETWEEN(sysdate, hire_date)/12) as "근무 년수"
//FROM 
//    employees
//ORDER by "근무 년수";
//
//
//--변환함수의 사용 : TO_DATE(), TO_CHAR(), TO_NUMBER()
//--'91/12/25'
//SELECT '91/12/25', TO_DATE('91/12/25')+1
//FROM dual;
//
//-- 태어나서 오늘까지 몇일이 경과했는지 확인
//SELECT CEIL(sysdate-TO_DATE('89/01/11'))
//FROM dual;
//
//--TO_CHAR(날짜,포멧) : YYYY-MM-DD HH(시) MI(분) SS(초)
//SELECT sysdate, TO_CHAR(sysdate, 'YYYY-MM-DD HH:MI:SS (DAY)')
//FROM dual;
//
//--TO_NUMBER('1234') 문자열 형태를 숫자로 CAST(데이터,자료형) : 한방에 다바뀜
//--숫자인지 문자인지 확인하는법 : 숫자는 셀의 오른쪽으로 정렬되고 문자는 왼쪽으로 정렬됨
//SELECT TO_NUMBER('1234')+2,TO_NUMBER('1234.56')
//FROM dual;
//
//--[문제] 20년이상 근무한 직원의 명단을 조회
//--      (사원번호(EMPLOYEE_ID),이름,입사일(YYYY-MM-DD),근속년수(XX년 근무) )
//--      입사일 기준으로 내림차순 정렬
//SELECT
//    employee_ID, first_name, 
//    TO_CHAR(hire_date, 'YYYY-MM-DD'), 
//    FLOOR(MONTHS_BETWEEN(sysdate, hire_date)/12) as "근속년수"
//FROM
//    employees
//WHERE
//    FLOOR(MONTHS_BETWEEN(sysdate, hire_date)/12)>=20
//ORDER BY
//    "근속년수" desc;
//    
//
//--
//--그룹행 함수 : COUNT(컬럼명) null데이터는 세지 않는다
//-- COUNT() : 전체레코드의 개수를 센다
//-- SUM(컬럼명)
//-- AVG(컬럼명)
//-- MIN(컬럼명)
//-- MAX(컬럼명)
//SELECT * FROM departments;
//
//SELECT COUNT(*), COUNT(department_name), COUNT(manager_id)
//FROM departments;
//
//--[문제] 임차인의 인원수를 세는 쿼리를 작성하시오.
//SELECT
//    COUNT(*)
//FROM
//    employees;
//    
//--[문제] 커미션을 수령하는 인원수를 세는 쿼리를 작성하시오.
//SELECT
//    COUNT(commission_pct)
//FROM
//    employees;
//    
//--[문제] 커미션을 수령하지 못하는 인원수를 세는 쿼리를 작성하시오.
//SELECT COUNT(*) - COUNT(commission_pct)
//FROM employees;
//
//--전체 임금의 합계, 임금의 평군, 최소급여 수령액, 최대급여 수령액, 
//--최대급여 수령액과 최소급여 수령액의 급여차 SALARY
//--SUM(컬럼명) AVG(컬럼명) MIN(컬럼명) MAX(컬럼명)
//
//SELECT 
//    SUM(salary),
//    ROUND(AVG(salary),2),
//    MIN(salary),
//    MAX(salary),
//    MAX(salary)-MIN(salary)
//FROM employees;
//
//
//--그루핑 시킨후 결제하기
//--GROUP BY,HAVING (그룹화된 데이터에 조건을 걸고자 할때 사용)
//SELECT 
//    department_id,
//    SUM(salary),
//    ROUND(AVG(salary),2)
//FROM employees
//GROUP by department_ID
//ORDER by 1; --1번째 컬럼이라는 뜻
//
//--HAVING
//--[문제] 7000이하의 평균급여를 받는 부서만 조회
//SELECT 
//    department_id,
//    SUM(salary),
//    ROUND(AVG(salary),2)
//FROM employees
//GROUP by department_ID
//HAVING ROUND(AVG(salary),2)<=7000
//ORDER by 1; 
//
//--[문제] 각 부서별(=그루핑)로 급여의 최대급여, 최소급여, 급여평균, 부서별 인원수를을 조회하시오
//SELECT
//    MAX(salary) as "최대급여",
//    MIN(salary) as "최소급여",
//    ROUND(AVG(salary),2) as "평균급여",
//    COUNT(department_id) as "인원수"
//FROM employees
//GROUP by department_ID;
//
//--[문제4] 80번 부서의 급여 평균, 최고, 최저, 인원수를 조회
//SELECT
//    ROUND(AVG(salary),2),
//    MAX(salary),
//    Min(salary),
//    COUNT(department_id)
//FROM employees
//--WHERE Department_id IN(80); 그루핑을 안했을 경우
//GROUP by (department_id)
//HAVING (department_id=80);
//
//    
//--[문제5]  각부서별 평균월급 전체월급 최저월급을 구하여 평균월급이 많은 순으로 조회
//--단 부서번호가 널이면 출력하지 않는다
//SELECT
//    department_id,
//    salary,
//    ROUND(AVG(salary),2),
//    MIN(salary)
//FROM employees
//GROUP by department_ID, salary
//HAVING department_id IS NOT NULL
//ORDER BY 2;
//
//--[문제6] 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 조회
//--그루핑 시킨경우에만 함수랑 같이 쓸수 있다.
//SELECT 
//    job_id,COUNT(*)
//FROM
//    employees
//GROUP by job_id
//HAVING COUNT(job_id)>=4;
//ORDER by 1;
//
///*JOIN 
// - 둘 이상의 관계가 있는 테이블들간의 데이터를 조회하는 것
// - PRIMARY KEY와 FK를 가진 컬럼이 있는 테이블을 조회
// 
// **조인의 종류'
// - CROSS JOIN (=카르테시안 조인) 잘 안씀
// 
// - EQUI JOIN 
//    PK==FK의 관계를 가진 데이터를 조인
//    FK에 NULL이 있을 경우 전체 조회가 안될수도 있다!!!
//*/
//
//-- CROSS JOIN
//SELECT 
//    e.salary, d.department_name
//FROM
//    employees e, departments d;
//    
//    
//--EQUI JOIN
//SELECT 
//    e.first_name, d.department_name
//FROM
//    employees e, departments d
//WHERE
//    d.department_id = e.department_id; --null이 있는 한명 조회 안됨
//    
//  
//    /*join
//    - cross join : m x n
//    - Equi join : pk == fk (FK쪽에 NULL이 존재하면 데이터를 조회하지 못할 수 있다)
//    - Self Join : 하나의 테이블에 PK와 FK가 존재하는 경우
//    - Inner / Outer Join : (FK쪽에 NULL이 존재하더라도 데이터를 조회한다.)
//   */
//
//
//   --cross join
//   SELECT
//       e.first_name, e.salary, d.department_name
//   FROM
//       employees e, departments d;
//       
//       
//   --Equi Join ( = ANSI 표준방식의 join)
//   SELECT
//       e.first_name, e.salary, d.department_name
//   FROM
//       employees e, departments d
//   WHERE
//       e.department_id = d.department_id; 
//       
//   -- 3개의 테이블로부터 조회
//   SELECT
//       e.first_name, d.department_name, l.city
//   FROM
//       employees e, departments d, locations l
//   WHERE
//       e.department_ID = d.department_ID
//       AND
//       d.location_id = l.location_ID;
//       
//   --[문제] 부서명, 도서명을 조회
//   SELECT
//       d.department_name, l.city
//   FROM
//       departments d, locations l
//   WHERE
//      d.location_id = l.location_id;
//       
//       
//   --[문제] 근속년수 20년 이상인 사람의 이름 입사일 부서명을 조회하시오.
//   SELECT
//       e.first_name, e.hire_date, d.department_name,
//       SUBSTR(sysdate, 1,2) - SUBSTR(hire_date, 1,2) as"근속년수"
//   FROM
//        employees e, departments d
//   WHERE
//       e.department_ID = d.department_ID
//   AND
//       SUBSTR(sysdate, 1,2) - SUBSTR(hire_date, 1,2) >=20; 
//       
//
//   --[문제] 조인과 와일드카드를 이용해서 이름에 'A'가 포함된 모든 사람의 이름과 부서명을 조회하시오.
//   --       (이때 이름을 조회할때 대소문자 구분이 없이 조회되어야 함)
//   SELECT
//       e.first_name, e.hire_date, d.department_name
//   FROM
//        employees e, departments d
//   WHERE
//       e.department_ID = d.department_ID
//   AND
//       UPPER(e.first_name) LIKE '%A%';
//       
//   --[문제] 'Seattle' 에 근무하는 모든 직원의 부서번호, 이름, 업무명(job_title), 부서명을 조회하시오.
//   SELECT 
//       e.department_id, e.first_name, j.job_title, d.department_name
//   FROM
//       departments d, employees e, jobs j, locations l
//   WHERE
//       e.department_ID = d.department_ID
//   AND
//       e.job_id = j.job_id
//   AND
//       d.location_ID = l.location_id
//   AND
//       l.city = 'Seattle'
//   ORDER BY 
//       first_name;
//       
//   --OUTER JOIN        부모쪽에 +
//   SELECT
//       e.first_name, e.salary, d.department_name
//   FROM
//       employees e, departments d
//   WHERE
//       e.department_id = d.department_id(+);
//       
//   --[문제] 부서명과 매니져명을 조회하시오
//   SELECT
//       d.department_name, d.manager_id, e.first_name
//   FROM 
//       departments d, employees e
//   WHERE
//       e.manager_id = d.manager_id;
//
//
//
//   --Self Join : 하나의 테이블에 PK와 FK가 모두 존재하는 경우 사용
//   --직원명과 매니져명을 조회하시오
//   --예) xxx의 매니저는 xxx입니다
//   -- null data가 있을때 부모쪽에 (+) 붙인다
//   SELECT
//       e1.first_name as"매니저명", e2.first_name as"직업명"
//   FROM
//       employees e1, employees e2
//   WHERE
//       e1.employee_id(+) = e2.manager_id
//   ORDER BY
//       e1.first_name;
//       
//   --삼발이가 있는쪽이 자식
//   SELECT
//       d.department_name, c.country_name, r.region_name, l.location_id
//   FROM
//       departments d, countries c, regions r, locations l
//   WHERE
//       r.region_name(+)  = c.country_name
//   AND
//       c.country_name(+) = l.location_id 
//   AND 
//       l.location_id(+) = d.department_name;
//       
//   /* SUB QUERY
//    - 쿼리안에 다른 쿼리가 포함되어 있는 명령문
//    
//    - main query
//      조회에대한 결과를 가지고 있는 바깥쪽 쿼리
//      서브쿼리의 실행 결과에 의해 메인 쿼리가 실행됨
//     
//    - sub query
//      안쪽에 포함된 쿼리
//      서브쿼리가 먼저 실행, 그 결과를 메인쿼리 조건절이나 FROM 절등에서 사용됨
//      서브쿼리가 메인의 어느부분에서 사용되는가?
//      where, from, select, having, insert into, update set 절 */
//      
//   --[문제] 사번이 162인 직원의 이름과 급여를 조회
//   SELECT 
//       first_name, salary
//   FROM
//       employees
//   WHERE
//       employee_id=162;
//       
//   --[문제] 급여가 10500인 직원의 모든 정보를 조회
//   SELECT
//       *
//   FROM
//       employees
//   WHERE 
//       salary = 10500;
//       
//   --[문제] 162번 직원이 받는 급여와 동일한 급액을 받는 모든 직원의 정보를 조회하시오(이게 서브쿼리)
//   --두번에 나눠서 작업할 걸 한번에 하는거
//   SELECT
//       *
//   FROM
//       employees
//   WHERE 
//       salary = ( 
//           SELECT 
//               salary
//           FROM
//               employees
//           WHERE
//               employee_id=162) ;
//               
//   --[문제] 서브쿼리가 from절에 있는거, 
//   -- 80번 부서의 사원번호, 이름, 급여, 부서번호를 조회하는데 8000이 넘는 사람만
//   -- rownum 맨 왼쪽 번호
//   SELECT
//       rownum, tbl.first_name
//   FROM
//       (SELECT 
//           employee_id, first_name, salary, department_id
//       FROM
//           employees
//       WHERE
//           department_id = 80) tbl
//   WHERE
//       tbl.salary>8000;
//       
//   --[문제] 서브쿼리 조인 같이들어가는거 'Bruce'라는 직원과 동일한 부서에 근무하는 직원을 조회하시오
//   -- 조회 먼저 조건 동일부서(id),  (직원명:first_name, 부서명: department_name)
//   SELECT
//       e.first_name, d.department_name
//   FROM
//       employees e, departments d
//   WHERE
//       e.department_id = d.department_id   --join때문에 나오는 조회조건
//   AND
//       e.department_id = (
//           SELECT
//               department_id
//           FROM
//               employees
//           WHERE
//               first_name = 'Bruce');
//           
//   --[문제] 30번 부서에 근무하는 직책과 동일한 직책으로 근무하는 직원이 다른 부서에도 있는지 확인하여 직원의 모든정보를 검색
//   SELECT
//       *
//   FROM
//       employees
//   WHERE
//       job_id IN (
//           SELECT DISTINCT 
//               job_id
//           FROM
//               employees
//           WHERE
//               department_id = 30);
//    
//       
//   --[문제] 회사의 전체 급여평균(6461.xx)보다 적게 받는 직원의 명단을 조회하시오
//   SELECT
//       *
//   FROM
//       employees
//   WHERE   
//       salary<(
//           SELECT AVG
//               (salary)
//           FROM
//               employees);
//       
//   --[문제] 각 직원별로 자신이 근무하고 있는 부서의 평균임금을 출력하는 SQL 명령문은? 이름,급여,부서번호,부서명, 부서 평균급여
//
//
//
//
//       
//
//    
//
//
//
//
//
//
//
//
//
//
//
//
//}
