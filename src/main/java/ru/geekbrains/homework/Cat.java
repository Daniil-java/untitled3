package ru.geekbrains.homework;

public class Cat implements Participant{
    private String name;
    private String type = "Кот";
    private boolean onDistance = true;

    private int distance = 200;
    private int height = 2;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (this.distance >= distance && onDistance == true) {
            System.out.println(type + " " + name + " смог пробежать дистанцию");
        } else if (onDistance == true){
            System.out.println(type + " " + name + " не смог пробежать дистанцию");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (this.height >= height && onDistance == true) {
            System.out.println(type + " " + name + " смог перепрыгнуть через препятсвие");
        } else if (onDistance == true){
            System.out.println(type + " " + name + " не смог перепрыгнуть через препятсвие");
            onDistance = false;
        }
    }
}
