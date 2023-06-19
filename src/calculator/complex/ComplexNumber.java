package src.calculator.complex;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double realQuotient = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
        double imaginaryQuotient = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }

    public ComplexNumber conjugate() {
        return null;
    }
}
