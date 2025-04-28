package Arrayclasswithstring;

public class Matches {
	
	public static void main(String[] args) {
		
		String a="care";
		
		//check is it contain 4 letter or not
		boolean b1=a.matches("....");
		
		System.out.println(b1);
		
		//check is it start with c
		
		boolean b2=a.matches("c(.*)");
		
		System.out.println(b2);
		
		//check is it ends with e
		
		boolean b3=a.matches("(.*)e");
		System.out.println(b3);
		
		//Check if it contain in man like manger,salman khan
		String s2="salman khan";
		
		boolean b4=s2.matches("(.*)man(.*)");
		
		System.out.println(b4);
		
		//with help of contain we can check anywhere of man	
		boolean b5=s2.contains("man");
		
		System.out.println(b5);
		
		
	}

}
