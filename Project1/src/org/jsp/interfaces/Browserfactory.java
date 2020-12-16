package org.jsp.interfaces;

public class Browserfactory 

{
  public  Browser getBrowser(String type)
  {
  Browser b=null;
  if(type.equals("Chrome"))
  {
	  b=new Chrome();
  }
  else if(type.equals("Opera"))
  {
	  b=new Opera();
	  
  }
  else if(type.equals("Safari"))
  {
	  b=new Safari();
  }
  return b;
  }
  
}


