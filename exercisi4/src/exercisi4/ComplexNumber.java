package exercisi4;

public class ComplexNumber {

    public static final ComplexNumber ZERO = new ComplexNumber(0.0, 0.0);

    private double real;
    private double imaginary;

    public ComplexNumber(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public Double getReal() {

        return this.real;
    }

    public Double getImaginary() {
        return this.imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber resultat = new ComplexNumber(this.real + c.getReal(), this.imaginary + c.getImaginary());

        return resultat;
    }

    public ComplexNumber rest(ComplexNumber c) {
        ComplexNumber resultat = new ComplexNumber(this.real - c.getReal(), this.imaginary - c.getImaginary());

        return resultat;
    }

    public ComplexNumber multiply(ComplexNumber c) {
        ComplexNumber resultat = new ComplexNumber(this.real * c.getReal(), this.imaginary * c.getImaginary());

        return resultat;
    }

    public String toString() {

        String resultat = this.real + " ";
        if (this.imaginary >= 0.0) {
            resultat += "+" + this.imaginary + "i";
        } else {
            resultat += this.imaginary + "i";
        }
        return resultat;
    }

}
