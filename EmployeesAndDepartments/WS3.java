    /*

WORKSHEET 3 - OPERATORS
COMPLETED BY ANDRII SKVORTSOV

1. Add a record containing a new department number (50), name
(PENSIONS) and location (CHICAGO) into the DEPT table.
    INSERT INTO dept (DEPTNO, DNAME, LOC) VALUES ('50', 'PENSIONS', 'CHICAGO');

2. Get the employee name and department location of the
employee called ADAMS.
    SELECT emp.ename, dept.LOC FROM emp, dept WHERE emp.deptno = dept.DEPTNO;

3. Get the maximum salary paid in each department.
    SELECT max(sal), JOB FROM emp GROUP by JOB;

4. Update the emp table to give all clerk's a £100 increase in
salary.
    UPDATE emp SET SAL = SAL+100 WHERE JOB = "CLERK";

5. Get the employee name and total salary of all employees who
are salesmen.
    SELECT JOB, ENAME, sal + ifnull(COMM, 0) FROM emp WHERE JOB = "Salesman";

6. Delete all records in the dept table which have a department
number of 50 and then view the contents of the table to ensure
that the operation has been completed correctly.
    DELETE from dept WHERE DEPTNO = 50;

7. Get the number of employees in each job in each department in
the company. Also list the department they are in, the job title,
the sum of the salaries of each employee type in each
department, the average salary of each employee type in each
department, and show the information grouped by department
name and job.
Hint : Use sum(sal), count(*), avg(sal) and group by.
Note : Count(*) counts the number of rows in each group as
defined by the 'group by' command.
Note : Sum and Avg work the groups of rows as defined by the
'group by' command.
    SELECT COUNT(empno), sum(SAL), AVG(SAL), job, dept.DNAME FROM emp, dept WHERE emp.DEPTNO=dept.DEPTNO GROUP BY emp.deptno

8. Show the same information as query 7 does but only show the
groups having at least two employees.
Hint : Having count(*)
    SELECT COUNT(empno), sum(SAL), AVG(SAL), job, dept.DNAME FROM emp, dept WHERE emp.DEPTNO=dept.DEPTNO GROUP BY emp.deptno HAVING COUNT(emp.empno)>=2
 */