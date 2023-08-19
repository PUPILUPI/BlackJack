/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Xiaomi
 */
public class Deck {

    private List<CardWithSuit> cards = new ArrayList<>();

    public Deck() {
        initDeck();
    }

    private void initDeck() {
        var cardsWithoutSuit = Card.values();
        cards.addAll(makeCardsBySuit("♠️", cardsWithoutSuit));//пики
        cards.addAll(makeCardsBySuit("♥️️", cardsWithoutSuit));//черви
        cards.addAll(makeCardsBySuit("♦️", cardsWithoutSuit));//бубны
        cards.addAll(makeCardsBySuit("♣️", cardsWithoutSuit));//трефы
        Collections.shuffle(cards);
    }

    public static ImageIcon generatePlayingCardImageIcon(String cardValue, String cardSuit) {
        int width = 48;
        int height = 80;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();

        // Задаем белый фон
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);

        // Задаем черный цвет для границы карты
        graphics.setColor(Color.BLACK);
        graphics.drawRect(6, 6, 36, 68);

        // Загружаем шрифт для отображения текста на карте
        Font font = new Font("Arial", Font.PLAIN, 25);
        graphics.setFont(font);

        // Отображаем достоинство и масть карты
        if (cardSuit.equals("♠️") || cardSuit.equals("♣️")) {
            graphics.setColor(Color.BLACK);
        } else {
            graphics.setColor(Color.RED);
        }
        graphics.drawString(cardValue, 12, 35);
        graphics.drawString(cardSuit, 12, 55);
        graphics.dispose();

        return new ImageIcon(image);
    }

    public List<CardWithSuit> makeCardsBySuit(String suit, Card[] cards) {
        List<CardWithSuit> cardsWithSuits = new ArrayList<>();
        cardsWithSuits.add(new CardWithSuit(cards[0], generatePlayingCardImageIcon("6", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[1], generatePlayingCardImageIcon("7", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[2], generatePlayingCardImageIcon("8", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[3], generatePlayingCardImageIcon("9", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[4], generatePlayingCardImageIcon("10", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[5], generatePlayingCardImageIcon("J", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[6], generatePlayingCardImageIcon("Q", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[7], generatePlayingCardImageIcon("K", suit)));
        cardsWithSuits.add(new CardWithSuit(cards[8], generatePlayingCardImageIcon("А", suit)));
        return cardsWithSuits;
    }

    public List<CardWithSuit> getCards() {
        return cards;
    }
}
