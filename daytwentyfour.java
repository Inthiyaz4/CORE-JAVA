import java.util.*;
class daytwentyfour
{
	//MAX ELEMENT IN 2D ARRAY
	/*public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		daytwentyfour d=new daytwentyfour();
		d.sum(a);
	}
	void sum(int a[][])
	{
		int max=0;
		for(int t[]:a)
		{
			for(int t2: t)
			{
				if(t2>max)
				{
					max=t2;
				}
			}
			
		}
		System.out.println(max);
	}
	//PRINT EACH AND EVERY ROW IN REVERSE ORDER
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		daytwentyfour d=new daytwentyfour();
		d.reverse(a);
	}
	void reverse(int a[][])
	{
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=a[0].length-1;c>=0;c--)
			{
				System.out.print(a[r][c]);
			}
			System.out.println();
		}
	}
	//PRIME ELEMENTS IN 2D ARRAY
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		daytwentyfour d=new daytwentyfour();
		d.prime(a);
	}
	void prime(int a[][])
	{
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				int n=a[r][c];int count=0;
				for(int i=1;i<=n/2;i++)
				{
					if(n%i==0)
					{
						count++;
					}
				}
				if(count==1)
					System.out.println(n);
			}
		}
	}
	//PRINT MAX ELEMENT IN A ROW
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		daytwentyfour d=new daytwentyfour();
		d.maxEleRow(a);
	}
	void maxEleRow(int a[][])
	{
		for(int r=0;r<=a.length-1;r++)
		{
			int max=0;
			for(int c=0;c<=a[r].length-1;c++)
			{
				int n=a[r][c];
				if(n>max)
				{
					max=n;
				}
			}
			System.out.print("maximun element in " +r +" is " +max);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		daytwentyfour d=new daytwentyfour();
		d.sumOfTwoArrays(a,b);
	}
	void sumOfTwoArrays(int a[][],int b[][])
	{
		int d[][]=new int[3][3];
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				d[r][c]=a[r][c]+b[r][c];
				System.out.print(d[r][c] +" ");
			}
			System.out.println();
		}
	}
	//TRANSFROM ARRAY
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		daytwentyfour d=new daytwentyfour();
		d.transformArray(a);
	}
	void transformArray(int a[][])
	{
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				
				System.out.print(a[c][r] +" ");
			}
			
			System.out.println();
		}
	}
	//JAGGAD ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int size=sc.nextInt();
		int a[][]=new int[size][];// if you dont know the coloumn size then leave this blank dimensions withour putting any value
		for(int r=0;r<=a.length-1;r++)
		{
			System.out.println("Enter the row " +r +" size ");
			a[r]=new int[sc.nextInt()];
			System.out.println("Enter the elements :");
			for(int c=0;c<=a[r].length-1;c++)
				a[r][c]=sc.nextInt();
		}
		System.out.println("Elements are:");
		for(int t[]:a)
		{
			for(int t2:t)
				System.out.print(t2+" ");
			System.out.println();
		}
	}*/
	SORTED FOR EACH ROW 
	public static void main(String args[])
	{
		int a[][]=new int[][]{{18,1,3},{44,15,6},{7,18,9}};
		for(int i=0;i<=a.length-1;i++)
		{
			Arrays.sort(a[i]);
		}
		for(int t[]:a)
		{
			for(int t1:t)
				System.out.print(t1+" " );
			System.out.println();
		}
	}					
}