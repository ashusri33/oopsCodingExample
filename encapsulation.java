
                                                          // Example of method overloading and compile-time polymorphism

class Multiply
{
int multiply(int a ,int b)
{
  return a*b;
}
double multiply(double a ,double b)
{
return a*b;
}
}
class Main
{
public static void main(String args[])
{
Multiply M=new Multiply();
int m1= M.multiply(2,4);
double m2= M.multiply(2.0,4.0);
System.out.println(m1);
System.out.println(m2);
}
}