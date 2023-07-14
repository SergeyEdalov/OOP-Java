package Homeworks.Homework_2;

public class Robot implements Move {
    protected String name;
    protected Integer maxDistance;
    protected Integer maxJump;

    public Robot(String name, Integer maxDistance, Integer maxJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= maxDistance) {
            System.out.println(name + " пробежал дорожку");
        } else System.out.println(name + " не пробежал дорожку"); return;
    }

    @Override
    public void jump(int jump) {
        if (jump <= maxJump) {
            System.out.println(name + " перепрыгнул стену");
        } else System.out.println(name + " не перепрыгнул стену"); return;
    }
}
