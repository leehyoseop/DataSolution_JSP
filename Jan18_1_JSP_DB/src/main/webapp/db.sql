create table apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_price number(5) not null
);

insert into apple values('����', '����', 8500);
insert into apple values('�ϻ�', '��Ȳ', 9000);
insert into apple values('�ν���������', '������', 9999);
select * from apple;