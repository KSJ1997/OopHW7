package src.calculator.complex;

public class ComplexNumberFactory implements IComplexNumberFactory {
    @Override
    public ComplexNumber createComplexNumber(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}
