package org.jsp.abstarscts;
public class Sqlserver extends Database
{
      public void connect()
      {
	  System.out.println("database is connected to sqlserver");
      }
      public void disconnect()
      {
	  System.out.println("database is disconnected from sqlserver");
      }
}
