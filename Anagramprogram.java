package Arrayclasswithstring;

import java.util.Arrays;

public class Anagramprogram {
	
	public static void main(String[] args) {
		
		String s= "act";
		String s1= "cat";
		
		
		if(s.length()!=s1.length())
		{
			System.out.println("They are not anagram");
		}
		else
		{
			char a[]=s.toCharArray();
			char a1[]=s1.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(a1);
			
			
			boolean x=Arrays.equals(a1, a);
			
			if(x==true)
			{
				System.out.println("This is anagram");
			}
			else
			{
				System.out.println("This is not anagram");
			}
			
					
			
		}
		
		
		
	}

}
