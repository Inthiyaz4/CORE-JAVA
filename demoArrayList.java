import java.util.*;
class demoArrayList
{
	public static void main(String args[])
	{
		ArrayList<String> list1=getitems();
		
		int bill=0;
		/*for(int i:list)
			System.out.println(i);*/
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i)+" "+);
		}
		ArrayList<Integer> list2=getprice();
	}
	public static ArrayList<Integer> getprice()
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> price= new ArrayList<>();
		System.out.println("Enter the price of the item:");
		int p=sc.nextInt();
		if(p<=0)
		{
			System.out.println("Enter the price more than 0");
			System.out.println("Enter the price of the item:");
			p=sc.nextInt();
			price.add(p);
			//bill+=p;
		}
		else
		{
			price.add(p);
			//bill+=p;
		}
		return price;
	}
	public static ArrayList<String> getitems()
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> items=new ArrayList<>();
		int sn=1;
		while(sn>0)
		{
			System.out.println("Enter the item name or (finish or done)");
			String s=sc.next();
			if(s.equalsIgnoreCase("finish")|| s.equals("done"))
			{
				break;
			}
			else
			{
				items.add(s);
				getprice();
				sn++;
			}
		}
		return items;
	}

}