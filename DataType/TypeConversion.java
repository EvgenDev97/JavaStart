package DataType;

public class TypeConversion {
    public static void main(String args[]) {
        long L;
        double D;
        L = 123456789;
        D = L;
        System.out.println("L and D: " + L + " " + D);
        // conversion a doble into a long does not working. ERROR
        double x, y;
        int c, i;
        byte b;
        char ch;
        x = 12.0;
        y = 4.0;
        c = (int) (x / y);
        System.out.println(c);
        System.out.println();
        i = 100;
        b = (byte) i;
        System.out.println("Value b = " + b);
        i = 257;
        b = (byte) i;
        System.out.println("Value b = " + b + " byte type does not contain the value 257");
        b = 88;
        // ch = char(b); Error!
        b = 88; // X in ASCII
        ch = (char) b;
        System.out.println("ch= " + ch);
    }
}
