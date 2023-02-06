package shapeArea;

public class AreaCalculation {
	
	
	int length;
	int height;
	
	public void triangleArea(int length,int height)
	{
		this.length=length;
		this.height=height;
		//int constant=1/2;
		int area=1/2*(length*height);
		System.out.println("Area of trinagle "+ areaa );	
	}
	

	public void circleArea(int radius)
	{
		this.length=radius;
		
		//int constant=3.14;
		double area=3.14*(length*length);
		System.out.println("Area of circle  "+ area );
		
	}
		
	
	public void squareArea(int side)
		{
			this.length=side;
			//int constant=4;
			int area=4*(length);
			System.out.println("Area of square "+ area );			
		}
		
		
	}
	
