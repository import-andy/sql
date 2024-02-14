/* 
COMPLETED BY ANDRII SKVORTSOV

WORKSHEET 1
1. Describe the Structure of the EMP Table.
    DESCRIBE emp;

2. List all of the information in all of the fields in the EMP tabl e.
    SELECT * FROM emp;

3. List the name and number of all the departments in the DEPT table.
    SELECT DEPTNO, DNAME from dept;

4. List all of the information in the EMP table for those employees who are in department number 30.
    SELECT * FROM emp WHERE DEPTNO = 30;

5. Retrieve all of the information in the EMP table from those employees who are MANAGERs and who earn more
than £2500 per year.
    SELECT * from EMP WHERE JOB = "manager" AND SAL >= 2500;
    
6. List the name, job and department number of all of those employees who are managers and who are not in
department number 30.
Hint : !=
    SELECT ENAME, JOB, DEPTNO FROM EMP WHERE JOB = "MANAGER" AND DEPTNO != 30;

7. List the name and salary of all the employees in the EMP table who earn between £1200 and £1400
Hint : BETWEEN A and B
    SELECT ENAME, SAL FROM emp WHERE SAL BETWEEN 1200 and 1400;

8. List all of the information in DEPT about those departments whose number is either 10 or 30.
Hint : IN (10,30)
    SELECT * FROM dept WHERE deptno in (10,30);


    
WORKSHEET 2
1. List the salaries, jobs, and names of the employees who are in department 30. Display the rows in salary order.
    SELECT sal, job, ENAME FROM emp WHERE DEPTNO = 30 ORDER BY SAL ASC;

2. List the job, salary and employee name of all those employees in the emp table. Display the rows in job order
and then in descending salary order.
Hint : Order by
Hint : Desc
    SELECT job, sal, ENAME FROM emp ORDER BY SAL DESC;

3. Get a listing of the distinct jobs in the emp table.
Hint : Distinct
    SELECT DISTINCT JOB FROM emp;
    
4. Get the employee name and department number of all employees called ADAMS.
    SELECT ENAME, DEPTNO FROM emp WHERE ENAME = "ADAMS";

5. Get the location of department number 20.
    SELECT LOC from dept WHERE DEPTNO = 20;

6. Get the employee name and total salary of all employees who are salesmen.
Hint : Sal + Comm
    SELECT ename, SAL + COMM from emp WHERE JOB = "salesman";
 */
