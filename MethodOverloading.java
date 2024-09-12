package PR3;
import java.util.Scanner;
 class Mover
{
	void area(int b,int h)
	{
		int area=b*h;
		System.out.println("area of rectangle="+area);
	}
	void area(double base1,double height1)
	{
		double area=(base1*height1)/2;
		System.out.println("area of triangle="+area);
	}
	void area(double radius1)
	{
		double area=3.14*radius1*radius1;
		System.out.println("area of circle ="+area);
		
	}

}
public class MethodOverloading
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		Mover obj=new Mover();
						System.out.println("enter the breadth of the rectangle and height of the rectangle");
						int breadth =sc.nextInt();
				        int length =sc.nextInt();
				        obj.area(breadth,length);
				        
				        System.out.println("enter the base and height of the triangle");
				        double base=sc.nextDouble();
				        double height=sc.nextDouble();
				        obj.area(base,height);
				        System.out.println("enter the radius of the circle");
				        double radius=sc.nextDouble();
				        obj.area(radius);
				    
				        
			}
	}


