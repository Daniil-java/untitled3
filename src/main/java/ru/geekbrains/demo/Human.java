package ru.geekbrains.demo;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void ride(Transport transport) {
        if (currentTransport != null) {
            if (currentTransport == transport) {
                System.out.println(name + " уже едет на нем");
            } else {
                System.out.println(name + " не может перепрыгнуть на другой вид транспорта");
            }
            return;
        }
        transport.ride(name);
        this.currentTransport = transport;
    }

    public void stop() {
        if (currentTransport == null) {
            System.out.println(name + " ни на чем не едет");
            return;
        }
        currentTransport.stop();
        currentTransport = null;
    }
}
