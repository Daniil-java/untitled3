package ru.geekbrains.demo;

public class Car implements Transport {
    @Override
    public void ride(String name) {
        System.out.println("Машина поехала под управлением " + name);
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
    }
}
