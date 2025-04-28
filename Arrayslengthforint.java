package Arrayclasswithstring;

import java.util.Arrays;

public class Arrayslengthforint {
	public static void main(String[] args) {
		
		int arrays []=new int[4];
		int arrays1 []=new int[4];
		
		arrays [0]=10;
		arrays [1]=11;
		arrays [2]=12;
		arrays [3]=13;
		
		arrays1 [0]=10;
		arrays1 [1]=11;
		arrays1 [2]=12;
		arrays1 [3]=13;
		
		boolean b1=Arrays.equals(arrays, arrays1);
		if(b1==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
		
		
		
		
	}

}
