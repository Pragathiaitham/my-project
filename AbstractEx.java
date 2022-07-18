import java.util.Scanner;
abstract class Shapes
{
	int a,b;
	abstract void area();
}
class Triangle extends Shapes
{
	void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		a = sc.nextInt();
		System.out.print("Enter b value : ");
		b = sc.nextInt();
		double c=(a*b)/2;
		System.out.println("Area of triangle = "+c);
       }
}
class Square extends Shapes
{
	void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		a = sc.nextInt();
		int b = a*a;
		System.out.print("Area of square = "+b);
       }
}
class Rectangle extends Shapes
{
	void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		a = sc.nextInt();
		System.out.print("Enter b value : ");
		b = sc.nextInt();
		int c = a*b;
		System.out.println("Area of rectangle = "+c);
       }
}
class AbstractEx
{
	public static void main(String args[])
	{
		Triangle b = new Triangle();
		b.area();
		Square c = new Square();
		c.area();
		Rectangle e = new Rectangle();
		e.area();
	}
}