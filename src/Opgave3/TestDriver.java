package Opgave3;

public class TestDriver {
    public static void main(String args[]) {
        // Complex z1 = new Complex(2,2);
        // Complex z2 = new Complex(5,4);

        // System.out.println(z1);
        // System.out.println(z2);

        // Complex sum = z1.plus(z2);
        // Complex product = z1.times(z2);

        // System.out.println("sum = " + sum);
        // System.out.println("product = " + product);

//        double[] doubles = Mandelbrot.promptDoubles("Enter 3 numbers: ");
        double[] doubles = {-0.5, 0, 2};
        Mandelbrot.setViewParams(doubles);

        setStdDrawSettings(Mandelbrot.getCenterX(),
                            Mandelbrot.getCenterY(),
                            Mandelbrot.getSideLength());
        StdDraw.point(Mandelbrot.getCenterX(),
                      Mandelbrot.getCenterY());

        StdDraw.point(Mandelbrot.getCenterX() + Mandelbrot.getSideLength(),
                      Mandelbrot.getCenterY() + Mandelbrot.getSideLength());
        StdDraw.point(Mandelbrot.getCenterX() + Mandelbrot.getSideLength(),
                      Mandelbrot.getCenterY() - Mandelbrot.getSideLength());
        StdDraw.point(Mandelbrot.getCenterX() - Mandelbrot.getSideLength(),
                      Mandelbrot.getCenterY() + Mandelbrot.getSideLength());
        StdDraw.point(Mandelbrot.getCenterX() - Mandelbrot.getSideLength(),
                      Mandelbrot.getCenterY() - Mandelbrot.getSideLength());

        for(var d : doubles)
            System.out.print(d + " ");
    }

    static void setStdDrawSettings(double _x, double _y, double sideLength) {
        StdDraw.setXscale(_x - sideLength, _x + sideLength);
        StdDraw.setYscale(_y - sideLength, _y + sideLength);
        StdDraw.setPenRadius(100.0/5000);
    }
}
