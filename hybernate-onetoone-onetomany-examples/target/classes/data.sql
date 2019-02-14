insert into course (id, name) values ( 10001,'jpa in 50 steps');
insert into course (id, name) values ( 10002,'spring in 50 steps');
insert into course (id, name) values ( 10003,'spring boot in 50 steps');

insert into passport (id, number) values ( 40001,'E234234');
insert into passport (id, number) values ( 40002,'F234234');
insert into passport (id, number) values ( 40003,'G234234');

insert into student ( id, name, passport_id ) values ( 20001,'Ranga', 40002);
insert into student ( id, name, passport_id ) values ( 20002,'Adam', 40001);
insert into student ( id, name, passport_id ) values ( 20003,'Amy', 40003);


insert into review (id, rating, description, course_id ) values ( 50001,'4','Great course',10001);
insert into review (id, rating, description, course_id ) values ( 50002,'5','Great course1',10001);
insert into review (id, rating, description, course_id ) values ( 50003,'6','Great course2',10002);


