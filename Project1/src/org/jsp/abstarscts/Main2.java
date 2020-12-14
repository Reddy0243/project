package org.jsp.abstarscts;

public class Main2
{
  public static void main(String[] args)
  {
	Oracle o=new Oracle();
	o.connect();
	o.disconnect();
	Sqlserver s=new Sqlserver();
	s.connect();
	s.disconnect();
	DB2 d=new DB2();
	d.connect();
	d.disconnect();
	
}
}
