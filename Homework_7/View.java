package Homeworks.Homework_7;

public class View {
    Calculator calculator;

    protected void printResult(Calculator calculator) {
        System.out.println("Result = " + calculator.getResult().toString());
    }
}
