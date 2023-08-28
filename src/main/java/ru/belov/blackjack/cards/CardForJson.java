/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.cards;

import java.util.Date;

/**
 *
 * @author Xiaomi
 */
public class CardForJson {

    private final Card card;
    private Nuclide nuclide;

    public void setNuclide(Nuclide nuclide) {
        this.nuclide = nuclide;
    }

    public Card getCard() {
        return card;
    }

    public Nuclide getNuclide() {
        return nuclide;
    }

    public CardForJson(Card card, Nuclide nuclide) {
        this.card = card;
        this.nuclide = nuclide;
    }
}
