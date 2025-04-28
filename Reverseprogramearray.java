package Arrayclasswithstring;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseprogramearray {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int [] valueinput=new int[3];
		int [] valueoutput=new int[3];
		
		for(int i=0;i<=2;i++)
		{   
			System.out.println("Entre input nos.");
			valueinput[i]=sc.nextInt();
					
		}
		
		int x=0;
		
		for(int i=2;i>=0;i--)
		{   
			
			valueoutput[x]=valueinput[i];
			x++;
					
		}
		
		
		System.out.println(Arrays.toString(valueinput));
		System.out.println(Arrays.toString(valueoutput));
			
		sc.close();
	}

}
