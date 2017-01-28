DROP database IF EXISTS SelectionCommittee;
CREATE database if not exists SelectionCommittee default CHARACTER set utf8 ;
use SelectionCommittee;

DROP TABLE IF exists Users;
CREATE TABLE If not exists Users(
id int not null AUTO_INCREMENT,
firstName varchar(45) not null,
lastName varchar(45) not null,
email varchar(255) not null,
login varchar(45) not null,
password varchar (32) not null,
role enum('client','admin'),
primary key (id),
unique index id_unique (id asc),
unique index email_unique (email asc))
engine = MyISAM;

insert into Users(firstName,lastName,email,login,password,role) values ('Kotov','Nicholas','kot@gmail.com','kot','12345','admin');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone01','Alex','Clone01@gmail.com','Clone01','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone02','Rex','Clone02@gmail.com','Clone02','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone03','Cody','Clone03@gmail.com','Clone03','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone04','Alex','Clone04@gmail.com','Clone04','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone05','fives','Clone05@gmail.com','Clone05','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone06','gear','Clone06@gmail.com','Clone06','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone07','seventh','Clone07@gmail.com','Clone07','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone08','eighth','Clone08@gmail.com','Clone08','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone09','ninth','Clone09@gmail.com','Clone09','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone10','tenth','Clone10@gmail.com','Clone10','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone11','eleventh','Clone11@gmail.com','Clone11','12345','client');
insert into Users(firstName,lastName,email,login,password,role) values ('Clone12','twelfth','Clone12@gmail.com','Clone12','12345','client');

DROP TABLE if exists Faculty;
CREATE TABLE IF not exists Faculty(
id int not null AUTO_INCREMENT,
nameOfFaculty varchar(45) not null,
seats int not null,
primary key (id))
engine = MyISAM;

insert into Faculty(nameOfFaculty,seats) values ('Technical Engineering Faculty', 1);
insert into Faculty(nameOfFaculty,seats) values ('Medical Faculty', 2);
insert into Faculty(nameOfFaculty,seats) values ('Pharmacology Faculty', 3);
insert into Faculty(nameOfFaculty,seats) values ('Economical Faculty', 4);
insert into Faculty(nameOfFaculty,seats) values ('Law Faculty', 5);
insert into Faculty(nameOfFaculty,seats) values ('Sociology Faculty', 6);
insert into Faculty(nameOfFaculty,seats) values ('Programming Faculty', 7);
insert into Faculty(nameOfFaculty,seats) values ('Phisical Faculty', 8);
insert into Faculty(nameOfFaculty,seats) values ('Chemical Engineering Faculty', 9);
insert into Faculty(nameOfFaculty,seats) values ('Biology Faculty', 10);
insert into Faculty(nameOfFaculty,seats) values ('Tourism Faculty', 11);

DROP TABLE if exists Subject;
Create table if not exists Subject(
id int not null AUTO_INCREMENT,
nameOfSubject varchar(45) not null,
primary key (id))
engine = MyISAM;

insert into Subject(nameOfSubject) values ('Mathimatics');
insert into Subject(nameOfSubject) values ('Physics');
insert into Subject(nameOfSubject) values ('English');
insert into Subject(nameOfSubject) values ('Biology');
insert into Subject(nameOfSubject) values ('Chemistry');
insert into Subject(nameOfSubject) values ('History');
insert into Subject(nameOfSubject) values ('Geography');
insert into Subject(nameOfSubject) values ('Ukrainian');

DROP TABLE If exists Faculty_Subjects;
create table if not exists Faculty_Subjects(
id int not null AUTO_INCREMENT,
facultyId INT NOT NULL,
subjectId INT NOT NULL,
primary key(id,facultyId,subjectId),
unique index idFacultySubjects_UNIQUE (id asc),
foreign key (facultyId) references Faculty(id)
ON DELETE CASCADE ON UPDATE RESTRICT,
foreign key(subjectId) references Subject(id)
ON DELETE CASCADE ON UPDATE RESTRICT)
engine = MyISAM;

insert into Faculty_Subjects(facultyId, subjectId) values (1, 1);
insert into Faculty_Subjects(facultyId, subjectId) values (1, 2);
insert into Faculty_Subjects(facultyId, subjectId) values (2, 5);
insert into Faculty_Subjects(facultyId, subjectId) values (2, 8);
insert into Faculty_Subjects(facultyId, subjectId) values (3, 4);
insert into Faculty_Subjects(facultyId, subjectId) values (3, 5);
insert into Faculty_Subjects(facultyId, subjectId) values (4, 3);
insert into Faculty_Subjects(facultyId, subjectId) values (4, 6);
insert into Faculty_Subjects(facultyId, subjectId) values (5, 6);
insert into Faculty_Subjects(facultyId, subjectId) values (5, 8);
insert into Faculty_Subjects(facultyId, subjectId) values (6, 3);
insert into Faculty_Subjects(facultyId, subjectId) values (6, 6);
insert into Faculty_Subjects(facultyId, subjectId) values (6, 8);
insert into Faculty_Subjects(facultyId, subjectId) values (7, 1);
insert into Faculty_Subjects(facultyId, subjectId) values (7, 2);
insert into Faculty_Subjects(facultyId, subjectId) values (7, 3);
insert into Faculty_Subjects(facultyId, subjectId) values (8, 2);
insert into Faculty_Subjects(facultyId, subjectId) values (8, 8);
insert into Faculty_Subjects(facultyId, subjectId) values (9, 1);
insert into Faculty_Subjects(facultyId, subjectId) values (9, 5);
insert into Faculty_Subjects(facultyId, subjectId) values (10, 4);
insert into Faculty_Subjects(facultyId, subjectId) values (10, 5);
insert into Faculty_Subjects(facultyId, subjectId) values (11, 7);
insert into Faculty_Subjects(facultyId, subjectId) values (11, 8);

DROP TABLE If exists Faculty_quantitySeats;
create table if not exists Faculty_quantitySeats(
id int not null AUTO_INCREMENT,
facultyId INT NOT NULL,
quantitySeats INT NOT NULL,
primary key(id,facultyId),
foreign key (facultyId) references Faculty(id)
ON DELETE CASCADE ON UPDATE RESTRICT)
engine = MyISAM;

insert into Faculty_quantitySeats(facultyId, quantitySeats) values (1, 1);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (2, 2);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (3, 3);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (4, 4);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (5, 5);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (6, 6);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (7, 7);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (8, 8);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (9, 9);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (10, 10);
insert into Faculty_quantitySeats(facultyId, quantitySeats) values (11, 11);

DROP TABLE If exists User_Faculty_Status;
create table if not exists User_Faculty_Status(
id int not null AUTO_INCREMENT,
userId INT NOT NULL,
facultyId INT NOT NULL,
statusUser enum('request','requestaccepted','requestdenied','accepted','notaccepted'),
primary key(id,userId,facultyId),
foreign key (userId) references userId(id)
ON DELETE CASCADE ON UPDATE RESTRICT,
foreign key (facultyId) references Faculty(id)
ON DELETE CASCADE ON UPDATE RESTRICT)
engine = MyISAM;

insert into User_Faculty_Status(userId, facultyId, statusUser) values (6, 1, 'accepted');
insert into User_Faculty_Status(userId, facultyId, statusUser) values (2, 2, 'requestaccepted');
insert into User_Faculty_Status(userId, facultyId, statusUser) values (3, 2, 'requestaccepted');
insert into User_Faculty_Status(userId, facultyId, statusUser) values (4, 2, 'requestaccepted');
insert into User_Faculty_Status(userId, facultyId, statusUser) values (5, 2, 'request');

DROP TABLE If exists User_Subject_Mark;
create table if not exists User_Subject_Mark(
id int not null AUTO_INCREMENT,
userId INT NOT NULL,
subjectId INT NOT NULL,
mark INT NOT NULL,
primary key(id,userId),
foreign key (userId) references userId(id)
ON DELETE CASCADE ON UPDATE RESTRICT,
foreign key (subjectId) references subjectId(id)
ON DELETE CASCADE ON UPDATE RESTRICT)
engine = MyISAM;

insert into User_Subject_Mark(userId, subjectId, mark) values (6, 1, 5);
insert into User_Subject_Mark(userId, subjectId, mark) values (6, 2, 5);
insert into User_Subject_Mark(userId, subjectId, mark) values (2, 5, 5);
insert into User_Subject_Mark(userId, subjectId, mark) values (2, 8, 4);
insert into User_Subject_Mark(userId, subjectId, mark) values (3, 5, 4);
insert into User_Subject_Mark(userId, subjectId, mark) values (3, 8, 3);
insert into User_Subject_Mark(userId, subjectId, mark) values (4, 5, 3);
insert into User_Subject_Mark(userId, subjectId, mark) values (4, 8, 2);
insert into User_Subject_Mark(userId, subjectId, mark) values (5, 5, 2);
insert into User_Subject_Mark(userId, subjectId, mark) values (5, 8, 5);

select * from faculty;
select * from faculty_quantityseats;
select * from faculty_subjects;
select * from subject;
select * from user_faculty_status;
select * from user_subject_mark;
select * from users;
