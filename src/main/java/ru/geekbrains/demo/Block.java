package ru.geekbrains.demo;

public class Block implements ObjComparable {
    private int weight;

    public Block(int weight) {
        this.weight = weight;
    }

    @Override
    public int compare(Object o) {
        Block another = (Block) o;
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
        return "Block [" + weight + "]";
    }
}
