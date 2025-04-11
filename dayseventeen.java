class dayseventeen
{
	/*public static void main(String args[])
	{
		dayseventeen s=new dayseventeen();
		System.out.println(s.sample());
	}
	int num=1;
	int sample()
	{
		int num1=0;
		if(num<=10)
		{
			num1=num;
		}
		num++;
		return num1;
	}*/
	//ACTUAL ARGUMENTS && FORMAL ARGUMENTS
	void display(String p, int i)
	{
		System.out.println(p+" " +i);
	}
	void display(String p, double d)
	{
		System.out.println(p+" "+d);
	}
	void display(String p, String s)
	{
		System.out.println(p+" "+s);
	}
	void display(String p, char c)
	{
		System.out.println(p+" " +c);
	}
	public static void main(String args[])
	{
		dayseventeen s=new dayseventeen();
		s.display("Hello" , 1);
		s.display("welcome " , 2.0);
		s.display("to" , "coding");
		s.display("hub" , 'c');
	}
}