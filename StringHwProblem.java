import java.util.*;
class StringHwProblem
{
	//STRING COUNT WITHOUT USING STRING() METHOD
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.lengthCount(s1);
	}
	void lengthCount(String s)
	{
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			count++;
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.noOfCharWord(s1);
	}
	void noOfCharWord(String s)
	{
		int ch=0,words=0;
		String a[]=String.toArray(s);
		for(int i=0;i<=a.length-1;i++)
		{
			String s2=a[i];
			if(s2.length()==1)
			{
				ch++;
			}
			else
				words++;
		}
	}
	//FREQUENCY OF STRING
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.frequencyString(s1);
	}
	void frequencyString(String s)
	{
		char c[]=s.toCharArray();
		int temp[]=new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			if(temp[i]!=0)
			{
				continue;
			}
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					temp[j]=1;
				}
			}
			//UNIQUE ELEMENTS
			if(count==1)
			{
				System.out.println(c[i]);
			}
			//FREQUENCY
			System.out.print(c[i] +" " +count +" ");
		}
	}
	//CALCULATE NO OF WORDS IN A STRING
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.noOfWords(s1);
	}
	void noOfWords(String s)
	{
		s=s.trim();
		String st[]=s.split(" ");
		int count=0;
		for(String t:st)
		{
			count++;
		}
		System.out.println(count);
	}
	//REPLACE WORD IN STRING ARRAY
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter a word to replace with new word");
		String s2=sc.nextLine();
		System.out.println("Enter a word to replace with old word");
		String s3=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.replaceWord(s1,s2,s3);
	}
	void replaceWord(String s1,String s2,String s3)
	{
		String str[]=s1.split(" ");
		for(int i=0;i<=str.length-1;i++)
		{
			if(str[i].equals(s2))
			{
				str[i]=s3;
			}
		}
		for(String s:str)
			System.out.print(s +" ");	
	}
	void replaceWord2(String s1,String s2,String s3)
	{
		s1=s1.replace(s2,s3);
		System.out.println(s1);
	}
	//I/O A1B2C3 O/P ABBCCC
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.printLetters(s1);
	}
	void printLetters(String s)//a12b2c3
	{
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			int count=0;
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				
				char c=s.charAt(i+1);
				count=c-48;
				for(int j=1;j<=count;j++)
				{
					s1+=s.charAt(i);
				}
			}
		}
		System.out.println(s1);
	}
	//STRING TO NUMBER
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.stringToNumber(s1);
	}
	void stringToNumber(String s)
	{
		int n=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			int count=ch-48;
			n=n*10+count;
		}
		System.out.println(n*10);
	}*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1=sc.nextLine();
		StringHwProblem s=new StringHwProblem();
		s.reverseOfMidlleWord(s1);
	}
	void reverseOfMidlleWord(String s)
	{
		String str[]=s.split(" ");
		String s1="";
		if(s.length()%2==0)
		{
			for(int i=str.length-1;i>=0;i--)
			{
				if(str.length/2==i || (str.length/2)-1==i)
				{
					StringBuffer sb= new StringBuffer(str[i]);
					sb.reverse();
					s1=s1+sb+" ";
				}
				else
					s1=s1+str[i]+" ";
			}
			System.out.println(s);
			System.out.println(s1);
		}
		else
		{
			
			for(int i=str.length-1;i>=0;i--)
			{
				if((str.length/2)==i)
				{
					StringBuffer sb=new StringBuffer(str[i]+"");
					sb.reverse();
					s1=s1+sb+" ";
				}
				else
				{
					s1=s1+str[i]+" ";
				}
			}
			System.out.println(s);
			System.out.println(s1);
		}
	}	
}
























