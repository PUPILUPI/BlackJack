/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

import javax.swing.ImageIcon;

/**
 *
 * @author Xiaomi
 */
public class CardWithSuit {
    private Card card;
    private ImageIcon suit;
    public CardWithSuit(Card card, ImageIcon suit) {
        this.card = card;
        this.suit = suit;
    }

    public Card getCard() {
        return card;
    }

    public ImageIcon getSuit() {
        return suit;
    }
}
