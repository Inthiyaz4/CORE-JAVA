import java.util.Scanner;
class dayeighteen
{
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A array size");
		int size=sc.nextInt();
		System.out.println("Enter the A array elements");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the B array size");
		size=sc.nextInt();
		System.out.println("Enter the B array elements");
		int b[]=new int[size];
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=sc.nextInt();
		}
		int k=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<=b.length-1;i++)
		{
			c[k]=b[i];
			k++;
		}
		System.out.println("C array elements are: ");
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}
	}
	//SWAPPING OF TWO ARRAYS
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the A array ");
		int size=sc.nextInt();
		System.out.println("Enter the A array elements ");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of the B array ");
		size=sc.nextInt();
		System.out.println("Enter the B array elements ");
		int b[]=new int[size];
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=sc.nextInt();
		}
		if(a.length==b.length)
		{
			System.out.println("Before swapping the arrays ");
			for(int i=0;i<=a.length-1;i++)
				System.out.println("A array " +a[i] +" " +"B array = " +b[i]);
			int c[]=new int[size];
			for(int i=0;i<=c.length-1;i++)
			{
				c[i]=a[i];
				a[i]=b[i];
				b[i]=c[i];
			}
			System.out.println("After Swapping array are");
			for(int i=0;i<=a.length-1;i++)
			{
				System.out.println("A array " +a[i] +" " +"B array = " +b[i]);
			}
		}
		else
			System.out.println("Enter the arrays in same length");
	}*/
	//FIND ELEMENT IN THE ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a value to search in array:");
		int v=sc.nextInt();
		//int s[]=new int[1];
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==v)
			{
				count++;
			}
		}
		System.out.println(count!=0?"Element found":"Element Not found");
	}	
		
}	