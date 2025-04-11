import java.util.*;
class tcs
{
	//NON REPEATED AND UNIQUE NUMBERS 
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		if(n<=0)
		{
			System.out.println("Invalid Size ");
			return;
		}
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Non Repeated & Unique Numbers are : ");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
			{
				System.out.print(arr[i] +" " );
			}
		}
		System.out.println();
	}
	//APPLICATION FOR SHOP AND THIER EXPENSEVE AND SAVING
	public static void main(String args[])
	{
		ArrayList<String> category=new ArrayList<>();
		int c=0;
		ArrayList<Integer> expense=new ArrayList<>();
		int e=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the income :");
		int n=sc.nextInt();
		int q=1;
		while(q>0)
		{
		if(n<=0)
		{
			System.out.println("Enter the income greater than 0");
			break;
		}
		else
		{
			int sn=1;
			while(sn>0)
			{
				System.out.println("Enter the category ( finish or done)");
				String s=sc.next();
				if(s.equalsIgnoreCase("finish")|| s.equals("done"))
				{
					break;
				}
					category.add(s);
					c++;
					System.out.println("Enter the expense ");
					int ex=sc.nextInt();
					int w=1;
					while(w>0)
					{
					if(ex<=0)
					{
						System.out.println("Enter the amount greater than 0 ");
						break;
					}
					else
					{
						expense.add(ex);
						e++;
						sum+=ex;
						break;
					}
				}
				sn++;
			}
		}
		int savings=n-sum;
		System.out.println("Financial Situation ");
		System.out.println("Income : " +n);
		if(savings<=0)
		{
			System.out.println("savings : No savings ");
		}
		else
			System.out.println("Savings : " +savings);
		System.out.println("Total Bill : "+sum);
		System.out.println("Items are :" );
		for(int i=0;i<=category.size()-1;i++)
		{
			System.out.println(category.get(i) +" : " +expense.get(i));
		}
		break;
	}
	}*/
	//REPEATED AND NON REPEATING CHARACTERS
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String s=sc.next();
		String nonrep="";
		String rep="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}	
			}
			if(count==1)
			{
				nonrep+=s.charAt(i);
			}
			else
			{
				rep+=s.charAt(i);
			}
		}
		if(nonrep.length()==s.length())
		{
			System.out.println(nonrep.charAt(0) +" " +nonrep.charAt(0));
		}
		else if(rep.length()==s.length())
		{
			System.out.println("None " +rep);
		}
		else
		{
			System.out.println(rep.charAt(0) + " " +nonrep.charAt(0));
		}
	} 
}