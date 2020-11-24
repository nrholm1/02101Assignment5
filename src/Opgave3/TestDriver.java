package Opgave3;

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
        double[] doubles = {0.10259, 0.641, 0.0086};
        mb.setViewParams(doubles);

        setStdDrawSettings(mb.getCenterX(),
                            mb.getCenterY(),
                            mb.getSideLength());

        StdDraw.show(1);
        drawFractal();
        StdDraw.show();
    }

    static void drawFractal() {
        Complex z = null;
        for(int i = 0; i < mb.getGridSize(); i++) {
            for(int j = 0; j < mb.getGridSize(); j++) {
                z = mb.calculateGridCoords(i, j);
                if(mb.isInMandelbrot(z))
                    StdDraw.point(z.getRe(), z.getIm());
            }
        }
    }

    static void setStdDrawSettings(double _x, double _y, double sideLength) {
        StdDraw.setXscale(_x - sideLength, _x + sideLength);
        StdDraw.setYscale(_y - sideLength, _y + sideLength);
        StdDraw.setPenRadius(1.0/450);
        StdDraw.setPenColor(StdDraw.RED);
    }
}

// x0 - sideLength/2 + (sideLength * row)/(gridSize - 1)
// y0 - sideLength/2 + (sideLength * col)/(gridSize - 1) i
