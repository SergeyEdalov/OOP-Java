package Homeworks.Homework_7;

public abstract class Calculator<T extends Number> implements Calculate {


    private T firstCount;
    private String action;
    private T secondCount;
    private T result;

    public Calculator(T firstCount, String action, T secondCount, T result) {
        this.firstCount = firstCount;
        this.action = action;
        this.secondCount = secondCount;
        this.result = result;
    }
    public T getFirstCount() {
        return firstCount;
    }

    public T getSecondCount() {
        return secondCount;
    }
    public T getResult() {
        return result;
    }

    @Override
    public abstract Object sum(Object x, Object y);

    @Override
    public abstract Object multiplicate(Object x, Object y);

    @Override
    public abstract Object divide(Object x, Object y);



//    @Override
//    public T sum(T x, T y) {
//        if (x.instanseof(ComplexCount) && y instanseof ComplexCount){
//            resRealPart = x.getrealPart + y.getRealPart;
//            resImaginaryPart = x.getImaginaryPart + y.getImaginaryPart;
//
//        }
//        return resRealPart + " + " resImaginaryPart;
//            else return x + y;
//        return null;
//    }

    // То же самое, что и сложение

// Почитать про деление комплексных чисел


}
