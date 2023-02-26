public class For {
    public static void main(String args[]) {
        double num, sroot;
        for (num = 1.0; num < 10.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("SQRT from " + num + " = " + sroot);
        }
        int x;
        for (x = 30; x > -11; x -= 5) {
            System.out.println("x = " + x);
        }
        ;
        System.out.println();
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j " + i + " " + j);
        }
        System.out.println();

    }
}
