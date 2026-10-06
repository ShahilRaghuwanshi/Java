package ScientificNotation;

/**
 * ============================================================================
 *                    JAVA SCIENTIFIC NOTATION (EXPONENT NOTATION)
 * ============================================================================
 * 
 * In Java, scientific notation represents floating-point numbers using 
 * powers of 10 in a compact format.
 * 
 * ----------------------------------------------------------------------------
 * 1. SYNTAX & FORMAT:
 * ----------------------------------------------------------------------------
 *  Format: [Mantissa]e[Exponent][Suffix]  OR  [Mantissa]E[Exponent][Suffix]
 *  Example: 3.147456e+3f
 * 
 *  - Mantissa : Base floating-point number (e.g., 3.147456)
 *  - Exponent : Power of 10 multiplier (e+3 or E+3 means * 10^3)
 *  - Suffix   : 'f'/'F' for float, 'd'/'D' for double (defaults to double if omitted)
 * 
 * ----------------------------------------------------------------------------
 * 2. KEY RULES:
 * ----------------------------------------------------------------------------
 *  - Case Insensitive : Both 'e' and 'E' perform identical operations.
 *  - Positive Exponent (e+N / eN) : Multiplies by 10^N (Shifts decimal RIGHT).
 *  - Negative Exponent (e-N)      : Multiplies by 10^-N (Shifts decimal LEFT).
 * 
 * ----------------------------------------------------------------------------
 * 3. EQUIVALENT VALUES:
 * ----------------------------------------------------------------------------
 *  - 3147.456  ==  3.147456e+3f  (3.147456 * 10^3)
 *  - 3147.456  ==  3147456e-3f   (3147456 * 10^-3)
 * ============================================================================
 */
public class ScientificNotation {
<<<<<<< HEAD
	public static void main(String[] args) {
		
		float a = 3147.456f;
		System.out.println(a);
		
		float b = 3.147456e+3f;
		System.out.println(b);
		
		float c = 3147.456E+3f;
		System.out.println(c);
	}
=======
    public static void main(String[] args) {
        
        // Standard decimal notation
        float a = 3147.456f;
        System.out.println(a); // Output: 3147.456
        
        // Lowercase 'e' scientific notation
        float b = 3.147456e+3f;
        System.out.println(b); // Output: 3147.456
        
        // Uppercase 'E' scientific notation
        float c = 3.147456E+3f;
        System.out.println(c); // Output: 3147.456
    }
>>>>>>> 58c0cfe03bf317ce319f6e18fa9fcb42b2b17c22
}
