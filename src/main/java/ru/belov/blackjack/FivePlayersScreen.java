/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ru.belov.blackjack;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import ru.belov.blackjack.players.Bot;
import ru.belov.blackjack.players.User;

/**
 *
 * @author Xiaomi
 */
public class FivePlayersScreen extends PlayersScreen {

    /**
     * Creates new form FivePlayersScreen
     */
    public FivePlayersScreen(StartScreen parent) {
        super(parent);
        initComponents();
        startGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passButton = new javax.swing.JButton();
        takeCardButton = new javax.swing.JButton();
        noTakeButton = new javax.swing.JButton();
        raiseBetButton = new javax.swing.JButton();
        noRaiseBetButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        firstCardLabel = new javax.swing.JLabel();
        secondCardLabel = new javax.swing.JLabel();
        thirdCardLabel = new javax.swing.JLabel();
        fourthCardLabel = new javax.swing.JLabel();
        fifthCardLabel = new javax.swing.JLabel();
        bankInfoLabel = new javax.swing.JLabel();
        deckLabel = new javax.swing.JLabel();
        lossesLabel = new javax.swing.JLabel();
        winningsLabel = new javax.swing.JLabel();
        lastMoveInfo = new javax.swing.JLabel();
        makeMoveButton = new javax.swing.JButton();
        bot2NameLabel = new javax.swing.JLabel();
        bot3NameLabel = new javax.swing.JLabel();
        bot3Label = new javax.swing.JLabel();
        bot2Label = new javax.swing.JLabel();
        bot4NameLavel = new javax.swing.JLabel();
        bot4Label = new javax.swing.JLabel();
        bot1NameLabel = new javax.swing.JLabel();
        bot1Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        passButton.setText("пас");
        passButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passButtonActionPerformed(evt);
            }
        });

        takeCardButton.setText("взять карту");
        takeCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeCardButtonActionPerformed(evt);
            }
        });

        noTakeButton.setText("Не брать");
        noTakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTakeButtonActionPerformed(evt);
            }
        });

        raiseBetButton.setText("повысить ставку");
        raiseBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raiseBetButtonActionPerformed(evt);
            }
        });

        noRaiseBetButton.setText("не повышать");
        noRaiseBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRaiseBetButtonActionPerformed(evt);
            }
        });

        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("Игрок A (Вы)");

        firstCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        secondCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        thirdCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fourthCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fifthCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bankInfoLabel.setText("банк");

        deckLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lossesLabel.setText("проигрыши");

        winningsLabel.setText("выигрыши");

        lastMoveInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastMoveInfo.setText("Здесь будет информация о последнем ходе.");

        makeMoveButton.setText("дать походить");
        makeMoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeMoveButtonActionPerformed(evt);
            }
        });

        bot2NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bot2NameLabel.setText("Игрок C");

        bot3NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bot3NameLabel.setText("Игрок D");

        bot3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bot2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bot4NameLavel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bot4NameLavel.setText("Игрок E");

        bot4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bot1NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bot1NameLabel.setText("Игрок B");

        bot1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 88, Short.MAX_VALUE)
                                .addComponent(firstCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirdCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourthCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fifthCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(userNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(raiseBetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noRaiseBetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(noTakeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deckLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lossesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(winningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bot2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bot2NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bot3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bot3NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastMoveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(makeMoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bot1NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(bot1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bot4NameLavel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lossesLabel)
                    .addComponent(bot2NameLabel)
                    .addComponent(bot3NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(winningsLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(bot4NameLavel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bot1NameLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bot4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(noRaiseBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raiseBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noTakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deckLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bankInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takeCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(passButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastMoveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeMoveButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secondCardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirdCardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourthCardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fifthCardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameLabel))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passButtonActionPerformed
        adapter.initLoseClosing(this, parent, "хотите выйти в меню или начать новую игру?\n Вам будет засчитан проигрыш.");
    }//GEN-LAST:event_passButtonActionPerformed

    private void makeMoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeMoveButtonActionPerformed
        lastMoveInfo.setText(game.makeMove());
        updateAllPlayersImgs();
        if (adapter.checkPointsHandling(game.checkPoints(), this)) {
            game.changePhaseAndIncreaseIndex();
            updateButtons();
            updateBankInfo(this.bankInfoLabel, this.game);
            adapter.FinishHandling(this);
        }
    }//GEN-LAST:event_makeMoveButtonActionPerformed

    private void noRaiseBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRaiseBetButtonActionPerformed
        lastMoveInfo.setText(game.noMakeMove());
        game.changePhaseAndIncreaseIndex();
        updateButtons();
        adapter.FinishHandling(this);
    }//GEN-LAST:event_noRaiseBetButtonActionPerformed

    private void raiseBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiseBetButtonActionPerformed
        lastMoveInfo.setText(game.makeMove());
        game.changePhaseAndIncreaseIndex();
        updateButtons();
        updateBankInfo(this.bankInfoLabel, this.game);
        adapter.FinishHandling(this);
    }//GEN-LAST:event_raiseBetButtonActionPerformed

    private void noTakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTakeButtonActionPerformed
        lastMoveInfo.setText(game.noMakeMove());
        game.changePhaseAndIncreaseIndex();
        updateButtons();
        adapter.FinishHandling(this);
    }//GEN-LAST:event_noTakeButtonActionPerformed

    private void takeCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeCardButtonActionPerformed
        lastMoveInfo.setText(game.makeMove());
        updateAllPlayersImgs();
        if (adapter.checkPointsHandling(game.checkPoints(), this)) {
            game.changePhaseAndIncreaseIndex();
            updateButtons();
            updateBankInfo(this.bankInfoLabel, this.game);
            adapter.FinishHandling(this);
        }
    }//GEN-LAST:event_takeCardButtonActionPerformed

    /**
     */
    @Override
    public void startGame() {
        game = new Game();
        System.out.println("фаза " + game.isBetOrTake());
        game.getPlayers().add(0, new User("A"));
        game.getPlayers().add(1, new Bot("B"));
        game.getPlayers().add(2, new Bot("C"));
        game.getPlayers().add(3, new Bot("D"));
        game.getPlayers().add(4, new Bot("E"));
        loadMap();
        int balance = parent.getBalanceForGame();
        game.getPlayers().forEach(player -> player.setBalance(balance));
        game.startGame();
        updateAllPlayersImgs();
        updateBankInfo(this.bankInfoLabel, this.game);
        updateButtons();
        updateStatistics(this);
        checkOn21and22();
    }

    public void updateButtons() {
        if (game.getIndexOfCurrentPlayer() != 0) {
            this.makeMoveButton.setVisible(true);
            this.noTakeButton.setVisible(false);
            this.takeCardButton.setVisible(false);
            this.noRaiseBetButton.setVisible(false);
            this.raiseBetButton.setVisible(false);
            this.passButton.setVisible(false);
        } else {
            if (this.game.isBetOrTake()) {
                this.makeMoveButton.setVisible(false);
                this.noTakeButton.setVisible(true);
                if (game.getPlayers().get(0).getCards().size() <= 5) {
                    this.takeCardButton.setVisible(true);
                } else {
                    this.takeCardButton.setVisible(false);
                }
                this.noRaiseBetButton.setVisible(false);
                this.raiseBetButton.setVisible(false);
                this.passButton.setVisible(true);
            } else {
                if (game.getPlayers().get(0).getCurrentBid() == game.getCurrentBid()) {
                    this.noRaiseBetButton.setVisible(true);
                } else {
                    this.noRaiseBetButton.setVisible(false);
                }
                this.raiseBetButton.setVisible(true);
                this.makeMoveButton.setVisible(false);
                this.noTakeButton.setVisible(false);
                this.takeCardButton.setVisible(false);
                this.passButton.setVisible(true);
            }
        }
    }

    public void loadMap() {
        map.put(game.getPlayers().get(1), bot1Label);
        map.put(game.getPlayers().get(2), bot2Label);
        map.put(game.getPlayers().get(3), bot3Label);
        map.put(game.getPlayers().get(4), bot4Label);
    }

    @Override
    public void updateAllPlayersImgs() {
        ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/deck.jpg");
        ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
        deckLabel.setIcon(resizedImg);
        game.getPlayers().forEach(player -> {
            if (player instanceof User) {
                updateImgsForUser(game.getPlayers().get(0),
                        firstCardLabel,
                        secondCardLabel,
                        thirdCardLabel,
                        fourthCardLabel,
                        fifthCardLabel);
            } else {
                updateImgsForBot(player, map.get(player));
            }
        });
    }

    @Override
    public JLabel getLossesLabel() {
        return lossesLabel;
    }

    @Override
    public JLabel getWinningsLabel() {
        return winningsLabel;
    }

    @Override
    public JLabel getBankInfoLabel() {
        return bankInfoLabel;
    }

    @Override
    public JLabel getLastMoveInfo() {
        return lastMoveInfo;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankInfoLabel;
    private javax.swing.JLabel bot1Label;
    private javax.swing.JLabel bot1NameLabel;
    private javax.swing.JLabel bot2Label;
    private javax.swing.JLabel bot2NameLabel;
    private javax.swing.JLabel bot3Label;
    private javax.swing.JLabel bot3NameLabel;
    private javax.swing.JLabel bot4Label;
    private javax.swing.JLabel bot4NameLavel;
    private javax.swing.JLabel deckLabel;
    private javax.swing.JLabel fifthCardLabel;
    private javax.swing.JLabel firstCardLabel;
    private javax.swing.JLabel fourthCardLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastMoveInfo;
    private javax.swing.JLabel lossesLabel;
    private javax.swing.JButton makeMoveButton;
    private javax.swing.JButton noRaiseBetButton;
    private javax.swing.JButton noTakeButton;
    private javax.swing.JButton passButton;
    private javax.swing.JButton raiseBetButton;
    private javax.swing.JLabel secondCardLabel;
    private javax.swing.JButton takeCardButton;
    private javax.swing.JLabel thirdCardLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel winningsLabel;
    // End of variables declaration//GEN-END:variables
}
