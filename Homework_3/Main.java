package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame game = new NumberGame();
        List<Log> logList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        game = game.setTypeGame(game.getTypeGame(GameStatus.INIT));
        System.out.println("Введите максимально количество символов и количество попыток");
        game.start(scanner.nextInt(), scanner.nextInt());

        while (!game.getGameStatus().equals(GameStatus.FINISH)) {
            Date date = new Date();
            String value = scanner.nextLine();
            Answer answer = game.inputValue(value);
            Log log = new Log(date, value, game.currentTry, answer);
            logList.add(log);
            if (answer != null) {
                System.out.println("answer = " + answer);
            }
            game.restart();
        }
        for (Log log : logList) {
            System.out.println("Log{" +
                    "date=" + log.date +
                    ", value='" + log.value + '\'' +
                    ", answer=" + log.answer +
                    ", currentTry=" + log.currentTry +
                    '}');
        }
        System.out.println("=============");
    }
}
