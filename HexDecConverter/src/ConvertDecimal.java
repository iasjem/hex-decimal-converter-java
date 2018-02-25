
public class ConvertDecimal {

	private final int HEX_BASE = 16;
	private int convertDecToHex;
	private String showHexadecimal = "";
	private String remainder =""; 
	private HexEquivalence hexEquivalence = new HexEquivalence();
	
	public void getHexadecimal(int getDecimal) {
		
		while (getDecimal > 0) {
			convertDecToHex = getDecimal % HEX_BASE;
			// Check if Remainder is 10 to 15, if yes, it should return as a character from A to F
			// e.g. 10 in Hex value is equivalent to A
			if (convertDecToHex >= 10 && convertDecToHex <= 15) {
				remainder = hexEquivalence.getHexValue(convertDecToHex);
			} else { 
			// If not, just return the actual value of remainder as it is
				remainder = String.valueOf(convertDecToHex);
			}
			showHexadecimal = showHexadecimal + "" + remainder;
			System.out.println("Quotient: " + getDecimal + " => Remainder: " + remainder);
			getDecimal /= HEX_BASE;
		}
		
		StringBuilder reverse = new StringBuilder(showHexadecimal);
		showHexadecimal = reverse.reverse().toString();
		System.out.println("BASE OF 16: " + showHexadecimal);
		
	}
	
}
