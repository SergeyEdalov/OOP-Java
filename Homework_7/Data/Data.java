package Homeworks.Homework_7.Data;

import java.util.Scanner;

public class Data {
    private final String userFirstCount;
    private final String userSecondtCount;
    private String action;

    /**
     * @apiNote Метод получения данных от пользователя (2-х чисел и действия)
     */
    public Data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое комплексное число: ");
        this.userFirstCount = scanner.next();
        do {
            System.out.println("Введите действие: ");
            this.action = scanner.next();
            if (!action.equals("+") && !action.equals("/") && !action.equals("*")) {
                System.out.println("Такого действия нет в калькуляторе");
            }
        } while (!action.equals("+") && !action.equals("/") && !action.equals("*"));
        System.out.println("Введите второе комплексное число: ");
        this.userSecondtCount = scanner.next();
//        scanner.close();
    }

    public String getUserFirstCount() {
        return userFirstCount;
    }

    public String getAction() {
        return action;
    }

    public String getUserSecondtCount() {
        return userSecondtCount;
    }
}

