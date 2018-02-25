/*
 * A simple program that converts hexadecimal to decimal and vice versa
 * Please see other comments on project for more information about program
 */

import java.util.*;

public class MainSrc {

	public static void main(String[] args) {
		System.out.println("Hexadecimal-Decimal Converter by IasJem\n");
		
		ConvertDecimal convertDecimal = new ConvertDecimal();
		ConvertHexadecimal convertHexadecimal = new ConvertHexadecimal();
		int getDecimal; String getHexadecimal;
		
		Scanner hexadecimal = new Scanner(System.in);
		
		System.out.print("Enter a Decimal numnber:");
		getDecimal = hexadecimal.nextInt();
		
		// get the Hex value from a Decimal
		convertDecimal.getHexadecimal(getDecimal);

		System.out.print("\n");
		
		Scanner decimal = new Scanner(System.in);
		
		System.out.print("Enter a Hexadecimal number:");
		getHexadecimal = decimal.nextLine();
		
		// get the Decimal value from a Hexadecimal
		convertHexadecimal.getDecimal(getHexadecimal);
		
		hexadecimal.close();
		decimal.close();
	}

}
