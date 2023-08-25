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
    private int movesWithoutChanges = 0;
    private int circlesWithoutChanges = 0;

    public void startGame() {
        players.forEach(player -> {
            player.takeCard(deck.getCards());
            player.takeCard(deck.getCards());
            player.placeBet(this);
        });
        Random random = new Random();
        indexOfCurrentPlayer = random.nextInt(players.size());
        currentBid = players.get(indexOfCurrentPlayer).getCurrentBid();
    }

    public String makeMove() {
//        if (numberOfMoves > 2){
//                    players.get(1).setTotalPoints(21);
//        }

        int index = this.indexOfCurrentPlayer;
        Player player = this.players.get(index);
        if (this.betOrTake) {
            if (player.takeCard(this.deck.getCards())) {
                movesWithoutChanges = 0;
                circlesWithoutChanges = 0;
                return "Игрок " + players.get(indexOfCurrentPlayer).getName() + " взял карту";
            } else {
                movesWithoutChanges += 1;
                return "Игрок " + players.get(indexOfCurrentPlayer).getName() + " не взял карту";
            }
        } else {
            if (player.placeBet(this)) {
                movesWithoutChanges = 0;
                circlesWithoutChanges = 0;
                return "Игрок " + players.get(indexOfCurrentPlayer).getName() + " повысил ставку";
            } else {
                movesWithoutChanges += 1;
                return "Игрок " + players.get(indexOfCurrentPlayer).getName() + " не повысил ставку";
            }
        }
    }

    public String noMakeMove() {
        if (this.betOrTake) {
            movesWithoutChanges += 1;
            return "<html> Вы не взяли карту. <br> " + "Следующим ходит игрок " + players.get(this.indexOfCurrentPlayer + 1).getName() + "</html>";
        } else {
            movesWithoutChanges += 1;
            return "<html> Вы не повысили ставку.  <br>" + "Следующим ходит игрок " + players.get(this.indexOfCurrentPlayer + 1).getName() + "</html>";
        }
    }

    public void changePhaseAndIncreaseIndex() {

//        System.out.println("ходы без изменений " + movesWithoutChanges);
        this.numberOfMoves++;
        System.out.println("количество ходов после нажатия на кнопку " + numberOfMoves);
        System.out.println("размер списка игроков " + players.size());
        if (numberOfMoves % players.size() == 0) {
            if (movesWithoutChanges == players.size()) {
//                System.out.println("круги без изменений " + circlesWithoutChanges);
                movesWithoutChanges = 0;
                circlesWithoutChanges++;
//                System.out.println("круги без изменений после увеличения" + circlesWithoutChanges);
            } else {
                movesWithoutChanges = 0;
            }
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

    public int findPlayerWithMaxPoints() {
        int indexOfPlayer = 0;
        int maxPoints = Integer.MIN_VALUE;
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (player.getTotalPoints() > maxPoints) {
                indexOfPlayer = i;
                maxPoints = player.getTotalPoints();
            }
        }
        return indexOfPlayer;
    }

    public int checkPoints() {
        return players.get(indexOfCurrentPlayer).checkPoints();
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

    public int getMovesWithoutChanges() {
        return movesWithoutChanges;
    }

    public void setNumberOfMoves(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }

    public int getCirclesWithoutChanges() {
        return circlesWithoutChanges;
    }
}
