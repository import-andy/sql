/*
WORKSHEET 4
SUBQUERIES, RIGHT/LEFT/INNER JOIN, DATA DEFENITION LANGUAGE, VIEWS
COMPLETED BY ANDRII SKVORTSOV

QUESTION 1
List the names and jobs for all of the employees having the same job as JONES.
    select ename, job from emp where job = (select job from emp where ENAME = "JONES");

QUESTION 2
List the name and salary of each employee who earns more than the average of all of
the employees salaries.
    SELECT ENAME, SAL FROM EMP WHERE SAL > (SELECT AVG(SAL) FROM EMP);

QUESTION 3
Using a single command, create a table called promotion with fields called ename,
job, salary, and comm, then copy the corresponding data from the fields in the emp
table into the promotion table for all those employee whose commission is more
than one quarter of their salary.
    CREATE VIEW PROMOTION AS SELECT ENAME, JOB, SAL, COMM FROM EMP WHERE COMM > SAL/4;

QUESTION 4
Create a view called emp10 with the empno, ename, and job data for department 10.
    CREATE VIEW EMP10 AS SELECT EMPNO, ENAME, JOB FROM EMP WHERE DEPTNO = 10;

QUESTION 5
Insert the following information into the EMP10 view
20 BAILEY MANAGER
ANY PROBLEMS?
    WE CAN'T INSERT DATA INTO VIEW

QUESTION 6
List all of the data in view emp10.
    SELECT * FROM EMP10;

QUESTION 7
Create the Qual table demonstrated in the video
    CREATE TABLE QUAL (
        QUALID            SMALLINT(2) NOT NULL,
        QUALNAME          CHAR(14),
        QUALFIELD         CHAR(13),
    PRIMARY KEY (QUALID));

    INSERT INTO QUAL VALUES (1, 'BSC', 'SCIENCE');
    INSERT INTO QUAL VALUES (2, 'BCOMM', 'BUSINESS');
    INSERT INTO QUAL VALUES (3, 'BENG', 'ENGINEERING');
    INSERT INTO QUAL VALUES (4, 'BA', 'HUMANITIES');
    ...
    FOREIGN KEY (QUALID) REFERENCES QUAL(QUALID),

QUESTION 8
Create a table called proj with the following fields :
projno numeric 3 long not null
pname character 5 long
budget numeric 7 long with 2 decimal places

QUESTION 9
Insert into proj the following data:
101 ALPHA 96000
102 BETA 82000
103 GAMMA 1 5000

    CREATE TABLE PROJ (
        PROJID            SMALLINT(3) NOT NULL,
        PROJNAME          CHAR(5),
        BUDGET            FLOAT(2),
    PRIMARY KEY (PROJID));

    INSERT INTO PROJ VALUES (101, "ALPHA", 96000);
    INSERT INTO PROJ VALUES (102, "BETA", 82000);
    INSERT INTO PROJ VALUES (103, "GAMMA", 15000);

QUESTION 10
View the data in proj.
    SELECT * FROM `proj`;

QUESTION 11
Give the emp table a column called projno and describe the table. The proj field
should have the same type and size as in the proj table.


QUESTION 12
Assign everyone in department 20 and every salesman to project 101 and view the
emp table.

QUESTION 13
Assign everyone else to project 102 and view the emp table.

QUESTION 14
List the employee numbers, jobs, department numbers and project name's.

QUESTION 15
Alter the width of the project budget field to 8 places including 2 decimal places.

QUSETION 16
Change the budget for project 103 to 105000

QUESTION 17
View the employee, number, name, department number, department location,
project name and project budget

QUESTION 18
Create a view called PERSONNEL which contains employee names, jobs and
project names.

QUESTION 19
Using the PERSONNEL view, select the employee names, jobs and project names
for all employees who are managers.

QUESTION 20
Delete the PERSONNEL view



 */