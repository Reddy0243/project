package gmail.login;

public class Demo 
{
	public void print()
	{
		System.out.println("within the pkg");
		System.out.println("------------------------------");
		
		
		
		 Test t =new Test();
		 
		 
		 System.out.println("default  ->   x="+t.x);
		 System.out.println("protected  -> y ="+t.y);
		 System.out.println("public  ->   z="+t.z);
		 System.out.println("private  ->   m="+t.getM());
		 System.out.println( );
		 
	}

}
