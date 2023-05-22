/* 12�� 13��(ȭ) 43�� 1�� ������ DB ���� */
DROP TABLE todolist;
DROP TABLE personal;
DROP SEQUENCE todolist_seq;

-- personal ���̺� �����Ͻÿ� (5��)
CREATE TABLE personal
(
    email  VARCHAR2(20) PRIMARY KEY
    , passwd VARCHAR2(20) NOT NULL
    , usrname VARCHAR2(20) NOT NULL
);

-- todolist ���̺� �����Ͻÿ� (5��)
CREATE TABLE todolist
(
    seqno NUMBER PRIMARY KEY
    , email VARCHAR2(20) NOT NULL REFERENCES personal(email) ON DELETE CASCADE
    , regdate DATE DEFAULT sysdate
    , todo VARCHAR2(3000) DEFAULT '���� ����'
    , importance VARCHAR2(10) CHECK (importance IN ( '����', '����', '����')) 
    , categories CHAR(6) DEFAULT '����' CHECK (categories IN ( '����', 'ȸ��')) 
);

-- todolist_seq ������ ��ü�� �����Ͻÿ� (2��)
CREATE SEQUENCE todolist_seq;










