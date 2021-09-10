# 1.Query to find Second Highest Salary of Employee?
**Ans** select ename, sal from emp e1 where 4=(select count(distinct sal) from emp e2 where e1.sal<=e2.sal)
