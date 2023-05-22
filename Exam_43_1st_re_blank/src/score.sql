/* 12월 26일(월) 43기 1차 역량평가 재평가 */
DROP TABLE student;

CREATE TABLE student
(
    stdid           NUMBER(20) PRIMARY KEY 
    ,stdname        VARCHAR2(20) NOT NULL
    ,it             NUMBER(6,2) DEFAULT 0.0 NOT NULL
    ,language       NUMBER(6,2) DEFAULT 0.0 NOT NULL
    ,basic          NUMBER(6,2) DEFAULT 0.0 NOT NULL
);

COMMIT;


INSERT INTO student 
(stdid, stdname, it, language, basic)
VALUES
(15, '홍길동', 85.5, 92, 79.6);


SELECT * FROM student;
