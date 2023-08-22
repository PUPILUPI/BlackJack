/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

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

    public void windowClosing(ActionEvent evt) {
        Object[] options = {"Выйти", "Начать новую игру"};
        JButton button = (JButton) evt.getSource();
        PlayersScreen closingFrame = null;
        Object source = SwingUtilities.getWindowAncestor(button);
        if (source instanceof TwoPlayersScreen) {
            closingFrame = (TwoPlayersScreen) source;
        } else if (source instanceof ThreePlayersScreen) {
            closingFrame = (ThreePlayersScreen) source;
        } else if (source instanceof FourPlayersScreen) {
            closingFrame = (FourPlayersScreen) source;
        } else if (source instanceof FivePlayersScreen) {
            closingFrame = (FivePlayersScreen) source;
        }

        int balance = closingFrame.getGame().getPlayers().get(0).getBalance();
        int choice = JOptionPane.showOptionDialog(closingFrame, "хотите выйти в меню или начать новую игру?\n Вам будет засчитан проигрыш.", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        StartScreen parent = closingFrame.getParent();
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
                closingFrame.updateBankInfo(closingFrame.getBankInfoLabel(), closingFrame.getGame());
                closingFrame.updateStatistics(closingFrame);
            }
        }
    }

    private void initClosing(PlayersScreen closingFrame, StartScreen parent) {
        closingFrame.setLosses(closingFrame.getLosses() + 1);
        parent.setGlobalWinnings(parent.getGlobalWinnings() + closingFrame.getWinnings());
        parent.setGlobalLosses(parent.getGlobalLosses() + closingFrame.getLosses());
        parent.setGlobalBank(parent.getGlobalBank() + closingFrame.getGame().getPlayers().get(0).getBalance());
        parent.updateStatistics();
        closingFrame.dispose();
    }
}
