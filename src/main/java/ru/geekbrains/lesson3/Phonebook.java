package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private static HashMap<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public static void add(String name, String number) {
        number = number + " ";   //Чтобы был пробел, между номерами для контактов с одинаковыми номерами
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, number);
            System.out.println("Контакт добавлен");
        } else {
            phonebook.put(name, phonebook.get(name) + number);
        }
    }

    public static void get(String name) {
        if (phonebook.containsKey(name)) {
            System.out.println("[" + name + "] : [" + phonebook.get(name) + "]");
        } else {
            System.out.println("Контакта с таким именем не существует.");
        }

    }
}
