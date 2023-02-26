package JavaStart;

public class GalonsTwo {
    public static void main(String args[]) {
        double galons, litters;
        int counter;
        counter = 0;
        for (galons = 1; galons <= 100; galons++) {
            litters = galons * 3.7854;
            System.out.println(galons + " = " + litters);
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }

    }
}
