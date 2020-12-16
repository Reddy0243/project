package org.jsp.interfaces;

public class shapefactory    
{
	public shapes getshape(String type)
	{
	shapes s =null;
	if(type.equals("circle"))
	{
		s=new circle();
		
		
	}
	else if(type.equals("square"))
	{
		s= new square();
		
	}
	else if(type.equals("rectangle"))
	{
		s= new rectangle();
		
	}
	
	return s;
	

}
}
