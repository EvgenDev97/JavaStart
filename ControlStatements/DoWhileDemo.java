public class DoWhileDemo {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        do {
            System.out.println("Click key and then click enter");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
