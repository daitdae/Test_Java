/* 12월 13일(화) 43기 1차 역량평가 DB 설계 */
DROP TABLE todolist;
DROP TABLE personal;
DROP SEQUENCE todolist_seq;

-- personal 테이블 생성하시오 (5점)
CREATE TABLE personal
(
    email  VARCHAR2(20) PRIMARY KEY
    , passwd VARCHAR2(20) NOT NULL
    , usrname VARCHAR2(20) NOT NULL
);

-- todolist 테이블 생성하시오 (5점)
CREATE TABLE todolist
(
    seqno NUMBER PRIMARY KEY
    , email VARCHAR2(20) NOT NULL REFERENCES personal(email) ON DELETE CASCADE
    , regdate DATE DEFAULT sysdate
    , todo VARCHAR2(3000) DEFAULT '할일 없음'
    , importance VARCHAR2(10) CHECK (importance IN ( '높음', '보통', '낮음')) 
    , categories CHAR(6) DEFAULT '개인' CHECK (categories IN ( '개인', '회사')) 
);

-- todolist_seq 시퀀스 객체를 생성하시오 (2점)
CREATE SEQUENCE todolist_seq;










