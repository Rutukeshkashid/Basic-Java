package Arrayclasswithstring;

import java.util.Arrays;

public class ProgrameArray {
	
	public static void main(String[] args) {
		
		String [] name =new String[3];
		
		name [0]="Rutukesh";
		name [1]="Rutukesh1";
		name [2]="Rutukesh2";
		
		for(int i=0;i<=2;i++)
		{
			System.out.print(name[i]+" ");
					
		}
		System.out.println(Arrays.toString(name));
	}

}
