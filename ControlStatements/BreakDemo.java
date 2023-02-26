public class BreakDemo {
    public static void main(String args[])
            throws java.io.IOException {

        int num;
        num = 100;
        for (int i = 0; i < num; i += 1) {
            if (i * i >= num)
                break;
            System.out.print("i = " + i + " ; ");

        }
        System.out.println();
        System.out.println("The end");
        System.out.println("\n");
        char ch;

        for (;;) {
            do {
                System.out.print("Enter the letter and ther click ENTER: ");
                ch = (char) System.in.read();
            } while (ch != 'q');
            if (ch == 'q') {
                System.out.println("You clicked q! ");
                break;
            }

        }
    }

}
