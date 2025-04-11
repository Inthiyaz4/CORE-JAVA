import java.util.Scanner;
class dayfifteen
{
	//FIRST NO AND LAST NO SWAPPED
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int num=n,count=-1,rem=0,rev1=0;
		double divi=0,que=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=n;
		while(num!=0)//123456
		{
			rem=num%10;
			divi=num%Math.pow(10,count);
			que=num/Math.pow(10,count);
			num=(int)divi;
			num/=10;
			break;
		}
		int rev=rem;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev1=rev1*10+rem;
			num/=10;
		}
		num=rev1;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		rev=(int)(rev*10+que);
		System.out.println("FIRST NO AND LAST NO SWIPPED IS " +n +" are " +rev);
	}
	/*//INPUT NO CHECK PRIME IF PRIME REVERSE THE NUMBER AGAIAN CHECK REVERSE NO PRIME OR NOT IF BOTH PRIME THEN PRINT DUAL PRIME
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int num=n,count=0,rev=0,count1=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && num>=2)
		{
			num=n;
			while(num!=0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			num=rev;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count1++;
					break;
				}
			}
			if(count1==0 && num>=2)
			{
				System.out.println("DUAL PRIME");
			}
			else
				System.out.println("SINGLE PRIME");
		}
		else
			System.out.println("not prime");
	}
	//IF THE NO IS EVEN DIGITS PRINT HALF HALF THE NO IF ODD  PRIM ONE HALF AND SECOND HALF-1
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int num=n,count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=n;
		if(count%2==0)
		{
			int first=(int)(num/Math.pow(10,count/2));
			int last=(int)(num%Math.pow(10,count/2));
			System.out.println(first +" "  +last);
		}
		else
		{
			int first=(int)(num/Math.pow(10,count/2));
			int last=(int)(num%Math.pow(10,count/2));
			System.out.println(first +" "  +last);
		}
			
	}*/
}