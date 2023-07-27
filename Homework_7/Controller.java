package Homeworks.Homework_7;

public class Controller {
    Calculator calculator;

    GetData getData;

    TypeCalculator typeCalculator = TypeCalculator.START;

    private void work(Calculator calculator, GetData getData) {

        while (typeCalculator !=TypeCalculator.FINISH) {
            switch (getData.getAction()) {
                case ("+"): calculator.sum(calculator.getFirstCount(), calculator.getSecondCount());
                case ("*"): calculator.multiplicate(calculator.getFirstCount(), calculator.getSecondCount());
                case ("/"): calculator.divide(calculator.getFirstCount(), calculator.getSecondCount());
                default:
                    System.out.println("Такого действия в калькуляторе нет");
            }

        }
    }
}
