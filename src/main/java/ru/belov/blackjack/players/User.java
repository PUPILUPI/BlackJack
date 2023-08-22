/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.players;

import java.util.List;
import javax.swing.JOptionPane;
import ru.belov.blackjack.CardWithSuit;
import ru.belov.blackjack.Game;

/**
 *
 * @author Xiaomi
 */
public class User extends Player {

    @Override
    public boolean takeCard(List<CardWithSuit> deckCards) {
        CardWithSuit card = deckCards.get(0);
        this.cards.add(card);
        this.totalPoints += card.getCard().getCardValue();
        deckCards.remove(0);
        return true;
    }

    @Override
    public boolean placeBet(Game game) {
        if (this.balance == 0) {
            JOptionPane.showMessageDialog(null, "У вас недостаточно денег, чтобы повысить ставку.", "Уведомление", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (game.getCurrentBid() == this.currentBid && game.getNumberOfMoves() > 0) {
            game.setNumberOfMoves(0);
        }
        this.balance -= this.bid;
        this.currentBid += this.bid;
        game.setBank(game.getBank() + bid);
        game.setCurrentBid(this.currentBid);
        return true;
    }

}
