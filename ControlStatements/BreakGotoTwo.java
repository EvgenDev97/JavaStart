public class BreakGotoTwo {
    public static void main(String agrs[]) {
        int i, j, k;
        done: for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 10; k++) {
                    System.out.println("k = " + k);
                    if (k == 5)
                        break done;
                }
                System.out.println("After block k "); // will not be displayed
            }
            System.out.println("After blok j");// will not be displayed
        }
        System.out.println("After blok i");
    }
}
