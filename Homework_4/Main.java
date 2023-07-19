package Homeworks.Homework_4;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 100; i += 30) {
            doubleList.add((double) i);
            integerList.add(i);
        }
//        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
//        System.out.println("calc.sum(integerList) = " + calc.sum(integerList));

        System.out.println("calc.multiplication(doubleList) = " + calc.multiplication(doubleList));
        System.out.println("calc.multiplication(integerList) = " + calc.multiplication(integerList));

        Calculator calc2 = new Calculator();
        System.out.println("calc2.division = " + calc2.division(15, 3.5));
        System.out.println("calc2.divisionList = " + calc2.divisionList(integerList, 3.5));


        System.out.println("calc2.binaryTranslate = " + calc2.binaryTranslate(7.9));
    }
}
