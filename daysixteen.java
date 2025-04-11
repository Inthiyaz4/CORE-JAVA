import java.util.Scanner;
class daysixteen
{
	//METHODS EXAMPLE
	/*int a,b;
	public static void main(String args[])
	{
		daysixteen sum1=new daysixteen();
		sum1.a=100;sum1.b=200;
		sum1.firstMethod();
		
	}
	void firstMethod()
	{
		System.out.println(a +" " +b);
	}
	//PRIME USING METHODS
	public static void main(String args[])
	{
		daysixteen prime=new daysixteen();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		prime.number=sc.nextInt();
		prime.calfactor();
		prime.isprime();
	}
	int number,factor=0;
	void calfactor()
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				factor++;
				break;
			}
		}
	}
	void isprime()
	{
		System.out.println((factor==0)?"PRIME" : "NOT PRIME");
	}*/
	//STUDENT APPLICATION
	public static void main(String args[])
	{
		daysixteen student=new daysixteen();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		student.name=sc.nextLine();
		System.out.println("Enter roll no:");
		student.roll=sc.nextInt();
		System.out.println("Enter Java Marks:");
		student.java=sc.nextInt();
		System.out.println("Enter sql Marks:");
		student.sql=sc.nextInt();
		System.out.println("Enter html Marks:");
		student.html=sc.nextInt();
		student.caltotal();
		student.percentage();
		student.sectionscholor();
		student.display();

	}
	int roll,total,java,sql,html,scholor;
	double percentage;
	String name,section;
	void caltotal()
	{
		total=java+sql+html;
	}
	void percentage()
	{
		percentage=total/300.*100;
	}
	void sectionscholor()
	{
		if(percentage>=90)
		{
			section="A";
			scholor=25000;
		}
		else if(percentage>=80)
		{
			section="B";
			scholor=15000;
		}
		else if(percentage>=70)
		{
			section="C";
			scholor=5000;
		}
		else
		{
			section="D";
			scholor=0;
		}
	}
	void display()
	{
		System.out.println("ROLL NO : " +roll  +" NAME : " +name);
		System.out.println("TOTAL MARKS: " +total +" PERCENTAGE: " +percentage +" SECTION: " +section +" SCHOLORSHIP: " +scholor);
	}
}