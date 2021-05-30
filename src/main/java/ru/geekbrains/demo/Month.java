package ru.geekbrains.demo;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULE(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int index;
    private int index2;

    public int getIndex2() {
        return index2;
    }

    public int getIndex() {
        return index;
    }

    Month(int index) {
        this.index = index;
    }
}
