
public class ConvertHexadecimal {

	private final int HEX_BASE = 16;
	private int convertHexToDec;
	private int showDecimal=0;
	private HexEquivalence hexEquivalence = new HexEquivalence();
	
	public void getDecimal(String getHexadecimal) {
		
		StringBuilder reverse = new StringBuilder(getHexadecimal);
		
		getHexadecimal = reverse.reverse().toString();
		
		String[] dec = new String[getHexadecimal.length()];
		
		// let us interpret first the hex values from getHexadecimal
		for (int x=0; x < dec.length; x++) {
			dec[x] = String.valueOf(getHexadecimal.charAt(x));
			dec[x] = String.valueOf(hexEquivalence.getDecValue(dec[x]));
		}
		
		// ready to convert hex value to decimal now
		for (int i=0; i < dec.length; i++) {
			convertHexToDec = Integer.parseInt(dec[i]);
			convertHexToDec = convertHexToDec * (int) Math.pow(HEX_BASE, i);
			showDecimal += convertHexToDec;
			System.out.println(dec[i] + " x " + HEX_BASE + " raise to " + i + " = " + convertHexToDec);
		}
		System.out.println("BASE OF 10: " + showDecimal);

		
	}
	
}
