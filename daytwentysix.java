import java.util.*;
class daytwentysix
{
	//STRING BUFFER 
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentysix d=new daytwentysix();
		d.stringBuffer(s);
	}
	void stringBuffer(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		if(s.contentEquals(sb))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	
	}
	//CONCATE
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentysix d=new daytwentysix();
		d.isConcate(s);
		d.isPlus(s);
	}
	void isConcate(String s)
	{
		s=s.concat("HLOO");
		System.out.println(s);
	}
	void isPlus(String s)
	{
		s="this is " +s +" from coding hub";
		System.out.println(s);
	}
	//STRING BUILDER
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentysix d=new daytwentysix();
		d.stringBuilder(s);
	}
	void stringBuilder(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		//sb.append("hello");
		System.out.println(sb);
		if(s.contentEquals(sb))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}
	//IDENTITY HASH CODE
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		daytwentysix d=new daytwentysix();
		d.identityHashCode(s);
	}
	void identityHashCode(String s)
	{
		int n=System.identityHashCode(s);
		System.out.println(n);
	}
	//ANAGRAMS
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter second String: ");
		String s2=sc.nextLine();
		daytwentysix d=new daytwentysix();
		//d.isAnagrams(s1,s2);
		d.isAnagramsSecond(s1,s2);
	}
	//FIRST METHOD
	void isAnagrams(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char ch[]=s1.toCharArray();
			Arrays.sort(ch);
			char c[]=s1.toCharArray();
			Arrays.sort(c);
			if(Arrays.equals(ch,c))
				System.out.println("ANAGRAMS");
		}
		else
			System.out.println("NOT ANAGRAMS");
	}
	//SECOND METHOD
	void isAnagramsSecond(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char ch[]=s1.toCharArray();
			Arrays.sort(ch);
			char c[]=s1.toCharArray();
			Arrays.sort(c);
			s1=Arrays.toString(ch);
			s2=Arrays.toString(c);
			//System.out.println(s1);	
			if(s1.equals(s2))	
				System.out.println("ANAGRAMS");
		}
		else
			System.out.println("NOT ANAGRAMS");
	}*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		daytwentysix d=new daytwentysix();
		d.findElem(s1);
	}
	void findElem(String s)
	{
		char c[]=s.toCharArray();
		Arrays.sort(c);
		Scanner sc=new Scanner(System.in);
		System.out.println(c);
		System.out.println("enter the character to search:");
		char ch=sc.next().charAt(0);
		
		System.out.println(Arrays.binarySearch(c,ch));
	}
}


































