

                                 // Example of method overriding and run -time polymorphism

class Bike
{
void run()
{
System.out.println("Biking is running");
}
}


class Splendor extends Bike
{
void run()
{
System.out.println("Splendor is running ");
}

public static void main(String args[])
{
Splendor b=new Splendor();
b.run();
}
}