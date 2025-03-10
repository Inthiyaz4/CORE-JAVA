class dayfive
{
	/*public static void main(String args[])
	{
		int n=13457;
		if(n%3==0 && n%5==0)
		{
			System.out.println(n +" FIZZBUZZ");
		}
		else if(n%3==0)
		{
			System.out.println(n +" FIZZ");
		}
		else if(n%5==0)
		{
			System.out.println(n +" BUZZ");
		}
		else
			System.out.println(n);
	}*/
	public static void main(String args[])
	{
		char c='a';
		int i=c;
		
		if(i>='A' && i<='Z')
		{
			char d=(char)(c+32);
			System.out.println(d);
			
		}
		else if(i>='a' && i<='z')
		{
			char d=(char)(c-32);
			System.out.println(d);
		}
		
	}	
}