public class student
{
private String name="Ashu";
void set(String name1)
{
this.name=name1;
}
String get()
{
return name;
} 
}




class Test 
{
public static void main(String args[])
{
student s=new student();
System.out.println(s.get());
s.set("Chottu");
System.out.println(s.get());

}
}