/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ru.belov.blackjack;

import ru.belov.blackjack.players.Player;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Xiaomi
 */
public interface UpdateVisualInfo {

    void updateAllPlayersImgs();

    default void updateStatistics(PlayersScreen screen) {
        screen.getLossesLabel().setText("проигрыши: " + screen.getLosses());
        screen.getWinningsLabel().setText("выигрыши: " + screen.getWinnings());
    }

    default void updateBankInfo(JLabel bankInfoLabel, Game game) {
        bankInfoLabel.setText("<html> текущий банк: " + game.getBank() + "<br>текущая ставка в игре: " + game.getCurrentBid() + "<br>Ваша ставка: " + game.getPlayers().get(0).getCurrentBid() + "<br>ваш баланс: " + game.getPlayers().get(0).getBalance() + "</html>");
    }

    default void updateImgsForUser(Player user,
            JLabel firstCardLabel,
            JLabel secondCardLabel,
            JLabel thirdCardLabel,
            JLabel fourthCardLabel,
            JLabel fifthCardLabel) {
        switch (user.getCards().size()) {
            case 2 -> {
                secondCardLabel.setIcon(user.getCards().get(0).getSuit());
                thirdCardLabel.setIcon(user.getCards().get(1).getSuit());
            }
            case 3 -> {
                secondCardLabel.setIcon(user.getCards().get(0).getSuit());
                thirdCardLabel.setIcon(user.getCards().get(1).getSuit());
                fourthCardLabel.setIcon(user.getCards().get(2).getSuit());
            }
            case 4 -> {
                firstCardLabel.setIcon(user.getCards().get(0).getSuit());
                secondCardLabel.setIcon(user.getCards().get(1).getSuit());
                thirdCardLabel.setIcon(user.getCards().get(2).getSuit());
                fourthCardLabel.setIcon(user.getCards().get(3).getSuit());
            }
            case 5 -> {
                firstCardLabel.setIcon(user.getCards().get(0).getSuit());
                secondCardLabel.setIcon(user.getCards().get(1).getSuit());
                thirdCardLabel.setIcon(user.getCards().get(2).getSuit());
                fourthCardLabel.setIcon(user.getCards().get(3).getSuit());
                fifthCardLabel.setIcon(user.getCards().get(4).getSuit());
            }
        }
    }

    default void updateImgsForBot(Player bot, JLabel botLabel) {
        switch (bot.getCards().size()) {
            case 2 -> {
                ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/twoCardsTop.jpg");
                ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(54, 80, java.awt.Image.SCALE_SMOOTH));
                botLabel.setIcon(resizedImg);
            }
            case 3 -> {
                ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/threeCardsTop.jpg");
                ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(60, 80, java.awt.Image.SCALE_SMOOTH));
                botLabel.setIcon(resizedImg);
            }
            case 4 -> {
                ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/fourCardsTop.jpg");
                ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(66, 80, java.awt.Image.SCALE_SMOOTH));
                botLabel.setIcon(resizedImg);
            }
            case 5 -> {
                ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/fiveCardsTop.jpg");
                ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(72, 80, java.awt.Image.SCALE_SMOOTH));
                botLabel.setIcon(resizedImg);
            }
        }
    }
    default ImageIcon generateIconForLoser(String cardSuit) {
        return null;
    }
}
