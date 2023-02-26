import java.util.Scanner;

public class KeyBoardUnput {
    public static void main(String args[])
            throws java.io.IOException {
        // char ch;
        // System.out.print("input symbol ant ther click ENTER: ");
        // ch = (char) System.in.read();
        // System.out.println("You clicked: " + ch);

        // keyboard input
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.print("Enter your age: ");
        int age = console.nextInt();
        System.out.print("Name: " + name + " , " + " Age: " + age);

    }

}
