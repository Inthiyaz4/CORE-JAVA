/*class daytwentythree
{
	public static void main(String args[])
	{
		abstract num=10;
		child s=new child();
		s.add();
		s.sub();
		s.mul();
		s.div();
	}
}
class child extends parent
{
	int x=30;
	int y=50;
	child()
	{
		System.out.println("child " +x+" " +y);
	}
	//@Override
	public void sub()
	{
		System.out.println("sub in child " +(a-b));
	}
	void div()
	{
		System.out.println("div " +(y/x));
	}
	
}
abstract class parent
{
	int a,b;
	parent()
	{
		a=10;
		b=20;
		System.out.println(a+" " +b+" " +"parent constrcut");
	}
	void add()
	{
		System.out.println("add  " +(a+b));
	}
	public abstract void sub();
	void mul()
	{
		System.out.println("mul is " +(a*b));
	}
}
//INTERFACES
class daytwentythree
{
	public static void main(String args[])
	{
		child c=new child();
		c.m1();
		c.m2();
		
	}
}
interface A
{
	public void m1();
}
interface b
{
	public void m2();
}

class child implements A,b
{
	public void m1()
	{
		System.out.println("HELLO THIS IS CHILD M1");
	}
	public void m2()
	{
		System.out.println("HELLO THIS IS CHILD M2");
	}

}
//MULTIPLE INHERITENCE
class daytwentythree
{
	public static void main(String args[])
	{
		child c=new child();
		c.sum();
		c.div();
	}
}
interface GrandParent
{
	void sum();
}
interface parent1
{
	void sub();
}
interface parent2
{
	void mul();
}
interface parent3
{
	void div();
}
class child implements parent1,parent2,parent3
{
	public void sum()
	{
		System.out.println("SUM");
	}
	public void sub()
	{
		System.out.println("SUB");
	}
	public void mul()
	{
		System.out.println("MUL");
	}
	public void div()
	{
		System.out.println("DIV");
	}
}
//DIAMOND PROBLEM
class daytwentythree
{
	public static void main(String args[])
	{
		child c=new child();
		c.sum();
		c.div();
		c.mul();
	}
}
interface GrandParent
{
	void sum();
}
interface parent1 extends GrandParent
{
	void sub();
}
interface parent2 extends GrandParent
{
	void mul();
	void sub();
}
interface parent3 extends GrandParent
{
	void div();
}
class child implements parent1,parent2,parent3
{
	public void sum()
	{
		System.out.println("SUM");
	}
	public void sub()
	{
		System.out.println("SUB");
	}
	public void mul()
	{
		System.out.println("MUL");
	}
	public void div()
	{
		System.out.println("DIV");
	}
}
//LAMBDA EXPRESSIONS
class daytwentythree
{
	public static void main(String args[])
	{
		calculator cal=()->
		{
			return 10+20;
		};
		System.out.println(cal.sum());
	}
}
@FunctionalInterface
interface calculator
{
	int sum();
	
}*/
//LAMBDA EXPRESSIONS INCLUDING STATIC AND DEFAULT KEYWORDS
class daytwentythree
{
	public static void main(String args[])
	{
		GrandParent gp=()->
		{
			System.out.println("HELLO");
		};
		gp.add();
		GrandParent.sub();
		gp.mul();
	}
}
@FunctionalInterface
interface GrandParent
{
	void add();
	static void sub()
	{
		System.out.println("HELLO THIS IS Static");
	}
	default void mul()
	{
		System.out.println("HELLO THIS IS default");
	}
}














