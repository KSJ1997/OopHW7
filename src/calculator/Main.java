package src.calculator;

import src.calculator.complex.ComplexNumberFactory;
import src.calculator.complex.IComplexNumberFactory;
import src.calculator.logging.FileLogger;
import src.calculator.logging.ILogger;

public class Main {
    public static void main(String[] args) {
        ILogger logger = new FileLogger("log.txt");
        IComplexNumberFactory complexNumberFactory = new ComplexNumberFactory();
        ComplexCalculator calculator = new ComplexCalculator(logger, complexNumberFactory);
        calculator.performCalculations();
    }
}
