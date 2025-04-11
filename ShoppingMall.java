import java.util.*;
class ShoppingMall
{
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("				WELCOME TO INTHIYAZ SHOPPING MALL");
		ArrayList<String> items=new ArrayList<>();
		ArrayList<Double> quantity=new ArrayList<>();
		double q=0;
		ArrayList<Double> price=new ArrayList<>();
		double p=0;
		ArrayList<Double> total=new ArrayList<>();
		double discount=0;
		double cal=0;
		int sn=1;
		double finalamount=0;
		while(sn>0)
		{
			System.out.println("Enter the item name or (finish or done)");
			String s=sc.next();
			if(s.equalsIgnoreCase("finish")|| s.equals("done"))
			{
				break;
			}
			items.add(s);
			System.out.println("Enter the quantity of the item:");
			q=sc.nextInt();
			if(q<=0)
			{
				System.out.println("Enter the quantity more than 0");
				System.out.println("Enter the quantity of the item:");
				q=sc.nextInt();
				quantity.add(q);
			}
			else
			{
				quantity.add(q);
			}
			System.out.println("Enter the price of the item:");
			p=sc.nextInt();
			if(p<=0)
			{
				System.out.println("Enter the price more than 0");
				System.out.println("Enter the price of the item:");
				p=sc.nextInt();
				price.add(p);
			}
			else
			{
				price.add(p);
			}
			double product=q*p;
			total.add(product);
			cal+=product;
			q=0;p=0;
			sn++;
		}
		//System.out.println(cal +"Dsdjhd");
		System.out.println("DO you have any coupon (YES OR NO )");
		String cp=sc.next();
		if(cp.equalsIgnoreCase("YES") && cal>=1500)
		{
			System.out.println("Enter the COUPON NAME");
			String cn=sc.next();
			if(cn.equalsIgnoreCase("coupon20"))
			{
				discount=cal/100*20;
				finalamount=cal-discount;
			}
			else if(cn.equalsIgnoreCase("coupon30"))
			{
				discount=cal/100*30;
				finalamount=cal-discount;
			}
			else if(cn.equalsIgnoreCase("coupon40"))
			{
				discount=cal/100*40;
				finalamount=cal-discount;
			}
			else if(cn.equalsIgnoreCase("coupon50"))
			{
				discount=cal/100*50;
				finalamount=cal-discount;
			}
			else
			{
				System.out.println("Invalid Coupon ");
				finalamount=cal-discount;
			}
		}
		else
		{
			finalamount+=cal;
		}
		System.out.println("\t\tBILL:");
		System.out.println("S.NO" +"\t" +"ITEM NAME" +"\t" +"QUANTITY" +"\t" +"PRICE" +"\t" +"TOTAL");
		for(int i=0,sl=1;i<=items.size()-1;i++,sl++)
		{
			System.out.println(sl +"\t\t" +items.get(i) +"\t\t" +quantity.get(i) +"\t\t"  +price.get(i) +"\t\t" +total.get(i));
		}
		System.out.println("You saved : " +discount); 
		System.out.println("\t\t\t\t TOTAL= " +finalamount);
	}
}