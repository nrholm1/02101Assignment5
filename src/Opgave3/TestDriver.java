package Opgave3;

import java.awt.*;

public class TestDriver {
    static Mandelbrot mb = new Mandelbrot();
    public static void main(String args[]) {
        // Complex z1 = new Complex(2,2);
        // Complex z2 = new Complex(5,4);

        // System.out.println(z1);
        // System.out.println(z2);

        // Complex sum = z1.plus(z2);
        // Complex product = z1.times(z2);

        // System.out.println("sum = " + sum);
        // System.out.println("product = " + product);

//        double[] doubles = mb.promptDoubles("Enter 3 numbers: ");
        double[] doubles = {-0.5, 0, 2};
        mb.setViewParams(doubles);

        ColorPicker randomColorProfile = new ColorPicker();
        setStdDrawSettings(mb.getCenterX(),
                            mb.getCenterY(),
                            mb.getSideLength());

        StdDraw.show(1);
        drawFractal(randomColorProfile);
        StdDraw.show();
    }

    static void drawFractal(ColorPicker colors) {
        Complex z = null;
        for(int i = 0; i < mb.getGridSize(); i++) {
            for(int j = 0; j < mb.getGridSize(); j++) {
                z = mb.calculateGridCoords(i, j);
                z.setIterationValue(mb.iterate(z));

                if(!mb.isInMandelbrot(z)) {
                    StdDraw.setPenColor(colors.map.get(z.getIterationValue()));
                } else {
                    StdDraw.setPenColor(Color.red);
                }

                StdDraw.point(z.getRe(), z.getIm());
            }
        }
    }

    static void setStdDrawSettings(double _x, double _y, double sideLength) {
        StdDraw.setXscale(_x - sideLength, _x + sideLength);
        StdDraw.setYscale(_y - sideLength, _y + sideLength);
        StdDraw.setPenRadius(1.0/450);
    }
}

