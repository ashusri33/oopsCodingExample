       
    
              //Q splits a string  and convert it into the array of words

import java.util.*;
class Split
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String str[]=s.split(" ");
for(String a:str)
{
System.out.println(a);
}
}
}