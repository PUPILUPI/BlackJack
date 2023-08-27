/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.players;

import java.util.ArrayList;
import java.util.List;
import ru.belov.blackjack.cards.CardWithSuit;
import ru.belov.blackjack.cards.Game;

public abstract class Player {

    protected String name;
    protected int currentBid = 0;
    protected final int bid = 10;
    protected List<CardWithSuit> cards = new ArrayList<>();
    protected int totalPoints = 0;
    protected int balance = 100;
    public Player(String name) {
        this.name = name;
    }
    public abstract boolean takeCard(List<CardWithSuit> cards);

    public abstract boolean placeBet(Game game);

    public int checkPoints() {
        if (this.totalPoints > 21) {
            return 1;
        }
        if (this.totalPoints == 21) {
            return 2;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentBid() {
        return currentBid;
    }

    public int getBid() {
        return bid;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<CardWithSuit> getCards() {
        return cards;
    }

    public void setCards(List<CardWithSuit> cards) {
        this.cards = cards;
    }
}
