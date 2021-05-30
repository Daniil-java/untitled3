package ru.geekbrains.demo;

public class DemoApp {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car(),
                new Moto(),
                new Bicycle(),
                new Skateboard()
        };
        Human human = new Human("Bob");

        human.ride(transports[3]);
        human.ride(transports[3]);
        human.ride(transports[1]);
        human.stop();
        human.stop();
        human.ride(transports[2]);
        human.ride(transports[2]);
        human.ride(transports[2]);
        human.stop();
        human.ride(transports[0]);
        human.stop();
    }
}
