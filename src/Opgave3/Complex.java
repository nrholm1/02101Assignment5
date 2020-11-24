package Opgave3;

public class Complex {
    private double re;
    private double im;

    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    public double abs() {
        return Math.pow((re*re + im*im), 1.0/2);
    }

    public Complex plus(Complex other) {
        return new Complex(this.getRe() + other.getRe(),
                this.getIm() + other.getIm());
    }

    public Complex times(Complex other) {
        return new Complex((this.getRe() * other.getRe()) - (this.getIm() * other.getIm()),
                (this.getIm() * other.getRe()) + (this.getRe() * other.getIm()));
    }

    public String toString() {
        return "" + this.getRe() + " + " + this.getIm() + "i";
    }

    public Complex() {
        re = 0;
        im = 0;
    }

    public Complex(double _re, double _im) {
        re = _re;
        im = _im;
    }

    public Complex(Complex z) {
        re = z.getRe();
        im = z.getIm();
    }
}