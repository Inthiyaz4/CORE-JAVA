import java.util.*;
class daynineteen
{
	//SUM BEFORE AND AFTER THE INDEX OF ELEMENTS IF LEFT SIDE VALUE IS NOT THERE THEN INDEX VALUE + RIGHT VALUE OR IF RIGHT SIDE VALUE IS NOT THERE THEN INDEX VALUE + LEFT SIDE VALUE
	/*int[] sum(int a[],int size)
	{
		int b[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==0)
			{
				b[i]=a[i]+a[i+1];
			}
			else if(i==a.length-1)
			{
				b[i]=a[i]+a[i-1];
			}
			else
			{
				b[i]=a[i-1]+a[i+1];
			}
		}
		return b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the array:");
		int size=sc.nextInt();
		System.out.println("Enter the the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		nineteen n=new nineteen();
		int res[]=n.sum(a,size);
		System.out.println("After calculating sum of the elements are:");
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.println(res[i]);
		}
	}
	//FIND THE AVG OF ARRAY AND CHECK THE AVG IS ARMSTRONG OR NOT 
	int isAverage(int a[])
	{
		int avg=0;
		for(int i=0;i<=a.length-1;i++)
		{
			avg+=a[i];
		}
		avg=(int)avg/a.length;
		return avg;
	}
	void isArmstrong(int avg)
	{
		int num=avg,count=0,sum=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=avg;
		while(num!=0)
		{
			int rem=num%10;
			int pow=(int)Math.pow(rem,count);
			sum+=pow;
			num/=10;
		}
		if(avg==sum)
		{
			System.out.println(avg +" is Armstrong ");
		}
		else
			System.out.println(avg +" is not armstrong ");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the array:");
		int size=sc.nextInt();
		System.out.println("Enter the the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		daynineteen n=new daynineteen();
		int res=n.isAverage(a);
		n.isArmstrong(res);
	}
	//PRINT NEGATIVE ELEMENTS IN ARRAY IN REVERSE ORDER
	int negativeElementsCount(int a[])
	{
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<0)
			{
				count++;
			}
		}
		return count;
	}
	void reverseNegativeElements(int count,int a[])
	{
		int b[]=new int[count];
		for(int i=a.length-1,j=0;i>=0;i--)
		{
			if(a[i]<0)
			{
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("Negative elemnts in reverse order are:");
		for(int i=0;i<=b.length-1;i++)
			System.out.print(b[i] +" ");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the array:");
		int size=sc.nextInt();
		System.out.println("Enter the the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		daynineteen n=new daynineteen();
		int res=n.negativeElementsCount(a);
		n.reverseNegativeElements(res,a);
	}
	void secondLargest(int a[])
	{
		int min=0,max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				min=max;
				max=a[i];
			}
			else if(a[i]>min && max>min)
				min=a[i];
		}
		System.out.println("Second largest Element in Array is :" +min);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the array:");
		int size=sc.nextInt();
		System.out.println("Enter the the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		daynineteen n=new daynineteen();
		n.secondLargest(a);
	}
	//ARRAYS SORTED IN ASCENDING ORDER
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the array:");
		int size=sc.nextInt();
		System.out.println("Enter the the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<=a.length-1;i++)

		{
			System.out.println(a[i]);
		}
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sorting reverse");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}*/
	void isFrequencies(int a[])
	{
		System.out.println("Frequencies of Each element in an array :");
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size the array:");
		int size=sc.nextInt();
		System.out.println("Enter the the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		daynineteen n=new daynineteen();
		n.isFrequencies(a);
	}
}