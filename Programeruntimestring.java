package Arrayclasswithstring;

import java.util.Arrays;
import java.util.Scanner;

public class Programeruntimestring {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String[] firstname= new String [4];
		
		for(int i=0;i<firstname.length;i++)
		{
			System.out.println("Entre the value of sting");
			firstname[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(firstname));
		sc.close();
		
	}

}
