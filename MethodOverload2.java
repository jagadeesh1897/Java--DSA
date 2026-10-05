import java.util.Scanner;
class MethodOverload2
{
public static void main(String[] args)
{
m1(10);
m1(20.6);
m1('A');
m1(10.8f);
}
public static void m1(int i)
{
System.out.println(i);
}
public static void m1(double d)
{
System.out.println(d);
}
}
