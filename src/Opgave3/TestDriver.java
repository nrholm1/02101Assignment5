package Opgave3;

import java.awt.*;
import java.io.FileNotFoundException;

public class TestDriver {
    static Mandelbrot mb = new Mandelbrot();
    public static void main(String args[]) throws FileNotFoundException {
//        double[] doubles = mb.promptDoubles("Enter 3 numbers: ");
        double[] doubles = {0.10684, -0.63675, 0.0085};
        mb.setViewParams(doubles);

        ColorPicker randomColorProfile = new ColorPicker();

        int[][] colorGrid = ColorParser.parseFile("blues");

        ColorPicker colorProfile = new ColorPicker(colorGrid);
        setStdDrawSettings(mb.getCenterX(),
                            mb.getCenterY(),
                            mb.getSideLength());

        StdDraw.show(1);
//        drawFractal(randomColorProfile);
        drawFractal(colorProfile);
        StdDraw.show();
    }

    static void drawFractal(ColorPicker colors) {
        Complex z = null;
        for(int i = 0; i < mb.getGridSize(); i++) {
            for(int j = 0; j < mb.getGridSize(); j++) {
                z = mb.calculateGridCoords(i, j);
                z.setIterationValue(mb.iterate(z));

                StdDraw.setPenColor(colors.map.get(z.getIterationValue()));

                StdDraw.point(z.getRe(), z.getIm());
            }
        }
    }

    static void setStdDrawSettings(double _x, double _y, double sideLength) {
        StdDraw.setXscale(_x - sideLength / 2, _x + sideLength / 2);
        StdDraw.setYscale(_y - sideLength / 2, _y + sideLength / 2);
        StdDraw.setPenRadius(1.0/450);
    }
}

