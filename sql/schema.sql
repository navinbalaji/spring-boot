
create database mef_client;

use mef_client;


CREATE TABLE user
(
id int NOT NULL AUTO_INCREMENT,
userid varchar(255),
password varchar(255),
phone varchar(255),
created_at DATETIME,
modified_at DATETIME,
is_active int,
PRIMARY KEY (id)
);

CREATE TABLE student
(
id int NOT NULL AUTO_INCREMENT,
firstname varchar(255),
lastname varchar(255),
data_of_joining DATE,
plan_type int,
userid int NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (userid) REFERENCES user(id)
);

CREATE TABLE teacher
(
id int NOT NULL AUTO_INCREMENT,
firstname varchar(255),
lastname varchar(255),
userid int NOT NULL,
meeting_id varchar(255),
PRIMARY KEY(id),
FOREIGN KEY (userid) REFERENCES user(id)
);

CREATE TABLE admin
(
id int NOT NULL AUTO_INCREMENT,
firstname varchar(255),
lastname varchar(255),
userid int NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (userid) REFERENCES user(id)
);

CREATE TABLE user_leave
(
id int NOT NULL AUTO_INCREMENT,
user_id int NOT NULL,
date DATE,
PRIMARY KEY(id),
FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE one_on_one
(
id int NOT NULL AUTO_INCREMENT,
student_id int NOT NULL,
teacher_id int NOT NULL,
slot_time TIMESTAMP,
no_of_slots int,
PRIMARY KEY(id),
FOREIGN KEY (student_id) REFERENCES student(id),
FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);

CREATE TABLE one_on_one_slot
(
id int NOT NULL AUTO_INCREMENT,
one_on_one_id int NOT NULL,
is_completed int,
slot_name varchar(255),
description varchar(5000),
PRIMARY KEY(id),
FOREIGN KEY (one_on_one_id) REFERENCES one_on_one(id)
);

CREATE TABLE grammer_session
(
id int NOT NULL AUTO_INCREMENT,
slot_time DATETIME,
teacher_id int,
topic_name varchar(255),
summary varchar(10000),
recorded_url varchar(1000),
transcript_url varchar(1000),
PRIMARY KEY(id),
FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);

CREATE TABLE grammer_session_student
(
id int NOT NULL AUTO_INCREMENT,
grammer_session_id int NOT NULL,
student_id int NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (student_id) REFERENCES student(id),
FOREIGN KEY (grammer_session_id) REFERENCES grammer_session(id)
);

CREATE TABLE daily_live_session
(
id int NOT NULL AUTO_INCREMENT,
slot_time DATETIME,
teacher_id int,
topic_name varchar(255),
summary varchar(10000),
recorded_url varchar(1000),
transcript_url varchar(1000),
PRIMARY KEY(id),
FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);

CREATE TABLE daily_live_session_student
(
id int NOT NULL AUTO_INCREMENT,
daily_live_id int NOT NULL,
student_id int NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (student_id) REFERENCES student(id),
FOREIGN KEY (daily_live_id) REFERENCES daily_live_session(id)
);

