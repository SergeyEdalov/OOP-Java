package Homeworks.Homework_7.Converter;

import Homeworks.Homework_7.Count.ComplexCount;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConverterData implements ConvertToComplexCount {

    @Override
    public ComplexCount convert(String string) {
        List<String> numbers = new ArrayList<>();
        ComplexCount complexCount;
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            numbers.add(matcher.group());
        }
        complexCount = new ComplexCount(Double.parseDouble(numbers.get(0)), Double.parseDouble(numbers.get(1)));
        return complexCount;
    }
}