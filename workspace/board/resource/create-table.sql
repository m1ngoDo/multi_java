create table board(
 id number primary key,
 member_id varchar2(20),
title varchar2(50) not null,
 content CLOB,
 read_count number,
write_date date,
  update_date date,
 constraint board_fk  foreign key(member_id) references members(id));

create sequence board_seq;

insert into board values(board_seq.nextval, 'carami','재미있어야하는데...','잘하고 있나요??',0,sysdate,sysdate);