import java.util.*;
class dayfour
{
	/*public static void main(String args[])
	{
	//if else
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Age : ");
	int n=sc.nextInt();
	if(n>100)
		System.out.println("Given age : " +n +" is Invalid Try another ):");
	else if(n>60)
		System.out.println("Given age : " +n +" is a Senior Citizen");
	else if(n>18)
		 System.out.println("Given age : " +n +" is a major");
	else if(n>10)
		System.out.println("Given age : " +n +" is a minor");
	else if(n>0)
		System.out.println("Given age : " +n +" is a kid");
	else
		System.out.println("Given age : " +n +" is a Negative");
	}
	public static void main(String args[])
	{
		int c=85, java=0 , py=0;
		double totalmarks=300;
		int per=(int)((c+java+py)/totalmarks*100);

		//System.out.println(percentage);
		if(per>100)
			System.out.println(+per +" is Invalid Grade Check it again");
		else if(per>90)
			System.out.println(+per +" = S");
		else if(per>80)
			System.out.println(+per +" = A+");
		else if(per>70)
			System.out.println(+per +" = A");
		else if(per>60)
			System.out.println(+per +" = B+");
		else if(per>50)
			System.out.println(+per +" = B");
		else if(per>40)
			System.out.println(+per +" = C");
		else if(per>35)
			System.out.println(+per +" = D");
		else
			System.out.println(+per +" = FAIL");
	}

	public static void main(String args[])
	{
		String str="inter";
		int book=300;
		int days=15;
		int fine=0;
		int noofdays=5;
		if(str=="btech" || str=="degree")
		{
			int total=noofdays-days;
			if(total>=30)
			{
				fine+=book;
			}
			else
			{
				int finecal=total*10;
				fine+=finecal;
			}
		}
		else if(str=="inter" || str=="poly")
		{
			int total=noofdays-days;
			if(total>=30)
			{
				fine+=book;
			}
			else
			{
				int finecal=total*5;
				fine+=finecal;
			}
		}
	System.out.println(str +" total money : " +fine); 		
	}
	public static void main(String args[])
	{
		int a=5,b=20;
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else if(a>b)
		{
			System.out.println(a +" is big");
		}
		else
		{
			System.out.println(b +" is big");
		}
	}
	//TERNARY OPERATOR
	public static void main(String args[])
	{
		int a=5, b=20;
		int max= (a>b) ? a : b;
		System.out.println(max);
	}*/
	public static void main(String args[])
	{
		String str="inthiyaz", str1="pasha";
		String equal= (str==str1) ? str1 : str;
		System.out.println(equal);
	}
}