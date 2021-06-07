package ru.geekbrains.lesson3;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        //------Задание 1
        String[] words = {"Copper", "Tin", "Sodium", "Lead", "Zinc", "Potassium", "Hydroxyl", "HEDP", "ATMP", "Nickel", "Tin", "Copper", "Tin", "Zinc"};
        sortArrayForWords(words);

        //------Задание 2
        Phonebook phonebook = new Phonebook();
        phonebook.add("Jordan", "+7999999999");
        phonebook.add("Jordan", "+7888888888");
        phonebook.add("Nick", "+7856978953");
        phonebook.add("Alex", "+7568989856");
        phonebook.get("Jordan");
        phonebook.get("Alex");
    }



    public static void sortArrayForWords(String[] words) {
        ArrayList<String> wordsArray = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            wordsArray.add(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            while (wordsArray.remove(words[i])) {
                count++;
            }
            if(count != 0) {
                System.out.println("Количество слов " + words[i] + " : " + count);
            }
        }
    }

}
