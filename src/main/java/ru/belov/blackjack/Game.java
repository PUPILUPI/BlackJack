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
    private int currentBid = 0;

    public void startGame() {
        System.out.println("изначальное количество ходов " + numberOfMoves);
        players.forEach(player -> {
            player.takeCard(deck.getCards());
            player.takeCard(deck.getCards());
            player.placeBet(this);
        });
        Random random = new Random();
        indexOfCurrentPlayer = random.nextInt(players.size());
        System.err.println("первым ходит игрок " + (indexOfCurrentPlayer + 1));
        System.out.println(betOrTake);
        System.out.println("количество ходов " + numberOfMoves);
        currentBid = players.get(indexOfCurrentPlayer).getCurrentBid();
    }

    public int getNumberOfMoves() {
        return numberOfMoves;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    public int getCurrentBid() {
        return currentBid;
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
        System.out.println(this.betOrTake + "хуй");
        boolean b = this.betOrTake;
        int index = this.indexOfCurrentPlayer;
        if (b) {
            if (this.players.get(index).takeCard(this.deck.getCards())) {
                changePhaseAndIncreaseIndex();
                return "Игрок " + (index + 1) + " взял карту";
            } else {
                changePhaseAndIncreaseIndex();
                return "Игрок " + (index + 1) + " не взял карту";
            }
        } else {
            if (this.players.get(index).placeBet(this)) {
                changePhaseAndIncreaseIndex();
                return "Игрок " + (index + 1) + " повысил ставку";
            } else {
                changePhaseAndIncreaseIndex();
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
            return "<html> Вы не повысили ставку.  <br>" + "Следующим ходит игрок " + (this.indexOfCurrentPlayer + 1 + "</html>");
        }
    }

    private void changePhaseAndIncreaseIndex() {
        System.out.println(numberOfMoves);
        this.numberOfMoves++;
        if (numberOfMoves % players.size() == 0) {
//        if (numberOfMoves == players.size()) {
            
            if (this.betOrTake == true) {
                System.out.println(numberOfMoves);
                System.out.println("изменение 1");
                this.betOrTake = false;
            } else {
                System.out.println("изменение 2");
                this.betOrTake = true;
            }
        }
        if (this.indexOfCurrentPlayer == (players.size() - 1)) {
            System.out.println("изменение 3");
            this.indexOfCurrentPlayer = 0;
        } else {
            System.out.println("изменение 4");
            this.indexOfCurrentPlayer++;
        }
    }

    public void setNumberOfMoves(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }
}
