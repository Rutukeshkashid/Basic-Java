package Arrayclasswithstring;

import java.util.Arrays;
import java.util.Scanner;

public class Programeint {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the number of integer that we want to store");
		int [] value=new int[sc.nextInt()];
		
	for(int i=0;i<value.length;i++)
	{
		System.out.println("Enter the value of int");
		value[i]=sc.nextInt();
	}	
	
		System.out.println(Arrays.toString(value));
		sc.close();
	}

}
