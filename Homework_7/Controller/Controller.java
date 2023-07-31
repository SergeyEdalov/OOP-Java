package Homeworks.Homework_7.Controller;

import Homeworks.Homework_7.Calculator.Calculator;
import Homeworks.Homework_7.Calculator.CalculatorComplexCount;
import Homeworks.Homework_7.Calculator.TypeCalculator;
import Homeworks.Homework_7.Converter.ConverterData;
import Homeworks.Homework_7.Count.ComplexCount;
import Homeworks.Homework_7.Data.Data;
import Homeworks.Homework_7.Log.Log;
import Homeworks.Homework_7.View.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {
    Calculator calculator;
    Data data;
    Date date = new Date();
    View view = new View();
    ConverterData converterData = new ConverterData();
    TypeCalculator typeCalculator = TypeCalculator.START;

    /**
     * @apiNote Метод работы калькулятора. Собирает все классы вместе
     */
    public void work() {
        List<Log> logList = new ArrayList<>();
        while (typeCalculator != TypeCalculator.FINISH) {
            data = new Data();
            calculator = new CalculatorComplexCount(converterData.convert(data.getUserFirstCount()),
                    data.getAction(),
                    converterData.convert(data.getUserSecondtCount()));
            switch (calculator.getAction()) {
                case ("+"):
                    calculator.sum(calculator.getFirstCount(), calculator.getSecondCount());
                    break;
                case ("*"):
                    calculator.multiplication(calculator.getFirstCount(), calculator.getSecondCount());
                    break;
                case ("/"):
                    calculator.divide(calculator.getFirstCount(), calculator.getSecondCount());
                    break;
            }
            view.printResult((ComplexCount) calculator.getResult());
            Log log = new Log(1, date, calculator);
            logList.add(log);
            typeCalculator = TypeCalculator.FINISH;
        }
        calculator.read(logList);
    }
}
