package ru.geekbrains;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Action implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(1);
    }
}
