import java.util.*;
class ArrHWProblem
{
	//FIRST DUPLICATE NUMBER IN ARRAY
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.firstDuplicateNo(a);
	}
	void firstDuplicateNo(int a[])
	{
		for(int i=0;i<=a.length-2;i++)
		{
			int count=0;
			for(int j=1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println("first duplicate element is : "+a[i]);
				break;
			}
		}
	}
	//LAST DUPLICATE NO IN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.lastDuplicateNo(a);
	}
	void lastDuplicateNo(int a[])
	{
		int last=0;
		for(int i=0;i<=a.length-2;i++)
		{
			int count=0;
			for(int j=1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=1)
			{
				last=a[i];
			}
		}
		System.out.println("last duplicate element is : "+last);
	}	
	//MAX DUPLICATE NO IN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.lastDuplicateNo(a);
	}
	void lastDuplicateNo(int a[])
	{
		int last=0,max=0;
		for(int i=0;i<=a.length-2;i++)
		{
			int count=0;
			for(int j=1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=1)
			{
				if(count>max)
				{
					max=count;
					last=a[i];
				}
			}
		}
		System.out.println("max duplicate element is : "+last);
	}
	//FIRST UNIQUE NO IN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.firstUniqueNo(a);
	}
	void firstUniqueNo(int a[])
	{
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
			if(count==1)
			{
				System.out.println("first unique no is  :" +a[i]);
				break;
			}
		}
		
	}
	//LAST UNIQUE NO IN AN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.lastUniqueNo(a);
	}
	void lastUniqueNo(int a[])
	{
		int last=0;
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
			if(count==1)
			{
				last=a[i];
			}
		}
		System.out.println("last unique no is : "+last);
	}
	//MAX UNIQUE NO IN AN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.maxUniqueNo(a);
	}
	void maxUniqueNo(int a[])
	{
		int max=0;
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
			if(count==1)
			{
				if(a[i]>max)
					max=a[i];
			}
		}
		System.out.println("max unique element is : " +max);
	}
	//MOST REPEATED NOS 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.mostRepeatedNo(a);
	}
	void mostRepeatedNo(int a[])
	{
		int max=0;int last=0;
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
			if(count>1)
			{
				if(count>max)
				{
					max=count;
					last=a[i];
				}
			}
		}
		System.out.println("most repeated no  is : " +last);
	}
	//LEAST REPEATED NO 
	System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.mostRepeatedNo(a);
	}
	void mostRepeatedNo(int a[])
	{
		int min=Integer.MIn_VALUE;int last=0;
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
			if(count>1)
			{
				if(count<min)
				{
					min=count;
					last=a[i];
				}
			}
		}
		System.out.println("least repeated no  is : " +last);
	}
	//FIRST MOST REPEATED NO 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.mostRepeatedNo(a);
	}
	void mostRepeatedNo(int a[])
	{
		int max=0;int last=0;
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
			if(count>1)
			{
				if(count>max)
				{
					max=count;
					last=a[i];
					break;
				}
			}
		}
		System.out.println("first most repeated no  is : " +last);
	}
	//IF ARRAY CONTAINS DUPLICATE VALUES THEN SUM OF THOSE IF NOT PRINT NO DUPLICATE FOUND
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.sumDuplicateNo(a);
	}
	void sumDuplicateNo(int a[])
	{
		int sum=0;
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
			if(count>1)
			{
				sum+=a[i];
			}
		}
		System.out.println((sum>0)?"SUM OF DUPLICATE ELEMETS IS " +sum : "NO DUPLicates found");
	}
	//NO OF DUPLICATES IN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.noOfDuplicates(a);
	}
	void noOfDuplicates(int a[])
	{
		int sum=0,nosum=0;
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
			if(count>1)
			{
				sum++;
				a[i]=-a[i];
				
			}
			else
				nosum++;
		}
		
		System.out.println("no of duplicates is :" +sum);
		System.out.println("no of uniquess is :" +sum);
	}
	//BINARY SEARCH USING RECURSION
	public static void main(String args[])
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
		ArrHWProblem p=new ArrHWProblem();
		p.isBinarySearch(arr,search,0,arr.length-1,0);
	}
	void isBinarySearch(int arr[],int search,int sn,int en,int mid)
	{
			mid=(sn+en)/2;
			if(search==arr[mid])
			{
				System.out.println("Elemet found");
				
			}
			else if(search>arr[mid])
			{
				
				if(sn>en)
				{
					System.out.println("Element not found");
					
				}
				else
					isBinarySearch(arr,search,mid+1,en,mid);
			}
			else if(search<arr[mid])
			{
				if(sn>en)
				{
					System.out.println("Element not found");
					
				}
				else
					isBinarySearch(arr,search,mid,mid-1,mid);
			}
	}*/
	//FREQUENCY OF ELEMENTS IN ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)
			a[i]=sc.nextInt();
		ArrHWProblem p=new ArrHWProblem();
		p.frequencyNo(a);
	}
	void frequencyNo(int a[])//1 4 7 8 5 2 1 4 7
	{
		
		for(int i=0;i<=a.length-1;i++)
		{
			int count=1;
			if(a[i]==-1)
			{
				continue;
			}
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			System.out.print(a[i]+" : " +count +" ");
			
		}
	}

	

	
	









}