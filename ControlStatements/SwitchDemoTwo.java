public class SwitchDemoTwo {
    public static void main(String args[]) {
        int i = 2, j = 1;
        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                switch (j) {
                    case 1:
                        System.out.println("2.1");
                        break;
                    case 2:
                        System.out.println("2.2");
                        break;
                }
                break;
            case 3:
                System.out.println("3");
                break;
        }
    }
}