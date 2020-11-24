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

        double[] doubles = Mandelbrot.promptDoubles("Enter 3 numbers: ");

        for(var d : doubles)
            System.out.print(d + " ");
    }
}
