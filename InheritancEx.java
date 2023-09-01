/*
class Employee
{
 int salary=40000;
}
class Programmer extends Employee
{
int bonus=10000;
public static void main(String args[])
{
   Programmer p=new Programmer();
   System.out.println("Salary"+p.salary);
   System.out.println("Bonus"+p.bonus);
}
}
*/

class Employee
{
 int salary=40000;
}
class Programmer extends Employee
{
int bonus=10000;
}
class Main
{
public static void main(String args[])
{
   Programmer p=new Programmer();
   System.out.println("Salary"+p.salary);
   System.out.println("Bonus"+p.bonus);
}
}
// Both Examples are right
