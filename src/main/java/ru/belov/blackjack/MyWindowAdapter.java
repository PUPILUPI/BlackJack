/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ru.belov.blackjack.players.Player;

/**
 *
 * @author Xiaomi
 */
public class MyWindowAdapter extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        Object source = e.getSource();
        PlayersScreen closingFrame = (PlayersScreen) source;;
        StartScreen parent = closingFrame.getParent();
        Object[] options = {"Да", "Нет"};
        int choice = JOptionPane.showOptionDialog(closingFrame, "хотите прервать игру?\n Прогресс будет сохранен.", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice == JOptionPane.YES_OPTION) {
            initClosing(closingFrame, parent);
        }
    }

    public void FinishHandling(PlayersScreen screen) {
        Game game = screen.getGame();
        if (game.getCirclesWithoutChanges() == 2) {
            int indexOfPlayer = game.findPlayerWithMaxPoints();
            if (indexOfPlayer == 0) {
                initWinClosing(screen, screen.getParent(), "Вы выиграли, набрав " + game.getPlayers().get(0).getTotalPoints() + " очков!");
            } else {
                initLoseClosing(screen, screen.getParent(), "Выиграл игрок " + game.getPlayers().get(indexOfPlayer).getName() + " набрав " + game.getPlayers().get(indexOfPlayer).getTotalPoints() + " очков!");
            }
        }
    }

    public boolean checkPointsHandling(int result, PlayersScreen screen) {
        Game game = screen.getGame();
        Player player = game.getPlayers().get(game.getIndexOfCurrentPlayer());
        switch (result) {
            case 1 -> {
                if (screen.getGame().getIndexOfCurrentPlayer() == 0) {
                    initLoseClosing(screen, screen.getParent(), "Вы превысили 21 очко и проиграли.\nХотите выйти в меню или начать новую игру?\nВам будет засчитан проигрыш.");
                    return false;
                } else {
                    screen.getLastMoveInfo().setText("Игрок " + player.getName() + " набрал больше 21 очка и проиграл");
                    ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/lose.png");
                    ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
                    screen.getMap().get(player).setIcon(resizedImg);
                    game.getPlayers().remove(game.getIndexOfCurrentPlayer());
                    if (game.getPlayers().size() <= 1) {
                        initWinClosing(screen, screen.getParent(), "вы остались еднственным игроком и выиграли!");
                        return false;
                    }
                }
            }
            case 2 -> {
                if (screen.getGame().getIndexOfCurrentPlayer() == 0) {
                    initWinClosing(screen, screen.getParent(), "вы набрали 21 очко и выграли!");
                    return false;
                } else {
                    initLoseClosing(screen, screen.getParent(), "Игрок " + player.getName() + " набрал 21 очко и выиграл. \nА вы проиграли)");
                    return false;
                }
            }
        }
        return true;
    }

    private void initClosing(PlayersScreen closingFrame, StartScreen parent) {
        closingFrame.setLosses(closingFrame.getLosses() + 1);
        parent.setGlobalWinnings(parent.getGlobalWinnings() + closingFrame.getWinnings());
        parent.setGlobalLosses(parent.getGlobalLosses() + closingFrame.getLosses());
        parent.setGlobalBank(parent.getGlobalBank() + closingFrame.getGame().getPlayers().get(0).getBalance());
        parent.updateStatistics();
        closingFrame.dispose();
    }

    private void initWinClosing(PlayersScreen closingFrame, StartScreen parent, String message) {
        Object[] options = {"Выйти", "Начать новую игру"};
        int choice = JOptionPane.showOptionDialog(closingFrame, message, null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice == JOptionPane.YES_OPTION) {
            closingFrame.setWinnings(closingFrame.getWinnings() + 1);
            parent.setGlobalWinnings(parent.getGlobalWinnings() + closingFrame.getWinnings());
            parent.setGlobalLosses(parent.getGlobalLosses() + closingFrame.getLosses());
            parent.setGlobalBank(parent.getGlobalBank() + closingFrame.getGame().getPlayers().get(0).getBalance() + closingFrame.getGame().getBank());
            parent.updateStatistics();
            closingFrame.dispose();
        } else if (choice == JOptionPane.NO_OPTION) {
            closingFrame.setWinnings(closingFrame.getWinnings() + 1);
            parent.setGlobalBank(parent.getGlobalBank() + closingFrame.getGame().getPlayers().get(0).getBalance() + closingFrame.getGame().getBank());
            closingFrame.startGame();
            closingFrame.getLastMoveInfo().setText("Здесь будет информаця о последнем ходе.");
            closingFrame.updateBankInfo(closingFrame.getBankInfoLabel(), closingFrame.getGame());
            closingFrame.updateStatistics(closingFrame);
        }
    }

    public void initLoseClosing(PlayersScreen closingFrame, StartScreen parent, String message) {
        Object[] options = {"Выйти", "Начать новую игру"};
        int balance = closingFrame.getGame().getPlayers().get(0).getBalance();
        int choice = JOptionPane.showOptionDialog(closingFrame, message, null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice == JOptionPane.YES_OPTION) {
            initClosing(closingFrame, parent);
        } else if (choice == JOptionPane.NO_OPTION) {
            if (balance == 0) {
                JOptionPane.showMessageDialog(null, "У вас недостаточно денег, чтобы начать  новую игру,\n вы перейдете в меню.", "Уведомление", JOptionPane.WARNING_MESSAGE);
                initClosing(closingFrame, parent);
            } else {
                closingFrame.setLosses(closingFrame.getLosses() + 1);
                parent.setGlobalBank(parent.getGlobalBank() + closingFrame.getGame().getPlayers().get(0).getBalance());
                closingFrame.startGame();
                closingFrame.getLastMoveInfo().setText("Здесь будет информаця о последнем ходе.");
                closingFrame.updateBankInfo(closingFrame.getBankInfoLabel(), closingFrame.getGame());
                closingFrame.updateStatistics(closingFrame);
            }
        }

    }

}
