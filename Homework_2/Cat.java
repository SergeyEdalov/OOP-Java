package Homeworks.Homework_2;

public class Cat implements Move {

    protected String name;
    protected Integer maxDistance;
    protected Integer maxJump;

    public Cat(String name, Integer maxDistance, Integer maxJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "maxDistance=" + maxDistance +
                ", maxJump=" + maxJump +
                '}';
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= maxDistance) {
            System.out.println(name + " пробежал дорожку");
        } else System.out.println(name + " не пробежал дорожку");
    }

    @Override
    public void jump(int jump) {
        if (jump <= maxJump) {
            System.out.println(name + " перепрыгнул стену");
        } else System.out.println(name + " не перепрыгнул стену");
    }
}
