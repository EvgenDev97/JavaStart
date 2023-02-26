public class ForTest {
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.print("Click S for stop: ");
        for (i = 0; (char) System.in.read() != 'S'; i++) {

            System.in.skip(System.in.available());
            System.out.println(" i = " + i);

        }

    }
}
