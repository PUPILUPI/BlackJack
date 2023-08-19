/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

import ru.belov.blackjack.players.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Xiaomi
 */
public class Game {

    private Deck deck = new Deck();
    private List<Player> players = new ArrayList<>();
    private int indexOfCurrentPlayer;
    private int numberOfMoves = 0;
    private boolean betOrTake = true;
    private Integer bank = 0;

    public void startGame() {
        players.forEach(player -> {
            player.takeCard(deck.getCards());
            player.takeCard(deck.getCards());
            player.placeBet(this);
        });
        Random random = new Random();
        indexOfCurrentPlayer = random.nextInt(players.size());
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }
    
    public int getBank() {
        return bank;
    }

    public int getIndexOfCurrentPlayer() {
        return indexOfCurrentPlayer;
    }

    public boolean isBetOrTake() {
        return betOrTake;
    }

    public String makeMove() {
        boolean b = this.betOrTake;
        int index = this.indexOfCurrentPlayer;
        changePhaseAndIncreaseIndex();
        if (b) {
            if (this.players.get(index).takeCard(this.deck.getCards())) {
                return "Игрок " + (index + 1) + " взял карту";
            } else {
                return "Игрок " + (index + 1) + " не взял карту";
            }
        } else {
            if (this.players.get(index).placeBet(this)) {
                return "Игрок " + (index + 1) + " повысил ставку";
            } else {
                return "Игрок " + (index + 1) + " не повысил ставку";
            }
        }
    }

    public String noMakeMove() {
        if (this.betOrTake) {
            changePhaseAndIncreaseIndex();
            return "<html> Вы не взяли карту. <br> " + "Следующим ходит игрок " + (this.indexOfCurrentPlayer + 1 + "</html>");
        } else {
            changePhaseAndIncreaseIndex();
            return "Вы не повысили ставку.  \n " + "Следующим ходит игрок " + (this.indexOfCurrentPlayer + 1);
        }
    }

    private void changePhaseAndIncreaseIndex() {
        this.numberOfMoves++;
        if (numberOfMoves % players.size() == 0) {
            if (this.betOrTake == true) {
                this.betOrTake = false;
            } else {
                this.betOrTake = true;
            }
        }
        if (this.indexOfCurrentPlayer == (players.size() - 1)) {
            this.indexOfCurrentPlayer = 0;
        } else {
            this.indexOfCurrentPlayer++;
        }
    }
}
