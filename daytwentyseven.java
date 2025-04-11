import java.util.*;
class daytwentyseven
{
	//MISSING LETTERS  SMALL AND CAPITAL
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentyseven d= new daytwentyseven();
		d.missingLetter(s);
	}
	void missingLetter(String s)
	{
		String small="",capital="";
		for(char c='a';c<='z';c++)
		{
			int count=0,ccount=0;;
			for(int i=0;i<=s.length()-1;i++)
			{
				char ch=s.charAt(i);
				if(ch==c)
				{
					count++;
				}
				else if(ch==(c-32))
				{
					ccount++;
				}
			}
			if(count==0)
			{
				small=small+" "+c;
			}
			if(ccount==0)
			{
				capital=capital+" "+(char)(c-32);
			}
		}
		System.out.println("small letters are : " +small);
		System.out.println("capital letters are :" +capital);	
	}
	//UNIQUE WORDS AND UNIQUE WORDS IN A STRING 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentyseven d= new daytwentyseven();
		d.duplicateUniqueWords(s);
	}
	void duplicateUniqueWords(String s)
	{
		String str[]=s.split(" ");
		String uni="",dup="";
		System.out.println("Unique words are");
		for(String t :str)
		{
			int count=0;
			if(s.indexOf(t)==s.lastIndexOf(t))
			{
				uni=uni+" "+t;
			}
			else
			{
				if(dup.indexOf(t)==-1)
				{
					dup=dup+" "+t;
				}
				
					
			}
		}
		System.out.println("UNIQUE ELEMENTS ARE :" +uni);
		System.out.println("DUPLICATE ELEMENTS ARE :" +dup);
	}
	//IN A STRING EACH WORDS ARE PLAINCDROME OR NOT
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentyseven d= new daytwentyseven();
		d.wordPalindrome(s);
	}
	void wordPalindrome(String s)
	{
		String str[]=s.split(" ");
		for(String t:str)
		{
			StringBuffer sb=new StringBuffer(t);
			sb.reverse();
			if(t.contentEquals(sb))
				System.out.println(t +" is Palindrome");
		}
	}
	//REMOVING MULTIPLE SPACES IN A STRING 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentyseven d= new daytwentyseven();
		d.removeMultipleSpaces(s);
	}
	void removeMultipleSpaces(String s)
	{
		String str="";
		s=s.trim();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			else
			{
				str+=s.charAt(i);
			}
		}
		System.out.println(str);
	}*/
	//RIGHT ROTATION  STRING TO FIND THE ANOTHER STRING VALUE
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		System.out.println("Enter another string to search");
		String s2=sc.nextLine();
		daytwentyseven d= new daytwentyseven();
		d.rightRotationString(s,s2);
	}
	void rightRotationString(String s,String s2)
	{
		char c[]=s2.toCharArray();
		if(s.equals(s2))
		{
			System.out.println("EQUALS");
		}
		else
		{
			char ch[]=s.toCharArray();
			int j;
			for(j=0;j<s.length();j++)
			{
				char temp=ch[ch.length-1];
				int i=0;
				for(i=ch.length-1;i>0;i--)
				{
					ch[i]=ch[i-1];
					//System.out.println(ch);
				}
				ch[i]=temp;
				if(Arrays.equals(c,ch))
				{
					System.out.println("equals");
					break;
				}
				//System.out.println(ch);
			}
			if(j==s.length())
			{
				System.out.println("NOT EQUALS");
			}
		}
		
	}
}

















