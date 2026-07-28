import java.util.Scanner;
class swap
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int c;
int a=sc.nextInt();
System.out.println("enter b value");
int b=sc.nextInt();
System.out.println("before swappping");
System.out.println("a value is:"+a);
System.out.println("b value is:"+b);
c=b;
b=a;
a=c;
System.out.println("after swapping");
System.out.println("a value is:"+a);
System.out.println("b value is:"+b);
}
}