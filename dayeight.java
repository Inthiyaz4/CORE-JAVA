class dayeight
{
	//FIBANOCCII
	/*public static void main(String args[])
	{
		int n1=0,n2=1,n=0,n3=0;
		while(n<=10) // 0<=10t 1<=10 //2<=10 
		{
			
			if(n==0 || n==1 )//0==0t 1==0f 
				System.out.print(n +" "); //0
			else 
			{
				n3=n1+n2; // n3= 0+1=1; 1+1=2
		 		System.out.print(n3 +" " ); //1 2 
				n1=n2;//1 2
				n2=n3; //1  2 3
			}
			
			n++; //1 2 3
		}
	}
	// COMMON FACTORS AND HIGHER FACTOR IN BOTH NUMBERS 	
	public static void main(String args[])
	{
		int n=6,n1=12,sn=1,max=Integer.MIN_VALUE;
		int sm=(n<n1)?n:n1;
		while(sn<=sm)
		{
			if(n%sn==0 && n1%sn==0)
					if(sn<max)
					{
						System.out.print(sn +" ");
						max=sn;
						
					}
			sn++;
		}
		System.out.println();	
		System.out.println(max);		
	}*/
	// COMMON FACTORS AND SMALLER FACTOR IN BOTH NUMBERS
	public static void main(String args[])
	{
		int n=6,n1=12,sn=1,min=Integer.MAX_VALUE;
		int sm=(n<n1)?n:n1;
		while(sn<=sm)
		{
			if(n%sn==0 && n1%sn==0)
					if(sn<min && sn!=1)
					{
						min=sn;
					}
			sn++;
		}
		System.out.println();	
		System.out.println(min);
	}
}