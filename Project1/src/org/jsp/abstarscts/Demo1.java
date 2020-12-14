package org.jsp.abstarscts;

public class Demo1 extends Demo
{
	public void print(object obj)
	{
		if(obj instanceof student)
		{
			((student)obj).disp();
		}
	}

}
