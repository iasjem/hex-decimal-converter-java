
public class HexEquivalence {
	private int decValue;
	private String hexValue;

	// Get the hex value equivalence of a decimal remainder
	public String getHexValue(int dec) {
		switch (dec) {
		case 10:
			hexValue = "A";
			break;
		case 11:
			hexValue = "B";
			break;
		case 12:
			hexValue = "C";
			break;
		case 13:
			hexValue = "D";
			break;
		case 14:
			hexValue = "E";
			break;
		case 15:
			hexValue = "F";
			break;
		default:
			hexValue = " ";
			break;
		
		}
		
		return hexValue;
	}
	
	// get the decimal value of a hexadecimal
	public int getDecValue(String hex) {
		
		switch (hex) {
		case "A": case "a":
			decValue = 10;
			break;
		case "B": case "b":
			decValue = 11;
			break;
		case "C": case "c":
			decValue = 12;
			break;
		case "D": case "d":
			decValue = 13;
			break;
		case "E": case "e":
			decValue = 14;
			break;
		case "F": case "f":
			decValue = 15;
			break;
		default:
				decValue = Integer.parseInt(hex);
			break;
		
		}
		
		return decValue;
		
	}
	
}
