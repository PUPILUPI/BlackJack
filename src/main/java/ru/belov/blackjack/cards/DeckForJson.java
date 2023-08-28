/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.cards;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Xiaomi
 */
public class DeckForJson {

    private final Date creationDate;
    private List<CardForJson> list = new ArrayList<>();

    public List<CardForJson> getList() {
        return list;
    }

    public void setList(List<CardForJson> list) {
        this.list = list;
    }

    public DeckForJson() {
        this.creationDate = new Date();
        list.add(new CardForJson(Card.SIX, Card.SIX.getNuclide()));
        list.add(new CardForJson(Card.SEVEN, Card.SEVEN.getNuclide()));
        list.add(new CardForJson(Card.EIGHT, Card.EIGHT.getNuclide()));
        list.add(new CardForJson(Card.NINE, Card.NINE.getNuclide()));
        list.add(new CardForJson(Card.TEN, Card.TEN.getNuclide()));
        list.add(new CardForJson(Card.JACK, Card.JACK.getNuclide()));
        list.add(new CardForJson(Card.QUEEN, Card.QUEEN.getNuclide()));
        list.add(new CardForJson(Card.KING, Card.KING.getNuclide()));
        list.add(new CardForJson(Card.ACE, Card.ACE.getNuclide()));
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
