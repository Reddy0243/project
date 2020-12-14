package gmail.logout;

	class A 
	{
		A(double arg)
		{
			
			System.out.println("in class A no argument");
		}
		A()
		{
			
			this(10.12);
			System.out.println("in class A double argument");
		}

	}
	class B  extends A
	{
		B( )
		{
			
			System.out.println("in class B");
		}
	}
	class C extends B
	{
		C()
		{
		 
		System.out.println("in class C");
		}

	}
	class D extends C 
	{
		D()
		{
			
			
			System.out.println("in class D");
		}

	}
	public class Chaining
	{
		public static void main(String[] args) 
			{
				new D();
			}
	}



