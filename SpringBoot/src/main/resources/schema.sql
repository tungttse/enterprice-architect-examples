DROP TABLE IF EXISTS Student;
CREATE TABLE Student
(
  id varchar(36) not null primary key,
  name varchar(255) not null,
  gpa double,
  created timestamp,
  modified timestamp
);
