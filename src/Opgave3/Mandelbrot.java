package Opgave3;

import java.util.*;

public class Mandelbrot {
    static final int MAX = 20;
    static Vector2 center = new Vector2(0,0);
    static double sideLength = 0;

    public static double getCenterX() {
        return center.getX();
    }
    public static double getCenterY() {
        return center.getY();
    }
    public static double getSideLength() {
        return sideLength;
    }

    public static void setCenterX(double _x) {
        center.setX(_x);
    }
    public static void setCenterY(double _y) {
        center.setY(_y);
    }
    public static void setSideLength(double _sideLength) {
        sideLength = _sideLength;
    }


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

    public static void setViewParams(double[] doubles) {
        setCenterX(doubles[0]);
        setCenterY(doubles[1]);
        setSideLength(doubles[2]);
    }
}