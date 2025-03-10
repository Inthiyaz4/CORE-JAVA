class dayseven
{
	/*public static void main(String args[])
	{
		int sn=1, n=5,r=2, nfac=1;
		while(sn<=n)//1<=9 true 2<=9 true 3<=9 t .........10<=9 false 
		{
			nfac*=sn; //1*1=1 1*2=2
			sn++; //2 3 
		}
		sn=1; int nr=n-r,nrfac=1;
		while(sn<=nr)// 1<=7 t 2<=7t ................. 8<=7 false
		{
			nrfac*=sn; // 1*1=1 2*1=2 ......
			sn++; // 1 2 3.... 8
		}
		int npr=nfac/nrfac; // 120/6 = 20
		System.out.println(npr); // 20 
	}
	public static void main(String args[])
	{
		int sn=1900, en=2000;
		while(sn<=en)// 1900<=2000 ture
		{
			if(sn%4==0 && sn%100!=0 || sn%400 ==0) // 1900%4 ==0 true && 1900%100!=0 false || 1900%4==0 ture soo truee
				if(sn%6==0)
					System.out.println(sn +" Is Divisible by 6 and a leap year ");//1900 is divisible by 6 and a leap year
			sn++; // 1901
		}
	}
	//USING SINGLE LOOP 
	public static void main(String args[])
	{
				 1 2 6 24 120
		int sn=1,n=5,r=2,nfac=1,sn1=1,nr=n-r,nrfac=1; //nr=5-2=3 nrfac=1 2 6 
		while(sn<=n) //1<=5 t //2<=5t 3<=5 t 4<=5 t 5<=5 t 6<=5 false exit the loop
		{
			nfac*=sn; // 1*1=1 1*2=2  2*3=6 6*4=24 24*5=120 
			if(sn1<=nr) // 1<=3t 2<=3 t 3<=3 t 4<=3false skip if part
			{
				nrfac*=sn1;//1*1=1 1*2=2 2*3=6 
				sn1++;//2 3 4 
			}
			sn++;//2 3 4 5 6 
		}
		int npr=nfac/nrfac; // 120/6 = 20
		System.out.println(npr); //20
	}
	public static void main(String args[])
	{
		int n=2025;
		int ld=n%10;
		int sn=1;
		int fac=1;
		while(sn<=ld)
		{
			fac*=sn;
			sn++;
		}
		double square=(int)(Math.sqrt(fac));
		if(square*square==fac)
		{
			System.out.println("factorial of 2005 last digit  : "+ld +" is " +fac +" and it is perfect square");
		}
		else 
			System.out.println("factorial of 2005 last digit  : "+ld +" is " +fac +" and it is not perfect square");
	}*/
	public static void main(String args[])
	{
		int sn=1,en=3,sum=0,pro=1;
		while(sn<=en)
		{
			sn++;
			sum+=sn;
			pro*=sn;
		}
			System.out.println(sum);
			System.out.println(pro);
		
	}
}