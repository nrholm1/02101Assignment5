package Opgave3;

import java.util.*;

public class Mandelbrot {
    final int MAX = 50;
    final int gridSize = 512;
    Vector2 center = new Vector2(0,0);
    double sideLength = 0;

    public double getCenterX() {
        return center.getX();
    }
    public double getCenterY() {
        return center.getY();
    }
    public double getSideLength() {
        return sideLength;
    }

    public void setCenterX(double _x) {
        center.setX(_x);
    }
    public void setCenterY(double _y) {
        center.setY(_y);
    }
    public void setSideLength(double _sideLength) {
        sideLength = _sideLength;
    }


    public int iterate(Complex z0) {
        Complex z = new Complex(z0);

        for(int i = 0; i < MAX; i++) {
            if (z.abs() > 2.0)
                return i;
            z = z.times(z).plus(z0);
        }

        return MAX;
    }


    public double[] promptDoubles(String msg) {
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

    public void setViewParams(double[] doubles) {
        setCenterX(doubles[0]);
        setCenterY(doubles[1]);
        setSideLength(doubles[2]);
    }

    public Complex calculateGridCoords(int row, int col) {
        double _re = getCenterX() - getSideLength()/2
                + (getSideLength() * row)/(gridSize - 1);
        double _im = getCenterY() - getSideLength()/2
                + (getSideLength() * col)/(gridSize - 1);
        return new Complex(_re, _im);
    }

    public boolean isInMandelbrot(Complex z) {
        return iterate(z) == MAX;
    }

    public int getGridSize() {
        return gridSize;
    }
}

// x0 - sideLength/2 + (sideLength * row)/(gridSize - 1)
// y0 - sideLength/2 + (sideLength * col)/(gridSize - 1) i