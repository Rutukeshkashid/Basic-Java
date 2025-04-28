package Arrayclasswithstring;

import java.util.Arrays;
import java.util.Scanner;

public class ProgrameArray1 {
	
	public static void main(String[] args) {
		
		String [] name1=new String[4];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the "+name1.length+" Selements of array");
		
		for(int i=0;i<name1.length;i++)
		{
			name1[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(name1));
		
	}

}
