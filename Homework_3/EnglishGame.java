package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.List;

public class EnglishGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}
