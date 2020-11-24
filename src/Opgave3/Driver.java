package Opgave3;

import java.io.FileNotFoundException;

public class Driver {
    static Mandelbrot mb = new Mandelbrot();
    static ColorPicker colorProfile;

    static void drawWrapper() {
        StdDraw.show(1);
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

    static void configure() {
        double[] doubles = mb.promptDoubles("Enter 3 numbers: ");
        mb.setViewParams(doubles);

        colorProfile = new ColorPicker();

        setStdDrawSettings(mb.getCenterX(),
                mb.getCenterY(),
                mb.getSideLength());
    }

    static void configure(String fileName) throws FileNotFoundException {
//        double[] doubles = {0.10684, -0.63675, 0.0085};
        double[] doubles = {-0.5, 0, 2};
        mb.setViewParams(doubles);

        int[][] colorGrid = ColorParser.parseFile(fileName);
        colorProfile = new ColorPicker(colorGrid);

        setStdDrawSettings(mb.getCenterX(),
                mb.getCenterY(),
                mb.getSideLength());
    }


    static void setStdDrawSettings(double _x, double _y, double sideLength) {
        StdDraw.setXscale(_x - sideLength / 2, _x + sideLength / 2);
        StdDraw.setYscale(_y - sideLength / 2, _y + sideLength / 2);
        StdDraw.setPenRadius(1.0/450);
    }
}
