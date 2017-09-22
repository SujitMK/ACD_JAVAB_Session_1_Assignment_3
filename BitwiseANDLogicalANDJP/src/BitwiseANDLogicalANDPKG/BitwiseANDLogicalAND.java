package BitwiseANDLogicalANDPKG;

import java.util.Scanner;

public class BitwiseANDLogicalAND {

	public static void main(String[] args) {
		
		System.out.println("***This program is to demonstrate the Bitwise AND***");
		
		// Using Scanner to take dynamic/runtime values for parameters a and b
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter the Byte value for A");
	    int a = input.nextInt();
				
		System.out.println("Enter the Byte value for B");
		int b = input.nextInt();
		
		// Logic to perform Bitwise AND
		
		 int c = a & b;
		 System.out.println("The Result of the Bitwise AND operation on A and B is: "+ c);
		 
		 System.out.println("====================================================");
		 System.out.println("***This program is to demonstrate the Logical AND***");
			
		// Taking dynamic/runtime values for parameters x and y
					
		 System.out.println("Enter the Boolean value for X");
		 boolean x = input.nextBoolean();
					
		 System.out.println("Enter the Boolean value for Y");
		 boolean y = input.nextBoolean();
			
		// Logic to perform Logical AND
	     boolean z = x && y;
		 
	    System.out.println("The Result of the Logical AND operation on A and B is: "+ z);
		 
		input.close();
	}
}
