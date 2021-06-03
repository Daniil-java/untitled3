package ru.geekbrains.homework;

import ru.geekbrains.demo.Box;

public class Cross implements Obstacle{
    private int distance = 200;

    @Override
    public void doIt(Participant participant) {
        participant.run(this.distance);
    }
}
