public class ForEmpty {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10;) {
            System.out.println(i++);
        }
        i = 1;
        for (; i < 10;) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        int j;
        int sum = 0;
        for (j = 0; j < 10; sum += j)
            ;
        System.out.println("Sum = " + sum);
    }
}
