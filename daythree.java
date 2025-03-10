import java.util.*;
class daythree
{
	/*public static void main(String args[])
	{
		int salary=5000;
		String name="INTHIYAZ";
		if(salary>=30000)
		{
			System.out.println(salary +" is credicted to " +name);
		}
		else
		{
			System.out.println("salary not credicted to " +name);
		}
	}
	public static void main(String args[])
	{
		int a='a';
		int A='A';
		int z='z';
		int Z='Z';
		char c=92;
		System.out.println(c);
		System.out.println("\n A value is: "+A +"\n a value is : " +a);
		System.out.println(" \nZ value is: "+Z +" \nz value is : " +z);
	}
	//ASCII VALUES 
	public static void main(String args[])
	{
		for(int i=0;i<100;i++)
		{
			char ch=(char)i;
			System.out.println(ch +" " +i);
		}
	}*/
	//APPLICATION FOR DMART
	public static void main(String args[])
	{
		String item="Tea-cups";
		int price=70;
		double quantity=10;
		double total=price*quantity;
		double discount=total/100*10;
		double finalprice=total-discount;
		int coupon=25;
		finalprice=finalprice-coupon;
		//System.out.println(finalprice);
		int tax=0;
		System.out.println(item +" = "  +price +"*" +quantity +"==" +finalprice);
		if(finalprice>=500)
		{
			tax+=finalprice/100*10;
			System.out.println("\n your bill is : " +finalprice +" you have to  pay tax of 10% which is : " +tax);
		}
		int aftertax=(int)(tax+finalprice);
		if(finalprice==aftertax)
		{
			System.out.println("\n CONGRATUALTIONS YOU DON'T HAVE ANY TAX" +"\n HERE IS YOUR BILL : " +aftertax);
		}
		else
		{
			System.out.println("\n BEFORE TAX AMOUNT : " +finalprice +"\n AFTER CALCULATING THE TAX"  +"\n HERE IS YOUR BILL : " +aftertax);
		}
		System.out.println("THANK YOU VISIT AGAIN :)");
	}
}