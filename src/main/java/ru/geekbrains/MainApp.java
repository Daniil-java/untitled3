package ru.geekbrains;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        JButton button1 = new JButton("1");
        button1.addActionListener(new Button1Action());

        JButton button2 = new JButton("2");
        button2.addActionListener(new Button2Action());

        JButton button3 = new JButton("3");
        button3.addActionListener(new Button3Action());

        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
//        button4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(4);
//            }
//        });

        // public class MainApp$1 implements ActionListener {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println(4);
        //     }
        // }
        // button4.addActionListener(new MainApp$1());

    }
}
