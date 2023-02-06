package shapeArea;

import java.util.Scanner;

public class AreaDisplay extends AreaCalculation {

	
	int length;
	int height;
	int radius;
	int side;
	public void getMethodtriangle()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter triangle length and height");
		this.length=sc.nextInt();
		this.height=sc.nextInt();
	
		
		
	}
	
	public void getMethodCircle()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter circle radius");
		this.radius=sc2.nextInt();
	
		
		
	}
	public void getMethodSquare()
	{
	
	    Scanner sc3=new Scanner(System.in);
		System.out.println("Enter square side");
		this.side=sc3.nextInt();
		sc3.close();
	
	}	

	
	
	public static void main(String[] args) 
	{
		
		
		AreaDisplay shape=new AreaDisplay();
		
		shape.getMethodtriangle();
		shape.getMethodCircle();
		shape.getMethodSquare();
		
		
		shape.triangleArea(shape.length,shape.height);
		shape.circleArea(shape.radius);
		shape.squareArea(shape.side);
		
		
		
		
		
		
	}

}
