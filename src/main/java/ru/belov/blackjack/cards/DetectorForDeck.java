/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.cards;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ru.belov.blackjack.gameFrames.PlayersScreen;
import ru.belov.blackjack.gameFrames.TwoPlayersScreen;
import ru.belov.blackjack.players.Player;

/**
 *
 * @author Xiaomi
 */
public class DetectorForDeck extends Detector {

    public DetectorForDeck(Map<JLabel, Player> map, Map<JLabel, Game> mapLabelToDeck) {
        super(map, mapLabelToDeck);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            JLabel label = (JLabel) e.getSource();
            double emmiting = mapLabelToGame.get(label)
                    .getDeck().getCards()
                    .get(0).getCard()
                    .getNuclide()
                    .getEmitting();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            DetectorFrame screen = new DetectorFrame();
            int x = (screenSize.width - screen.getWidth()) / 2;
            int y = (screenSize.height - screen.getHeight()) / 2;
            screen.setLocation(x, y);
            screen.getThirdCardLabel().setIcon(comparisons.get(emmiting));
            int points = mapLabelToGame.get(label)
                    .getPlayers()
                    .get(0).getTotalPoints();
            int cardValue = mapLabelToGame.get(label)
                    .getDeck().getCards()
                    .get(0).getCard()
                    .getCardValue();
            if (points + cardValue > 21) {
                screen.getRecomendationLabel().setText("Брать карту не надо!");
            } else if (points + cardValue == 21) {
                screen.getRecomendationLabel().setText("Брать карту определенно надо!");
            } else {
                screen.getRecomendationLabel().setText("Можете взять, но осторожно!");
            }
            screen.setVisible(true);
        }
    }

}
