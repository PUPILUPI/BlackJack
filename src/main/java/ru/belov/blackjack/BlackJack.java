/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.belov.blackjack;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Xiaomi
 */
public class BlackJack {

    public static void main(String[] args) {
        StartScreen screen = new StartScreen();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - screen.getWidth()) / 2;
        int y = (screenSize.height - screen.getHeight()) / 2;
        screen.setLocation(x, y);
        screen.setVisible(true);
    }
}
