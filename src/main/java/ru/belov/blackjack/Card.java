/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

/**
 *
 * @author Xiaomi
 */
public enum Card {
    SIX(6, Nuclide.NA),
    SEVEN(7, Nuclide.TI),
    EIGHT(8, Nuclide.MN),
    NINE(9, Nuclide.CO),
    TEN(10, Nuclide.ZN),
    JACK(2, Nuclide.Y),
    QUEEN(3, Nuclide.CD),
    KING(4, Nuclide.SN),
    ACE(11, Nuclide.BA);
    
    private final int cardValue;
    private Nuclide nuclide;
    private Card(int cardValue, Nuclide nuclide) {
        this.cardValue = cardValue;
        this.nuclide = nuclide;
    }
    public void setNuclide(Nuclide nuclide) {
        this.nuclide = nuclide;
    }
    public Nuclide getNuclide() {
        return this.nuclide;
    }
    public int getCardValue() {
        return this.cardValue;
    }
}
