/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ru.belov.blackjack;

import ru.belov.blackjack.players.User;
import ru.belov.blackjack.players.Bot;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Xiaomi
 */
public final class TwoPlayersScreen extends PlayersScreen implements UpdateVisualInfo {

    /**
     * Creates new form TwoPlayersGame
     *
     * @param parent
     */
    public TwoPlayersScreen(StartScreen parent) {
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
        secondCardLabel = new javax.swing.JLabel();
        botLabel = new javax.swing.JLabel();
        deckLabel = new javax.swing.JLabel();
        lastMoveInfo = new javax.swing.JLabel();
        thirdCardLabel = new javax.swing.JLabel();
        fourthCardLabel = new javax.swing.JLabel();
        fifthCardLabel = new javax.swing.JLabel();
        firstCardLabel = new javax.swing.JLabel();
        makeMoveButton = new javax.swing.JButton();
        takeCardButton = new javax.swing.JButton();
        raiseBetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noTakeButton = new javax.swing.JButton();
        noRaiseBetButton = new javax.swing.JButton();
        bankInfoLabel = new javax.swing.JLabel();
        passButton = new javax.swing.JButton();
        lossesLabel = new javax.swing.JLabel();
        winningsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(getLocation());

        secondCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deckLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lastMoveInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastMoveInfo.setText("здесь будет информация о последнем ходе");

        thirdCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        makeMoveButton.setText("дать походить");
        makeMoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeMoveButtonActionPerformed(evt);
            }
        });

        takeCardButton.setText("взять карту");
        takeCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeCardButtonActionPerformed(evt);
            }
        });

        raiseBetButton.setText("повысить ставку");
        raiseBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raiseBetButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Игрок A (Вы)");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Игрок B");

        noTakeButton.setText("не брать карту");
        noTakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTakeButtonActionPerformed(evt);
            }
        });

        noRaiseBetButton.setText("не повышать ");
        noRaiseBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRaiseBetButtonActionPerformed(evt);
            }
        });

        passButton.setText("пас");
        passButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passButtonActionPerformed(evt);
            }
        });

        lossesLabel.setText("losses:");

        winningsLabel.setText("winnings:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deckLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(bankInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(passButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastMoveInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(firstCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(thirdCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fourthCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fifthCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 49, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(takeCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(raiseBetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(makeMoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noTakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noRaiseBetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lossesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(winningsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lossesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(winningsLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastMoveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(makeMoveButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(deckLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(firstCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fourthCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(thirdCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fifthCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(secondCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bankInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(noRaiseBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raiseBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noTakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(takeCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeMoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeMoveButtonActionPerformed
        System.out.println("фаза перед ходом соперника" + game.isBetOrTake());
        lastMoveInfo.setText(game.makeMove());
        updateAllPlayersImgs();
        if (adapter.checkPointsHandling(game.checkPoints(), this)) {
            game.changePhaseAndIncreaseIndex();
            updateButtons();
            updateBankInfo(this.bankInfoLabel, this.game);
            adapter.FinishHandling(this);
        }
    }//GEN-LAST:event_makeMoveButtonActionPerformed

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

    private void noTakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTakeButtonActionPerformed
        lastMoveInfo.setText(game.noMakeMove());
        game.changePhaseAndIncreaseIndex();
        updateButtons();
        adapter.FinishHandling(this);
    }//GEN-LAST:event_noTakeButtonActionPerformed

    private void raiseBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiseBetButtonActionPerformed
        lastMoveInfo.setText(game.makeMove());
        game.changePhaseAndIncreaseIndex();
        updateButtons();
        updateBankInfo(this.bankInfoLabel, this.game);
        adapter.FinishHandling(this);
    }//GEN-LAST:event_raiseBetButtonActionPerformed

    private void noRaiseBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRaiseBetButtonActionPerformed
        lastMoveInfo.setText(game.noMakeMove());
        game.changePhaseAndIncreaseIndex();
        updateButtons();
        adapter.FinishHandling(this);
    }//GEN-LAST:event_noRaiseBetButtonActionPerformed

    private void passButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passButtonActionPerformed
        adapter.initLoseClosing(this, parent, "хотите выйти в меню или начать новую игру?\n Вам будет засчитан проигрыш.");
    }//GEN-LAST:event_passButtonActionPerformed

    @Override
    public void startGame() {
        game = new Game();
        System.out.println("фаза " + game.isBetOrTake());
        game.getPlayers().add(0, new User("A"));
        game.getPlayers().add(1, new Bot("B"));
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
        map.put(game.getPlayers().get(1), botLabel);
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
    private javax.swing.JLabel botLabel;
    private javax.swing.JLabel deckLabel;
    private javax.swing.JLabel fifthCardLabel;
    private javax.swing.JLabel firstCardLabel;
    private javax.swing.JLabel fourthCardLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel winningsLabel;
    // End of variables declaration//GEN-END:variables
}
