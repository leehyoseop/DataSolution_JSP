create table Member(
	m_name varchar2(10 char) not null,
	m_id varchar2(10 char) primary key,
	m_pw varchar2(10 char) not null
);

insert into Member values('��ȿ��', 'leehyoseop', '12345');
insert into Member values('��뿵', 'kimdae', '12345');

select * from Member;

drop table Member;