package Homeworks.Homework_7.Calculator;


import Homeworks.Homework_7.Count.ComplexCount;

public class CalculatorComplexCount extends Calculator {

    public CalculatorComplexCount(ComplexCount firstCount, String action, ComplexCount secondCount) {
        super(firstCount, action, secondCount);

    }

    @Override
    public void sum(Object x, Object y) {
        ComplexCount x1 = (ComplexCount) x;
        ComplexCount y1 = (ComplexCount) y;

        double realResultPart = x1.getRealPart() + y1.getRealPart();
        double imaginaryResultPart = x1.getImaginaryPart() + y1.getImaginaryPart();
        setResult(new ComplexCount(realResultPart, imaginaryResultPart));
    }

    @Override
    public void multiplication(Object x, Object y) {
        ComplexCount x1 = (ComplexCount) x;
        ComplexCount y1 = (ComplexCount) y;

        double realResultPart = x1.getRealPart() * y1.getRealPart() -
                x1.getImaginaryPart() * y1.getImaginaryPart();
        double imaginaryResultPart = x1.getImaginaryPart() * y1.getRealPart() +
                x1.getRealPart() * y1.getImaginaryPart();
        setResult(new ComplexCount(realResultPart, imaginaryResultPart));
    }

    @Override
    public void divide(Object x, Object y) {
        ComplexCount x1 = (ComplexCount) x;
        ComplexCount y1 = (ComplexCount) y;

        double realResultPart = ((x1.getRealPart() * y1.getRealPart()) + (x1.getImaginaryPart() * y1.getImaginaryPart())) /
                ((y1.getRealPart() * y1.getRealPart()) + (y1.getImaginaryPart() * y1.getImaginaryPart()));

        double imaginaryResultPart = (x1.getImaginaryPart() * y1.getRealPart() - x1.getRealPart() * y1.getImaginaryPart()) /
                ((y1.getRealPart() * y1.getRealPart()) + (y1.getImaginaryPart() * y1.getImaginaryPart()));
        setResult(new ComplexCount(realResultPart, imaginaryResultPart));
    }
}
