create table Memo(
	m_no number(4) primary key,
	m_text varchar2(100 char) not null,
	m_date date not null
);

create sequence memo_seq;

select * from Memo;
insert into Memo values(memo_seq.nextval, '안녕하세요', '20251212');
insert into Memo values(memo_seq.nextval, '반 갑 습 니 다', '20241111');