package ru.geekbrains.demo;

public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет1");
    }

    public void eat212() {
        int abc = 10;
        abc++;
        System.out.println(abc);
    }
}
