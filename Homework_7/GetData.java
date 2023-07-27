package Homeworks.Homework_7;

import java.util.Scanner;

// Получаем числа от пользователя
public class GetData {
    private final String userData;
    private final String action;

    public GetData(String userData, String action) {
        System.out.println("Введите комплексное число: ");
        Scanner scanner = new Scanner(System.in);
        userData = scanner.next();
        this.userData = userData;
        action = scanner.next();
        this.action = action;
    }

    public String getUserData() {
        return userData;
    }

    public String getAction() {
        return action;
    }
}
