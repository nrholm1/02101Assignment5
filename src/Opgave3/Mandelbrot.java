package Opgave3;

import java.util.*;

public class Mandelbrot {
    static final int MAX = 20;


    public static int iterate(Complex z0) {
        Complex z = new Complex(z0);

        for(int i = 0; i < MAX; i++) {
            if (z.abs() > 2.0)
                return i;
            z = z.times(z).plus(z0);
        }

        return MAX;
    }


    public static double[] promptDoubles(String msg) {
        System.out.println(msg);
        Scanner in = new Scanner(System.in);

        ArrayList<Double> doubles = new ArrayList<Double>();

        double num;
        while (doubles.size() < 3) {
            if (in.hasNextDouble()) {
                num = in.nextDouble();
                doubles.add(num);
            }
            else {
                System.out.println("Please enter valid numbers only.");
                in.next();
            }
        }

        // return first 3 numbers entered.
        return new double[] { doubles.get(0),
                doubles.get(1),
                doubles.get(2) };
    }

    public static void printGrid() {

    }
}