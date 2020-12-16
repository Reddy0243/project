package org.jsp.interfaces;
import java.util.Scanner;

public class Artist extends shapefactory
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		shapefactory s=new shapefactory();
		for(;;)
		{
			
		
		System.out.println("1.circle\n2.square\n3.rectangle\n4.exit");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: s.getshape("circle").draw();
		        break;
		case 2: s.getshape("square").draw();
                break;
		case 3: s.getshape("rectangle").draw();
		
                break;
                
		case 4: System.exit(0);
		}
		}
		
		
		
	
	}

}
