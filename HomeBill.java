import java.util.*;
class HomeBill
{
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("		WELCOME TO INTHIYAZ HOME BILL");
		ArrayList<String> items=new ArrayList<>();
		ArrayList<Integer> price=new ArrayList<>();
		System.out.println("Enter the Amount :");
		int amo=sc.nextInt();
		int s2=1;
		while(s2>0)
		{
		System.out.println("=====================================================================================================================");
		System.out.println("\nYOU WANT TO SEE THE BILLS ENTER : 0 \n OR YOU WANT TO ENTER THE BILL ENTER : 1 \n OR YOU WANT TO KNOW THE BALANCE ENTER : 2 \n EXIT : 3 ");
		int n=sc.nextInt();
		System.out.println("====================================================================================================================");
		int bill=0;
		int balance=0;
		HomeBill h=new HomeBill();
		if(n==0)
		{
			balance=amo-bill;
			h.display(items,price,bill,amo,balance);
		}
		else if(n==1)
		{
			int sn=1;
			while(sn>0)
			{
				System.out.println("Enter the item name or (finish or done)");
				String s=sc.next();
				if(s.equalsIgnoreCase("finish")|| s.equals("done"))
				{
					break;
				}
				items.add(s);
				System.out.println("Enter the price of the item:");
				int p=sc.nextInt();
				if(p<=0)
				{
					System.out.println("Enter the price more than 0");
					System.out.println("Enter the price of the item:");
					p=sc.nextInt();
					price.add(p);
					bill+=p;
				}
				else
				{
					price.add(p);
					bill+=p;
				}
				sn++;
			}
			
			balance=amo-bill;
			while(sn>0)
			{
			System.out.println("===============================================================================================================");
			System.out.println("DO YOU WANT TO SEE THE UPDATED BILL ENTER : 1 \n DO YOU WANT TO SEE ONLY BALANCE ENTER : 2  \n YOU WANT TO DELETE ANY ITEM ENTER : 3 \n EXIT ENTER : 4");
			int en=sc.nextInt();
			System.out.println("===============================================================================================================");
			if(en==1)
			{
				h.display(items,price,bill,amo,balance);
			}
			else if(en==2)
			{
				h.balance(bill,amo,balance);
			}
			else if(en==4)
			{
				System.out.println("THANK YOU BILL UPDATED");
				break;
			}
			else if(en==3)
			{
				h.display(items,price,bill,amo,balance);
				System.out.println("WHICH ITEM YOU WANT TO DELETE ENTER NO:");
				int del=sc.nextInt();
				System.out.println("---------------------------------------------------------------------------------");
				for(int i=0;i<=items.size()-1;i++)
				{
					if(i==(del-1))
					{
						items.remove(i);
						balance=balance+price.get(i);
						price.remove(i);
					}
				}
				System.out.println("AFTER DELETED THE BILL IS:");
				h.display(items,price,bill,amo,balance);
			}
			sn++;
			}			
		}
		else if(n==2)
		{
			balance=amo-bill;
			h.balance(bill,amo,balance);
		}
		else if(n==3)
		{
			System.out.println("THANK YOU");
			break;
		}
		s2++;
	}
	}
	void display(ArrayList<String> items, ArrayList<Integer> price,int bill,int amo,int balance)
	{
		System.out.println(" \t\t BILL HERE ");
		for(int i=0,sl=1;i<=items.size()-1;i++,sl++)
		{
			System.out.println(sl +"\t" +items.get(i) +"\t =" +price.get(i));
		}
		System.out.println("AMOUNT : " +amo);
		System.out.println("BALANCE : "+balance);
	}
	void balance(int bill,int amo,int balance)
	{
		
		//System.out.println(bill);
		System.out.println("AMOUNT : " +amo);
		System.out.println("BALANCE : " +balance);
	}
	
}






