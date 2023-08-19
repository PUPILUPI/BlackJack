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

    @Override
    public boolean takeCard(List<CardWithSuit> deckCards) {
//        System.out.println("до взятия карты: " + this.totalPoints);
        Random random = new Random();
        double probability;
        if (this.totalPoints <= 11) {
            probability = 1;
        } else if (this.totalPoints < 14) {
            probability = 0.7;
        } else if (this.totalPoints < 17) {
            probability = 0.25;
        } else {
            probability = 0;
        }
        if (random.nextDouble() < probability) {
            CardWithSuit card = deckCards.get(0);
            this.cards.add(card);
            this.totalPoints += card.getCard().getCardValue();
            deckCards.remove(0);
//            System.out.println("после взятия карты: " + this.totalPoints);
            return true;
        }
        return false;
    }

    @Override
    public boolean placeBet(Game game) {
        this.balance -= this.bid;
        this.currentBid += this.bid;
        game.setBank(game.getBank() + bid);
        return true;
    }
}
