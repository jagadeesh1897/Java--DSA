class A
{
 A()
 {
  super();
  System.out.println("constructor in A");
 }
}
class B extends A
{
 B()
 {
  super();
  System.out.println("constructor in B");
 }
}
class C extends B
{
 C()
 {
  super();
  System.out.println("constructor in C");
 }
}
class callToSuper
 {
  public static void main(String[] args)
  {
   new C();
  }
}