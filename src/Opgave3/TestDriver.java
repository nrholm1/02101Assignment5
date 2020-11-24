package Opgave3;

import java.awt.*;
import java.io.FileNotFoundException;

public class TestDriver {
    static Mandelbrot mb = new Mandelbrot();
    public static void main(String args[]) throws FileNotFoundException {
        Driver.configure("mandel");
        Driver.drawWrapper();
    }
}

