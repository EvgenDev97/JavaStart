public class HelpTwo {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        do {
            System.out.println("Reference:");
            System.out.println("1 - if");
            System.out.println("2 - switch");
            System.out.println("3 - for");
            System.out.println("4 - while");
            System.out.println("5 - do-while \n");
            System.out.print("select: ");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("Operator if: \n");
                System.out.println("if (condition) operator");
                System.out.println("else operator \n");
                break;
            case '2':
                System.out.println("Operator switch: \n");
                System.out.println("switch (expression)" + "{");
                System.out.println("case const:");
                System.out.println("operator sequence");
                System.out.println("break");
                System.out.println("}\n");
                break;
            case '3':
                System.out.println("Operator for:\n");
                System.out.print("for(initialization; condition; iteration)");
                System.out.println(" Operator\n");
                break;
            case '4':
                System.out.println("Operator while: \n");
                System.out.println("While(condition) operator \n");
                break;
            case '5':
                System.out.println("Operator do-while \n");
                System.out.println("do {");
                System.out.println(" operator");
                System.out.println("}while (condition)\n");
        }
    }
}