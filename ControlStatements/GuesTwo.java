public class GuesTwo {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore, answer = 'S';
        do {
            System.out.println("conceived letter from A to Z");
            System.out.print("Guess the letter: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("You Won!");
            } else {
                System.out.print("");
                if (ch < answer) {
                    System.out.println("the desired letter is near the end of the alphabet ");
                } else {
                    System.out.println("the desired letter near the beginning of the alphabet ");
                }
                System.out.println("Please try Again! ");
            }
        } while (answer != ch);
    }
}
