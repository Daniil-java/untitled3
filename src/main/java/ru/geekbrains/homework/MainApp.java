package ru.geekbrains.homework;

public class MainApp {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Wall(), new Cross(), new Wall()
        };
        Participant[] participants = {
                new Cat("Барсик"), new Human("Шарик")
        };

        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                o.doIt(p);
            }
        }
    }
}
