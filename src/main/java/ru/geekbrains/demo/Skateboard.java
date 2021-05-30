package ru.geekbrains.demo;

public class Skateboard implements Transport {
    @Override
    public void ride(String name) {
        System.out.println("Скейт поехал под управлением " + name);
    }

    @Override
    public void stop() {
        System.out.println("Скейтборд остановился");
    }
}
