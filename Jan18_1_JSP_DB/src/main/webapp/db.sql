create table apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_price number(5) not null
);

insert into apple values('충주', '빨강', 8500);
insert into apple values('일산', '주황', 9000);
insert into apple values('로스앤젤레스', '무지개', 9999);
select * from apple;