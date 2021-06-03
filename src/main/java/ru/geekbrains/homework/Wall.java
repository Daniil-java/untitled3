package ru.geekbrains.homework;

public class Wall implements Obstacle{
    private int height = 1;

    @Override
    public void doIt(Participant participant) {
        participant.jump(this.height);
    }
}
