package Homeworks.Homework_2;

public class Main {
    public static void main(String[] args) {

        Let[] listLet = {new RaceTrack("race1", 20),
                new RaceTrack("race2", 40),
                new RaceTrack("race3", 80),
                new Wall("wall1", 8),
                new Wall("wall1", 2),
        };

        Object[] sprinters = {
                new Cat("Кот", 22, 13),
                new Human("Человек", 120, 6),
                new Robot("Робот", 1300, 50)
        };

        for (Let let : listLet) {
            for (Object sprinter : sprinters) {
                if (let instanceof RaceTrack) {
                    if (sprinter instanceof Cat) {
                        ((Cat) sprinter).run(let.parameter);
                    }
                    if (sprinter instanceof Human) {
                        ((Human) sprinter).run(let.parameter);
                    }
                    if (sprinter instanceof Robot) {
                        ((Robot) sprinter).run(let.parameter);
                    }
                } else {
                    if (sprinter instanceof Cat) {
                        ((Cat) sprinter).jump(let.parameter);
                    }
                    if (sprinter instanceof Human) {
                        ((Human) sprinter).jump(let.parameter);
                    }
                    if (sprinter instanceof Robot) {
                        ((Robot) sprinter).jump(let.parameter);
                    }
                }
            }
        }
    }
}
