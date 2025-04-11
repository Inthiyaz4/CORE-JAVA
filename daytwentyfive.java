import java.util.Scanner;
class daytwentyfive
{
	//LOWER TO UPPER  && UPPER TO LOWER CASE
	/*public static void main(String args[])
	{
		String s="aPpLe 12 @";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				s1+=(char)(ch+32);
			else if(ch>='a' && ch<='z')
				s1+=(char)(ch-32);
			else
				s1+=ch;
		}
		System.out.println(s);
		System.out.println(s1);
	}
	//index even store and odd index store diff str and revsre them
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentyfive d=new daytwentyfive();
		d.reverseOrder(s);
		
	}
	void reverseOrder(String s)
	{
		String even="";
		String odd="";	
		String out="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2==0)
				even+=s.charAt(i);
			else
				odd+=s.charAt(i);
		}
		even=even.toLowerCase();
		odd=odd.toUpperCase();
		for(int i=even.length()-1;i>=0;i--)
		{
			out+=even.charAt(i);
		}
		out+=odd;
		System.out.println(out);
	}*/
	//MAX VOWEL IN STRING
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentyfive d=new daytwentyfive();
		d.maxVowel(s);
	}
	void maxVowel(String s) //heolloo
	{
		int max=0,semax=0;
		String str="";
		char sc=' ';
		for(int i=0;i<=s.length()-1;i++)//helloouu
		{
			int count=1;
			char ch=s.charAt(i);
			for(int j=i+1;j<=s.length()-1;j++)
			{
				char ch1=s.charAt(j);
				if(ch==ch1 && (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
				{
					count++;
				}
			}
			if(count>=max)
			{
				if(count>max)
				{
					max=count;
					str=ch+" ";
				}
				else
				{
					str=str+" "+ch;
				}
			}
		}
		System.out.println(str);
	}
}
	//ENCAPSULATION
	/*public static void main(String args[])
	{
		person p=new person();
		p.setPassword("intuhj");
		System.out.println(p.getPassword());
		
	}			
}
class person
{
	public String email="abc@gmail.com";
	private String password="abc@123";
	public void setPassword(String password)
	{
		this.password=password;
		
	}
	public String getPassword()
	{
		return password;
	}
}*/


















