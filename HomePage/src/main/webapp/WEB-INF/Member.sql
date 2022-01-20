create table Member(
	m_name varchar2(10 char) not null,
	m_id varchar2(10 char) primary key,
	m_pw varchar2(10 char) not null
);

insert into Member values('¿Ã»øº∑', 'leehyoseop', '12345');
insert into Member values('±Ë¥Îøµ', 'kimdae', '12345');

select * from Member;

drop table Member;