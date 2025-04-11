import java.util.*;
class daytwentytwo
{
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		daytwentytwo d=new daytwentytwo();
		d.isPrime(arr,0);
	}
	void isPrime(int arr[],int start)
	{
		if(start>=arr.length)//0>4 1>4 2>4 3>4 4>=4
		{
		}
		else
		{
			int n=arr[start];
			primeRecursion(n,1,0);
			isPrime(arr,start+1);
		}
	}
	void primeRecursion(int n,int start,int count)
	{
		if(n/2<start || n==1)//5<1  5<2  5<3 5<4 5<5 5<6t
		{
			if(count==1)
				System.out.println(n +" is prime");
		}
		else
		{
			if(n%start==0)//10%1==0 10%2==0t
				count++;//1 2 3
			primeRecursion(n,start+1,count);
		}
	}
	//SELECTION SORT 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		daytwentytwo d=new daytwentytwo();
		d.selectionSort(arr);
	}
	void selectionSort(int a[])
	{
		int fix=0,min=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)//0
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[fix];
			a[fix]=a[min];
			a[min]=temp;
			fix=i+1;min=i+1;
		}
		for(int i:a)
			System.out.print(i+" ");
	}
	//BUBBLE SORT
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		daytwentytwo d=new daytwentytwo();
		d.bubbleSort(arr);
	}
	void bubbleSort(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			int n=a.length-2;
			for(int j=0;j<=n;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			n--;
		}
		for(int i:a)
			System.out.print(i+" ");
	}*/
	


















}