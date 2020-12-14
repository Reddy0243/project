package gmail.logout;

public class  Data
{
	private int x;
	private double y;
	public Data(int x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public int getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(double y)
	{
		this.y=y;

	}
}
class hiding
{

	public static void main(String[] args) 
	{
		Data d= new Data(10,10.11);

		System.out.println("x  ="+d.getx());
		System.out.println("y  ="+d.gety());
	}
}

