package Homeworks.Homework_7.Calculator;

import Homeworks.Homework_7.Count.Count;
import Homeworks.Homework_7.Log.Log;

import java.util.List;

public abstract class Calculator<T extends Count> implements Calculate {

    T firstCount;
    String action;
    T secondCount;
    T result;

    public Calculator(T firstCount, String action, T secondCount) {
        this.firstCount = firstCount;
        this.action = action;
        this.secondCount = secondCount;
    }

    public T getFirstCount() {
        return firstCount;
    }

    public String getAction() {
        return action;
    }

    public T getSecondCount() {
        return secondCount;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public abstract void sum(Object x, Object y);

    @Override
    public abstract void multiplication(Object x, Object y);

    @Override
    public abstract void divide(Object x, Object y);


    public void read(List<Log> logs) {
        for (Log log : logs) {
            System.out.println("Журнал" + log.toString());
        }
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstCount=" + firstCount +
                ", action='" + action + '\'' +
                ", secondCount=" + secondCount +
                ", result=" + result +
                '}';
    }
}


