create table fruit(
	f_name varchar2(10 char) primary key,
	f_price number(5) not null
);

insert into fruit values('����', 4000);
insert into fruit values('���', 8000);
insert into fruit values('����', 3500);

select * from fruit;