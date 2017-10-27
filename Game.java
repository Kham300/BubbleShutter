package com.company;

import javax.swing.*;

public class Game {

    public static void main(String[] args) {
        JFrame window = new JFrame("BubbleShutter");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.getContentPane().add(new GamePanel());

        window.pack();
        window.setVisible(true);

    }
}
