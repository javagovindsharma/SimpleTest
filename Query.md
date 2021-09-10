** 1.Query to find Second Highest Salary of Employee?**
**Ans** select ename, sal from emp e1 where 2=(select count(distinct sal) from emp e2 where e1.sal<=e2.sal)
**2.Query to find duplicate rows in table?**
**Ans** 
**3.How to fetch  monthly Salary of Employee if annual salary is given?**
**Ans** select ename ,sal/12 as 'monthy sal' from emp
** 4.What is the Query to fetch first record from Employee table? **

**Ans**  worked for Oracle 
>  Select * from Employee where Rownum =1;\Select * from Employee where Rowid= select min(Rowid) from Employee;
