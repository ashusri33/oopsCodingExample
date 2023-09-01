class Employee
{
int salary=4000;
}
class Programmer extends Employee
{
int bonus=4000;
}
class InheritanceTest
{
public static void main(String args[])
{
Programmer p=new Programmer();
int total=p.salary+p.bonus;
System.out.println(total);

}
}
