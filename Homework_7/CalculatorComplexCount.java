package Homeworks.Homework_7;

public class CalculatorComplexCount extends Calculator{

    ComplexCount complexCount;
    public CalculatorComplexCount(Number firstCount, String action, Number secondCount, Number result) {
        super(firstCount, action, secondCount, result);
    }

    @Override
    public Object sum(Object x, Object y) {
        complexCount.getRealPart();

        return null;
    }

    @Override
    public Object multiplicate(Object x, Object y) {
        return null;
    }

    @Override
    public Object divide(Object x, Object y) {
        return null;
    }
}
