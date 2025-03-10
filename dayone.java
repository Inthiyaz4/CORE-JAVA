import java.util.*;
class dayone
{
	//AREA OF SQUARE	
	/*public static void main(String args[])
	{
		int radius=5;
		int area=(int)3.14*radius*radius;
		System.out.println("Area of a square is: " +area);
	}
	//student percentage
	public static void main(String args[])
	{
		int math=25, sci=30, social=20;
		int total_marks=90;
		int add=math+sci+social;
		float per=(float)add/total_marks*100;
		System.out.println(per);
	}
	//diameter of circle
	public static void main(String agrs[])
	{
		int r=5;
		double diameter=2*r;
		System.out.println("Diamter of circle is: " +diameter);
	}
	//circumference 
	public static void main(String agrs[])
	{
		int r=5;
		double circ=2*3.14*r;
		System.out.println("circumference of circle is: " +circ);
	}
	//perimeter of square
	public static void main(String agrs[])
	{
		int s=5;
		double peri=4*s;
		System.out.println("perimeter of square is: " +peri);
	}
	//area of rectangel
	public static void main(String agrs[])
	{
		int l=5, b=3;
		float a=(float)l*b;
		System.out.println("Area of rectangle  is: " +a);
	}
	//diametr of rect
	public static void main(String agrs[])
	{
		int l=5, b=3;
		float dia=(float)((l*l)*(b*b))*2;
		System.out.println("diameter of rectangle  is: " +dia);
	}*/
	public static void main(String args[])
	{
		int price=15;
		int quantity=5;
		double total=price*quantity;
		double dis=10/100*total;
		System.out.println(dis);
		int cupon=25;
		double afteramount=dis-cupon;
		double tax=6/100*afteramount;
		int delivary=20;
		double totalvalue=tax+delivary;
		System.out.println(totalvalue);
	}	
}