package Arrayclasswithstring;

import java.util.Arrays;
import java.util.Scanner;

public class copyeprogrameinarray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String [] lastname=new String[3];
		String [] lastname1=new String[3];
		
		for(int i=0;i<lastname.length;i++)
		{
			System.out.println("Entre input name here");
			lastname[i]=sc.next();
			
			lastname1[i]=lastname[i];
			
		}
		System.out.println("Input"+Arrays.toString(lastname));
		System.out.println("output"+Arrays.toString(lastname1));
		sc.close();
	}

}
