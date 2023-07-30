package Homeworks.Homework_7.View;

import Homeworks.Homework_7.Count.ComplexCount;

public class View {

    public void printResult(ComplexCount complexCount) {
        if (complexCount.getImaginaryPart() > 0) {
            System.out.println("Result = " + complexCount.getRealPart() + " + " + complexCount.getImaginaryPart() + "i");
        } else if (complexCount.getImaginaryPart() < 0) {
            System.out.println("Result = " + complexCount.getRealPart() + "" + complexCount.getImaginaryPart() + "i");
        }
    }
}
