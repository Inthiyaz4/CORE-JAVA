class dayten
{
	//PRINT REVERSE OF A NUMBER AND ALSO CHECKS ITS PALINDROME OR NOT
	/*public static void main(String args[])
	{
		int num=12321,rev=0, temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("reverse of a " +temp +" is " +rev);
		System.out.println((temp==rev)? "palindrome " : "not a palindrome");
	}
	//REVERSE OF NUMBER AND AGAIN REVERSE OF NUMBER CHECK ACTUAL NUM IS EQUAL TO REVERSE OF NUMBER IF NOT CORRECT IT 
	public static void main(String args[])
	{
		int num=12000,rem=0,rev=0,temp=num,rev1=0,count=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem==0)
				count++;
			rev=rev*10+rem;
			num/=10;
		}
		num=rev;
		//System.out.println(num);
		while(num!=0)
		{
			rem=num%10;
			rev1=rev1*10+rem;
			num/=10;
		}
		int pow=(int)Math.pow(10,count);
		rev1=rev1*pow;
		//System.out.println(rev);
		//System.out.println(rev1);
		System.out.println((temp==rev1)? "palindrome" : "not a palindrome");
	}
	//PRINT WORDS OF A NUMBER
	public static void main(String args[])
	{
		int num=120541,rem=0,rev=0,temp=num,count=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem==0)
				count++;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			while(rev!=0)
			{
				rem=rev%10;
				switch(rem)
				{
					case 1:
						System.out.print("one" +" ");
						break;
					case 2:
						System.out.print("two" +" ");
						break;
					case 3:
						System.out.print("three" +" ");
						break;
					case 4:
						System.out.print("four" +" ");
						break;
					case 5:
						System.out.print("five" +" ");
						break;
					case 6:
						System.out.print("six" +" ");
						break;
					case 7:
						System.out.print("seven" +" ");
						break;
					case 8:
						System.out.print("eight" +" ");
						break;
					case 9:
						System.out.print("nine" +" ");
						break;
					case 0:
						System.out.print("zero" +" ");
						break;
				}
				rev=rev/10;
			}
		}
		else
		{
			while(rev!=0)
			{
				rem=rev%10;
				switch(rem)
				{
					case 1:
						System.out.print("one" +" ");
						break;
					case 2:
						System.out.print("two" +" ");
						break;
					case 3:
						System.out.print("three" +" ");
						break;
					case 4:
						System.out.print("four" +" ");
						break;
					case 5:
						System.out.print("five" +" ");
						break;
					case 6:
						System.out.print("six" +" ");
						break;
					case 7:
						System.out.print("seven" +" ");
						break;
					case 8:
						System.out.print("eight" +" ");
						break;
					case 9:
						System.out.print("nine" +" ");
						break;
					case 0:
						System.out.print("zero" +" ");
						break;
				}
				rev=rev/10;
			}
			for(int i=0;i<count;i++)
				System.out.print("zero" +" ");
		}
	}
	//INPUT 12345 OUTPUT 5*1=5+ 4*2=8 +3=16 ONLY ODD NUMBERS 
	public static void main(String args[])
	{
		int num=95784,rem=0,count=0,sn=1,rev=0,middle=0,temp=num,sum=0,pro=1,last=0,first=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			count++;
			num/=10;
		}
		num=temp;
		int end=count/2+1;
		while(sn<=end)
		{
			if(sn==end)
			{
				middle=num%10;
			}
			else
			{
				first=num%10;
				last=rev%10;
				pro=last*first;
				sum=sum+pro;
				rev/=10;
				num/=10;
			}
			sn++;
		}
		sum+=middle;
		System.out.println(sum);
	}*/		
}