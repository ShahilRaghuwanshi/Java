package WrapperClasses;

@SuppressWarnings("deprecation")
public class WrapperClasses {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
        
        // --------------------------------------------------------------------
        // 1. Primitive Data Types (Value stored in data type)[cite: 4]
        // --------------------------------------------------------------------
        char a = 'x';
        byte b = 10;
        short c = 20;
        int d = 30;
        long e = 40;
        float f = 3.147f;
        double g = 33.3384;
        boolean h = true;

        System.out.println("--- Primitive Values ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // --------------------------------------------------------------------
        // 2. Wrapper Classes (Value stored in object not in datatypes)
        // --------------------------------------------------------------------
        Character wrapper_a = new Character('x');
        Byte wrapper_b = new Byte((byte) 10);
        Short wrapper_c = new Short((short) 20);
        Integer wrapper_d = new Integer(30);
        Long wrapper_e = new Long(40);
        Float wrapper_f = new Float(3.147f);
        Double wrapper_g = new Double(33.3384);
        Boolean wrapper_h = new Boolean(true);

        System.out.println("\n--- Wrapper Object Values ---");
        System.out.println("wrapper_a = " + wrapper_a);
        System.out.println("wrapper_b = " + wrapper_b);
        System.out.println("wrapper_c = " + wrapper_c);
        System.out.println("wrapper_d = " + wrapper_d);
        System.out.println("wrapper_e = " + wrapper_e);
        System.out.println("wrapper_f = " + wrapper_f);
        System.out.println("wrapper_g = " + wrapper_g);
        System.out.println("wrapper_h = " + wrapper_h);
    }
}