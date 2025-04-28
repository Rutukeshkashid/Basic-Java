package Arrayclasswithstring;

import java.util.Arrays;
import java.util.Scanner;

public class Programequalarray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre the length of input array");
		
		String [] input= new String[sc.nextInt()];
		
		System.out.println("Entre the length of output array");
		String [] output= new String[sc.nextInt()];
		System.out.println("Entre the  strings input");
		for(int i=0;i<input.length;i++)
		{
			
			
			input[i]=sc.next();
		}
		System.out.println(Arrays.toString(input));
		 System.out.println("Entre the  strings output");
		for(int i=0;i<output.length;i++)
		{
          
			
			output[i]=sc.next();
		}
		System.out.println(Arrays.toString(output));
		int c=0;
		if(input.length==output.length)
		{
			for(int i=0;i<input.length;i++)
			{
				String x=input[i];
				
				for(int j=0;j<output.length;j++)
				{
					String y=output[j];
					
					if(x.equals(y))
					{
					c++;
					System.out.println(c);
					}
								
					
				}
				//System.out.println(c);
				
				
				
			}
			if(c==input.length)
			{
				System.out.println("Array elements are same");
			}
			else
			{
				System.out.println("Array elements are not same");
			}
			
		}
		else
		{
			System.out.println("arrays are not equal");
		}
	}
	
	

}
