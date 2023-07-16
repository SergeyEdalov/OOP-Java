package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Log implements Logging {
    Date date;
    String value;
    Answer answer;
    int currentTry;

    public Log(Date date, String value, int currentTry, Answer answer) {
        this.date = date;
        this.value = value;
        this.currentTry = currentTry;
        this.answer = answer;
    }

    /**
     * @param log - запись действий игрока
     * @apiNote Добавление записи в журнал
     */
    @Override
    public void add(Log log) {
        List<Log> logs = new ArrayList<>();
        logs.add(log);
    }
}
