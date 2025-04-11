import java.util.Scanner;
class daythirteen
{
	//CHECK NO IS PRIME OR NOT LESS TIME COMPLECITY
	/*public static void main(String args[])
	{
		int num=5,count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && num>=2)
			System.out.println(num +" is prime ");
	}
	//SUM OF DIGITS UPTO NTH NUMBER
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("upto which number you want to print the sum of digits :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=i,sum=0;
			while(num!=0)//1!=0 T
			{
				int rem=num%10;//1%10=1
				sum+=rem;//0+1=1
				num/=10;//1/10=0
			}
			System.out.print(i +" sod is " +sum);
			System.out.println();
		}
	}
	//PRINT EACH DIGIT OF A NUMBER AND ITS TABLE 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print each digit table ");
		int n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			int rem=n%10;
			for(int i=1;i<=10;i++)
			{
				int pro=rem*i;
				System.out.println(rem+"X"+i+"="+pro);
			}
			System.out.println();
			n/=10;
		}
	}
	//CHECK BREAK AND CONTINEU
	public static void main(String args[])
	{
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				for(int k=0;k<=10;k++)
				{
					if(k==5)
					{
						continue;
					}
					else
						System.out.println(i+" " +j +" " +k);
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print the prime numbers  ");
		int n=sc.nextInt();
		int num=n;
		System.out.println(num +" primes are "); 
		while(num!=0)
		{
			int rem=num%10;
			int count=0;
			for(int i=2;i<=rem/2;i++)
			{
				if(rem%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && rem>=2)
				System.out.println(rem);
			num/=10;
		}
	}
	//ANAGRAMS
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int n1=sc.nextInt();
		System.out.println("Enter second number: ");
		int n2=sc.nextInt();
		int num1=n1,num2=n2,count=0,count1=0,n3=0,com=0;
		while(num1!=0)
		{
			int rem=num1%10;
			com=com*10+rem;
			count++;
			num1/=10;
		}
		num1=n1;
		while(num2!=0)
		{
			count1++;
			num2/=10;
		}
		num2=n2;
		if(count==count1)
		{
			while(num1!=0)
			{
				int rem=num1%10;
				while(num2!=0)
				{
					int rem1=num2%10;
					if(rem==rem1)
					{
						n3=n3*10+rem1;
						break;
					}
					num2/=10;
				}
				num2=n2;
				num1/=10;//1234
			}
		}
		else
			System.out.println("enter the equal nos ");
		if(com==n3)
			System.out.println("Given nos are anagrams");
		else 
			System.out.println("Given nos are not anagrams");
	}
	// REMOVE DUPLICATES VALUES 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int n=sc.nextInt();
		int num=n,n1=0;
		while(num!=0)//12415
		{
			int rem=num%10; //5
			int num1=num/10;//1241
			int count=0;
			while(num1!=0)//1241
			{
				int rem1=num1%10;//1
				if(rem==rem1)//5==1f	
				{
					count++;
					break;
				}
				num1/=10;
			}
			if(count==0)
			{
				n1=n1*10+rem;
			}
			num/=10;
		}
		System.out.println(n1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number ");
		int n=sc.nextInt();
		int num=n,n1=0,n2=0;
		while(num!=0)
		{
			int rem=num%10;
			double sqr=Math.sqrt(rem);
			if(sqr*sqr==rem)
			{
				if(rem>n1)
				{
					n2=n1;
					n1=rem;
				}
				else if(rem>n2 && n2<n1)
					n2=rem;
			}
			num/=10;
		}
		System.out.println("Second Largest Sqaure number is : " +n2);
	}*/
}
