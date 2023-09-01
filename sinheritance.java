class Animal 
{
void eat()
{
System.out.println("Eat");
}

}
class Dog extends Animal
{
void bark()
{
System.out.println("bark");
}

}
class InheritanceTest
{
public static void main(String args[])
{
Dog d=new Dog();
d.eat();
d.bark();
}
}
