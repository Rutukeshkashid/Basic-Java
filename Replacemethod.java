package Arrayclasswithstring;

public class Replacemethod {
	
	public static void main(String[] args) {
		
		String a="Rutukesh Kashid";
		
		//String [] b6= a.
		
		 String b=a.replace('R','H');
		 
		 System.out.println(b);
		 
		 String b1=a.replace("Rutukesh", "Raj");
		 
		 System.out.println(b1);
		 
		 String b2=a.replaceAll("[A-Z]","");
		 
		 System.out.println(b2);
		 
        String b3=a.replaceAll("[a-z]","");
		 
		 System.out.println(b3);
		 
		 boolean b4=a.endsWith("h");
		 
		 System.out.println(b4);
		 
		 int b5=a.lastIndexOf('u');
		 
		 System.out.println(b5);
		 
		 
		 
		 
		 
		 
		
		
	}

}
