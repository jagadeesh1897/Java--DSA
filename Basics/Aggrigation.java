class sim
{
long simNo;
String simName;
sim(long simNo,String simName)
{
this.simNo=simNo;
this.simName=simName;
}
public void displaysim()
{
System.out.println(simNo);
System.out.println(simName);
}
}
class Mobile
{
sim s;
String MobileName;
String Color;
void insertsim(sim s)
{
this.s=s;
}
Mobile(String MobileName,String Color)
{
this.MobileName=MobileName;
this.Color=Color;
}
public void display()
{
if(s!=null)s.displaysim();
System.out.println(MobileName);
System.out.println(Color);
}
}
class Aggrigation
{
public static void main(String[] args)
{
Mobile m=new Mobile("vivo","Black");
m.insertsim(new sim(6281819,"Jio"));
m.display();
}
}
