import java.util.*;
class daytwentyone
{
	//BINARY SEARCH
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.println("Enter the element to search");
		int search=sc.nextInt();
		daytwentyone d=new daytwentyone();
		d.isBinarySearch(arr,search);
	}
	void isBinarySearch(int arr[],int search)
	{
		int f=0,l=arr.length-1,m=0;
		while(f<=l)
		{
			m=(f+l)/2;
			if(search==arr[m])
			{
				System.out.println("Elemet found");
				break;
			}
			else if(search>arr[m])
			{
				f=m+1;
			}
			else
			{
				l=m-1;
			}
		}
		if(f>l)
		{
			System.out.println("Element not found");
		}
	}
	//LEFT ROTATION
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		daytwentyone d=new daytwentyone();
		d.leftRotation(arr);
	}
	void leftRotation(int arr[])
	{
		int temp=arr[0],i;
		for(i=0;i<=arr.length-2;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		System.out.println("After left rotating");
		for(int t:arr)
			System.out.println(t);
	}
	//RIGHT ROTATION
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		daytwentyone d=new daytwentyone();
		d.rightRotation(arr);
	}
	void rightRotation(int arr[])
	{
		int temp=arr[arr.length-1],i;
		for(i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		System.out.println("After right rotating");
		for(int t:arr)
			System.out.println(t);
	}
	//INSERT ELEMENT IN I INDEX 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the Element");
		int ele=sc.nextInt();
		System.out.println("Enter the index value where your going to insert:");
		int in=sc.nextInt();
		daytwentyone d=new daytwentyone();
		d.insertElement(arr,ele,in);
		
	}
	void insertElement(int arr[],int ele,int in)
	{
		if(in>arr.length)
		{
			System.out.println("Cannot insert");
		}
		else
		{
			int sn=arr.length-1;//4
			int ln=in+1;//2
			while(sn>=ln)
			{
				arr[sn]=arr[sn-1];
				sn--;
			}
			arr[in]=ele;						
		}
		for(int i :arr)
			System.out.print(i +" ");
			
	}*/
	//ELEMENT FIND THEN DELETE OTHERWISE ADD ELEMENT IN USER INDEX
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the Element");
		int ele=sc.nextInt();
		//System.out.println("Enter the index value where your going to insert:");
		//int in=sc.nextInt();
		Arrays.sort(arr);
		daytwentyone d=new daytwentyone();
		d.findDelete(arr,ele);
	}
	void findDelete(int arr[],int ele)
	{
		Scanner sc=new Scanner(System.in);
		int sn=0,en=arr.length-1,m=0;
		while(sn<=en)
		{
			m=(sn+en)/2;
			if(ele==arr[m])
			{
				int f=m,l=arr.length-2;
				while(f<=l)
				{
					arr[f]=arr[f+1];
					f++;
				}
				arr[f]=0;
				System.out.println("Element found");
				for(int i:arr)
					System.out.print(i +" ");
				break;
			}
			else if(ele>arr[m])
			{
				sn=m+1;
			}
			else
			{
				en=m-1;
			}
		}
		if(sn>en)
		{
			System.out.println("Element not found");
			System.out.println("Enter the element to be insert");
			int elem=sc.nextInt();
			System.out.println("Enter the index to be inserted:");
			int in=sc.nextInt();
			sn=arr.length-1;int ln=in+1;
			while(sn>=ln)
			{
				arr[sn]=arr[sn-1];
				sn--;
			}
			arr[in]=elem;
			for(int i:arr)
				System.out.print(i+ " ");
		}
		
	}
}