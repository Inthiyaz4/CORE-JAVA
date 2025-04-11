import java.util.Scanner;
class dayfourteen
{
	//STRONG NUMBER SINGLE DIGIT 
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int num=n;
		while(num!=0)
		{
			int rem=num%10;
			int pro=1;
			for(int i=rem;i>=1;i--)
			{
				pro=pro*i;
			}
			if(pro==rem)
			{
				System.out.println("Strong number" +rem);
			}
			num/=10;
		}
	}
	//TWO DIGITS STRONG NUMBER
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
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
			while(num!=0)
			{
				int rem=num%100;
				int temp=rem;
				int pro=1,sum=0;
				while(rem!=0)
				{
					int rem1=rem%10;
					for(int i=rem1;i>=1;i--)
					{
						pro=pro*i;
					}
					rem/=10;
					sum+=pro;
					pro=1;
				}
				if(sum==temp)
				{
					System.out.println("Strong number " +temp);
				}
				num/=100;
			}
		}
		else
		{
			System.out.println("Enter even number");
		}
	}*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println("Enter Position :");
		int n1=sc.nextInt();
		int num=n,count=0,count1=1,rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			count++;
		}
		num=rev;
		if(n1<=count)
		{
			while(num!=0)
			{
				if(n1==count1)
				{
					int rem=num%10;
					System.out.println("The position of "  +n1 +" is " +rem);
					break;
				}
				else
				{
					count1++;
				}
				num/=10;
			}	
		}
		else
		{
			System.out.println("Enter correct position");
		}
	}
}