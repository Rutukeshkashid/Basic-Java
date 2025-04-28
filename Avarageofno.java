package Arrayclasswithstring;

public class Avarageofno {
	public static void main(String[] args) {
		 int nos[]= new int[4];
		 
		 nos[0]=5;
		 nos[1]=5;
		 nos[2]=5;
		 nos[3]=5;
		 int sum=0;
		 
		 for(int i=0;i<4;i++)
		 {
			 sum=sum+nos[i];
						 
		 }
		 
		 System.out.println(sum);
		 
		 double avg=sum/nos.length;
		 
		 System.out.println(avg);
		 
		 
		 
	}

}
