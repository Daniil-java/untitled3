package ru.geekbrains.demo;

public class Bicycle implements Transport {
    @Override
    public void ride(String name) {
        System.out.println("Велосипед поехал под управлением " + name);
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}
