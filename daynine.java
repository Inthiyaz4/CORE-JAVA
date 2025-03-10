class daynine
{
	//PRINT NO OF EVEN AND ITS SUM AND ODD AND ITS PRODUCT
	/*public static void main(String args[])
	{
		int num=254532125,sum=0,pro=1,temp=num;
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				sum+=rem;
			}
			else
				pro*=rem;
			num/=10;
		}
		System.out.println(temp +" sum of even digits " +sum);
		System.out.println(temp +" pro of odd digits " +pro);
	}
	//PRINT IF NUMBER OF COUNT IS EVEN THEN FIRST HALF AND SECONF HALF SUM IF ODD LAST DIGIT AND REMAIING ALL ADD
	public static void main(String args[])
	{
		int num=1245,count=0,temp=num,divid=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		if(count%2==0)
		{
			int n=count/2;
			int c=(int)Math.pow(10,n);
			int c=1,sn=1;
			while(sn<=n)
			{
				c=c*10;
				sn++;
			}
			int que=num/c;
			int rem=num%c;
			int add=que+rem;
			System.out.println(que +" + "+rem +" = " +add);
		}
		else
		{
			int rem=num%10;
			int que=num/10;
			int add=que+rem;
			System.out.println(que +" + "+rem +" = " +add);
		}
	
	}
	//MAX DIGIT IN A NUMBER
	public static void main(String args[])
	{
		int num=1234,max=Integer.MIN_VALUE;
		while(num!=0)
		{
			int rem=num%10;
			if(rem>max)
				max=rem;
			num/=10;
		}
		System.out.println(max);
	}*/
	//MIN DIGIT IN A NUMBER
	public static void main(String args[])
	{
		int num=4556154,min=Integer.MAX_VALUE,temp=num;
		while(num!=0)
		{
			int rem=num%10;
			if(rem<min)
				min=rem;
			num/=10;
		}
		System.out.println("SMALLEST DIGIT IN GIVEN " +temp +" IS " +min);
	}
	
}