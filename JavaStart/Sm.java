package JavaStart;

public class Sm {
    public static void main(String args[]) {
        double dm, m;
        int count;
        count = 0;
        for (dm = 1; dm <= 100; dm++) {
            m = dm * 39.37;
            String result = String.format("%.2f", m);
            System.out.println(dm + "= " + result + " m");
            count++;
            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
