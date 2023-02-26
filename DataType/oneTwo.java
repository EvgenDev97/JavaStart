package DataType;

public class oneTwo {
    public static void main(String args[]) {
        int q, p;
        System.out.println("P\tQ\tAnd\tOR");
        p = 1;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");

        p = 1;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");

        p = 0;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");

        p = 0;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        // System.out.println((p ^ q) + "\t" + (!p));
    }
}
