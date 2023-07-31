package Homeworks.Homework_7.Log;


import Homeworks.Homework_7.Calculator.Calculator;
import Homeworks.Homework_7.Calculator.TypeCalculator;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Log implements Logging {
    int id;
    Date date;
    Calculator calculator;
    TypeCalculator typeCalculator;


    public Log(int id, Date date, Calculator calculator) {
        this.id = id;
        this.date = date;
        this.calculator = calculator;
    }

    /**
     * @apiNote - Метод добавления записи в журнал
     * @param log - запись
     */
    @Override
    public void add(Log log) {
        while (typeCalculator != TypeCalculator.FINISH) {
            id = 1;
            List<Log> logs = new ArrayList<>();
            logs.add(log);
            id++;
        }
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", date=" + date +
                ", calculator=" + calculator.toString() +
                '}';
    }
}
