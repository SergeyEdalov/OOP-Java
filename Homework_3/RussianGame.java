package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.List;

public class RussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'а'; i <= 'я'; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}
