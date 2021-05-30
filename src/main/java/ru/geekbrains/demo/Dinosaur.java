package ru.geekbrains.demo;

public class Dinosaur implements ObjComparable {
    private int weight;

    public Dinosaur(int weight) {
        this.weight = weight;
    }

    @Override
    public int compare(Object o) {
        Dinosaur another = (Dinosaur) o;
        if (this.weight > another.weight) {
            return 1;
        } else if (this.weight == another.weight) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Dinosaur [" + weight + "]";
    }
}
