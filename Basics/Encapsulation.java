class circle
{
private int radius;
public int getradius()
{
return radius;
}
public void setradius(int r)
{
	radius=r;
}
}
class Encapsulation
{
	public static void main(String[] args)
	{
		circle c1=new circle();
		c1.setradius(10);
		int radius=c1.getradius();
		System.out.println(radius);
	}
}