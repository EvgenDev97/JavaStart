package DataType;

public class Boolean {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (b) {
            System.out.println("It`s working");
        }

        b = false;
        if (b) {
            System.out.println("it`s don`t working");
        }
        System.out.println("10 > 9 = " + (10 > 9));
    }
}
