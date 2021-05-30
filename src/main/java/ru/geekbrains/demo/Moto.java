package ru.geekbrains.demo;

public class Moto implements Transport {
    @Override
    public void ride(String name) {
        System.out.println("Мотоцикл поехал под управлением " + name);
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл остановился");
    }
}
