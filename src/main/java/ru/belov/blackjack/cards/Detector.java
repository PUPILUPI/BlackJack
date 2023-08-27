/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.cards;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import ru.belov.blackjack.players.Player;

public class Detector implements MouseListener {

    protected Map<Double, ImageIcon> comparisons = new HashMap<>();
    protected Map<JLabel, Player> mapLabelToPlayer;
    protected Map<JLabel, Game> mapLabelToGame;

    public Detector(Map<JLabel, Player> map, Map<JLabel, Game> mapLabelToDeck) {
        this.mapLabelToPlayer = map;
        this.mapLabelToGame = mapLabelToDeck;
        setUpDetector();
    }

    public void setUpDetector() {
        Card[] cards = Card.values();
        for (Card card : cards) {
            comparisons.put(card.getNuclide().getEmitting(), generatePlayingCardImageIcon(card.getCardValue()));
        }
    }

    private static ImageIcon generatePlayingCardImageIcon(int numberValue) {
        String cardValue = null;
        if (numberValue == 6) {
            cardValue = "6";
        } else if (numberValue == 7) {
            cardValue = "7";
        } else if (numberValue == 8) {
            cardValue = "8";
        } else if (numberValue == 9) {
            cardValue = "9";
        } else if (numberValue == 10) {
            cardValue = "10";
        } else if (numberValue == 11) {
            cardValue = "A";
        } else if (numberValue == 2) {
            cardValue = "J";
        } else if (numberValue == 3) {
            cardValue = "Q";
        } else if (numberValue == 4) {
            cardValue = "K";
        }
        int width = 48;
        int height = 80;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();

        // Задаем белый фон
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);

        // Задаем черный цвет для границы карты
        graphics.setColor(Color.BLACK);
        graphics.drawRect(6, 6, 36, 68);

        // Загружаем шрифт для отображения текста на карте
        Font font = new Font("Arial", Font.PLAIN, 25);
        graphics.setFont(font);

        // Отображаем достоинство и масть карт
        graphics.setColor(Color.BLACK);
        graphics.drawString(cardValue, 12, 35);
        graphics.dispose();
        return new ImageIcon(image);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            JLabel label = (JLabel) e.getSource();
            Player player = mapLabelToPlayer.get(label);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            DetectorFrame screen = new DetectorFrame();
            int x = (screenSize.width - screen.getWidth()) / 2;
            int y = (screenSize.height - screen.getHeight()) / 2;
            screen.setLocation(x, y);
            updateImgsForDetectorFrame(player, screen);
            screen.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void updateImgsForDetectorFrame(Player player, DetectorFrame frame) {
        var cards = player.getCards();
        switch (player.getCards().size()) {

            case 2 -> {
                frame.getFirstCardLabel().setIcon(null);
                frame.getSecondCardLabel().setIcon(comparisons.get(
                        cards.get(0)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getThirdCardLabel().setIcon(null);
                frame.getFourthCardLabel().setIcon(comparisons.get(
                        cards
                                .get(1)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFifthCardLabel().setIcon(null);
            }
            case 3 -> {
                frame.getFirstCardLabel().setIcon(null);
                frame.getSecondCardLabel().setIcon(comparisons.get(
                        cards.get(0)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getThirdCardLabel().setIcon(comparisons.get(
                        cards.get(1)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFourthCardLabel().setIcon(comparisons.get(
                        cards.get(2)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFifthCardLabel().setIcon(null);
            }
            case 4 -> {
                frame.getFirstCardLabel().setIcon(comparisons.get(
                        cards.get(0)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getSecondCardLabel().setIcon(comparisons.get(
                        cards.get(1)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getThirdCardLabel().setIcon(comparisons.get(
                        cards.get(2)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFourthCardLabel().setIcon(comparisons.get(
                        cards.get(3)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFifthCardLabel().setIcon(null);
            }
            case 5 -> {
                frame.getFirstCardLabel().setIcon(comparisons.get(
                        cards.get(0)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getSecondCardLabel().setIcon(comparisons.get(
                        cards.get(1)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getThirdCardLabel().setIcon(comparisons.get(
                        cards.get(2)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFourthCardLabel().setIcon(comparisons.get(
                        cards.get(3)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
                frame.getFifthCardLabel().setIcon(comparisons.get(
                        cards.get(4)
                                .getCard()
                                .getNuclide()
                                .getEmitting()));
            }

        }
    }
}
