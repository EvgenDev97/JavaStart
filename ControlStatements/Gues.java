public class Gues {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("guess the letter from A to Z.");
        System.out.print("Enter the letter: ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("You won!");
        } else {
            System.out.print("Please try again!");
            if (ch < answer) {
                System.out.println("near the end of the alphabet");
            } else
                System.out.println("near the beginning of the alphabet");
        }

    }
}
