package org.jsp.abstarscts;
public class Oracle extends Database
{
	public void connect()
	{
		System.out.println("database is connected to oracle");
	}
	public void disconnect()
	{
		System.out.println("database is disconnected from oracle");
	}
}
