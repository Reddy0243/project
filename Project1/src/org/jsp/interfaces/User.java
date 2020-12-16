package org.jsp.interfaces;

import java.util.Scanner;

public class User extends Browserfactory
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Browserfactory b=new Browserfactory();
		for(;;)
		{
			
		
		System.out.println("1.chrome\n2.opera\n3.safari\n4.exit");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: b.getBrowser("Chrome").start();
		        break;
		case 2: b.getBrowser("Opera").start();
                break;
		case 3: b.getBrowser("Safari").start();
		
                break;
                
		case 4: System.exit(0);
		}
		}
		
		
		
	
	}

}