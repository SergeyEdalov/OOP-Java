package Homeworks.Homework_3;


public class Answer {
    private Integer bull;
    private Integer cow;
    private static int numTry;

    public Answer(Integer bull, Integer cow, int numTry) {
        this.bull = bull;
        this.cow = cow;
        this.numTry = numTry;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "bull=" + bull +
                ", cow=" + cow +
                ", numTry=" + numTry +
                '}';
    }
}
