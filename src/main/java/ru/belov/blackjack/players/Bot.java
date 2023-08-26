/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.players;

import java.util.List;
import java.util.Random;
import ru.belov.blackjack.CardWithSuit;
import ru.belov.blackjack.Game;

/**
 *
 * @author Xiaomi
 */
public class Bot extends Player {

    public Bot(String name) {
        super(name);
    }

    @Override
    public boolean takeCard(List<CardWithSuit> deckCards) {
        Random random = new Random();
        double probability;
        if (this.totalPoints <= 11) {
            probability = 1;
        } else if (this.totalPoints < 14) {
            probability = 0.5;
        } else if (this.totalPoints < 17) {
            probability = 0.25;
        } else {
            probability = 0;
        }
        if (random.nextDouble() < probability) {
            System.out.println("очки до взятия карты: " + totalPoints);
            CardWithSuit card = deckCards.get(0);
            this.cards.add(card);
            this.totalPoints += card.getCard().getCardValue();
            deckCards.remove(0);
            System.out.println("очки после зятия карты: " + totalPoints);
            return true;
        }
        return false;
    }

    @Override
    public boolean placeBet(Game game) {
        Random random = new Random();
        double probability;
        if (this.totalPoints < 14) {
            probability = 0.25;
        } else if (this.totalPoints < 17) {
            probability = 0.5;
        } else {
            probability = 0.7;
        }
        boolean b = (this.totalPoints > 18 && this.currentBid < 30 && game.getNumberOfMoves() > 0 && this.balance > 0 && random.nextDouble() < probability);
        if (b) {
            game.setNumberOfMoves(0);
        }
        if (this.currentBid != game.getCurrentBid() || b) {
            this.balance -= this.bid;
            this.currentBid += this.bid;
            game.setBank(game.getBank() + bid);
            game.setCurrentBid(this.currentBid);
            return true;
        } else {
            return false;
        }
    }
}
