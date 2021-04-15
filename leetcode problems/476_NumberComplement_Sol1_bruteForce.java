import java.util.Scanner;

/*
Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
---------------------------------

Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/


public class NumberComplement {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		int complement = findComplement(input);
		System.out.println(complement);
	}

	public static int findComplement(int num) {
		int complement = 0;
		if(num == 1)
			return 0;
		String binaryRepresentation = convertDecimalToBinary(num);
		String complementOfBinary = findComplementOfBinary(binaryRepresentation);
		complement = convertBinaryToDecimal(complementOfBinary);
		
		return complement;
	}

	public static String convertDecimalToBinary(int num) {
		String binaryRepresentation = "";
		
		while(num > 0) {
			binaryRepresentation += String.valueOf(num % 2);
			num = num/2;
		}
		binaryRepresentation = new StringBuffer(binaryRepresentation).reverse().toString();
		return binaryRepresentation;
	}

	public static String findComplementOfBinary(String num) {
		String complementOfBinary = "";
		StringBuilder builder = new StringBuilder(num);

		for(int index=0; index<num.length();index++) {
			if(num.charAt(index) == '1')
				builder.setCharAt(index,'0');
			else 
				builder.setCharAt(index,'1');
		}	
		
		complementOfBinary = builder.toString();
		return complementOfBinary;
	}

	public static int convertBinaryToDecimal(String complement) {
		int decimalRepresentation = 0;
		
		int base = 1;
		for(int index=complement.length()-1;index>=0;index--) {
			if(complement.charAt(index) == '1')
				decimalRepresentation+=base;
			
			base*=2;
		}
		return decimalRepresentation;
	}
}
