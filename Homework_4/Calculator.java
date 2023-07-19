package Homeworks.Homework_4;

import java.util.*;

public class Calculator<X extends Number, Y> {


    /**
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     * @apiNote Написать класс калькулятор, принимающий List целочисленных значений,
     * возвращающий сумму элементов коллекции (метод sum)
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    /**
     * @param numbers массив чисел
     * @return произведение всех элементов массива
     * @apiNote метод умножения элементов коллекции (метод multiplication)
     */
    public Double multiplication(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    /**
     * @param number  - Делимое число
     * @param divider - Делитель
     * @return - результат деления
     * @apiNote метод деления двух чисел (метод division)
     */
    public Double division(X number, X divider) {
        Double res;
        res = number.doubleValue() / divider.doubleValue();
        return res;
    }

    /**
     * @param numbers - коллекция чисел
     * @param divider - делитель
     * @return - коллекцию разделенных чисел
     * @apiNote метод деления коллекции на число (метод divisionList)
     */
    public List<Double> divisionList(List<? extends Number> numbers, X divider) {
        List<Double> divisionList = new ArrayList<>();
        for (Number number : numbers) {
            divisionList.add((double) Math.round(number.doubleValue() / divider.doubleValue() * 100) / 100);
        }
        return divisionList;
    }

    /**
     * @param number - вводимое число
     * @return - число в двоичной системе
     * @apiNote метод бинарного перевода (метод binaryTranslate). Также реализовано число с точкой
     */
    public String binaryTranslate(Y number) {
            String binaryList = number.toString();
        int count;
        if (binaryList.contains(".")) {
            String[] arrayBinaryNum =  binaryList.split("\\.");
            List<String> listBinaryNum = new ArrayList<>();
            for (int i = 0; i < arrayBinaryNum.length; i++) {
                count = Integer.parseInt(arrayBinaryNum[i]);
                listBinaryNum.add(Integer.toBinaryString(count));
            }
            String stringNum = String.join(".", listBinaryNum);
            return stringNum;
        }
       else {
            count = Integer.parseInt(binaryList);
            return Integer.toBinaryString(count);
        }
    }
}