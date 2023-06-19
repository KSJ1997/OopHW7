package src.calculator;

import src.calculator.complex.ComplexNumber;
import src.calculator.complex.IComplexNumberFactory;
import src.calculator.logging.ILogger;

public class ComplexCalculator {
    private final ILogger logger;
    private final IComplexNumberFactory complexNumberFactory;

    public ComplexCalculator(ILogger logger, IComplexNumberFactory complexNumberFactory) {
        this.logger = logger;
        this.complexNumberFactory = complexNumberFactory;
    }

    public void performCalculations() {
        ComplexNumber num1 = complexNumberFactory.createComplexNumber(2, 3);
        ComplexNumber num2 = complexNumberFactory.createComplexNumber(4, 5);

        ComplexNumber sum = num1.add(num2);
        logger.log("Сумма: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexNumber product = num1.multiply(num2);
        logger.log("Произведение: " + product.getReal() + " + " + product.getImaginary() + "i");

        ComplexNumber quotient = num1.divide(num2);
        logger.log("Частное: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
    }
}
