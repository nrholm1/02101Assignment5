package Opgave3;

public class Complex {
    private double re;
    private double im;
    private int iterationValue;

    public double getRe() {
        return this.re;
    }
    public double getIm() {
        return this.im;
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

    public void setIterationValue(int _val) {
        this.iterationValue = _val;
    }
    public int getIterationValue() {
        return this.iterationValue;
    }

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double _re, double _im) {
        this.re = _re;
        this.im = _im;
    }

    public Complex(Complex z) {
        this.re = z.getRe();
        this.im = z.getIm();
    }
}