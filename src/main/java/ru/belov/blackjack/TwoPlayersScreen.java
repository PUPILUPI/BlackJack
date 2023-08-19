/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ru.belov.blackjack;

import java.awt.Insets;
import ru.belov.blackjack.players.User;
import ru.belov.blackjack.players.Bot;
import javax.swing.ImageIcon;

/**
 *
 * @author Xiaomi
 */
public class TwoPlayersScreen extends javax.swing.JFrame implements UpdateImages {

    private final Game game = new Game();

    /**
     * Creates new form TwoPlayersGame
     */
    public TwoPlayersScreen() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel1.setText("Игрок 1 (Вы)");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Игрок 2");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deckLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(bankInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastMoveInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(firstCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(thirdCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fourthCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fifthCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(takeCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(raiseBetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(makeMoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noTakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noRaiseBetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(deckLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bankInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noRaiseBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raiseBetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(takeCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastMoveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeMoveButton))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fourthCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(thirdCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fifthCardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))))
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
        lastMoveInfo.setText(game.makeMove());
        updateAllPlayersImgs();
        updateButtons();
        updateBankInfo(this.bankInfoLabel, this.game);
    }//GEN-LAST:event_makeMoveButtonActionPerformed

    private void takeCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeCardButtonActionPerformed
        lastMoveInfo.setText(game.makeMove());
        updateAllPlayersImgs();
        updateButtons();
        updateBankInfo(this.bankInfoLabel, this.game);
    }//GEN-LAST:event_takeCardButtonActionPerformed

    private void noTakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTakeButtonActionPerformed
        lastMoveInfo.setText(game.noMakeMove());
        updateButtons();
    }//GEN-LAST:event_noTakeButtonActionPerformed

    private void raiseBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiseBetButtonActionPerformed
        lastMoveInfo.setText(game.makeMove());
        updateButtons();
        updateBankInfo(this.bankInfoLabel, this.game);
    }//GEN-LAST:event_raiseBetButtonActionPerformed

    private void noRaiseBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRaiseBetButtonActionPerformed
        lastMoveInfo.setText(game.noMakeMove());
        updateButtons();
    }//GEN-LAST:event_noRaiseBetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoPlayersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoPlayersScreen().setVisible(true);
            }
        });
    }

    private void startGame() {
        ImageIcon deckImg = new ImageIcon(System.getProperty("user.dir") + "/imgSource/deck.jpg");
        ImageIcon resizedImg = new ImageIcon(deckImg.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
        deckLabel.setIcon(resizedImg);
        game.getPlayers().add(new User());
        game.getPlayers().add(new Bot());
        game.startGame();
        updateAllPlayersImgs();
        updateBankInfo(this.bankInfoLabel, this.game);
        updateButtons();
    }

    private void updateButtons() {
        if (game.getIndexOfCurrentPlayer() != 0) {
            this.makeMoveButton.setVisible(true);
            this.noTakeButton.setVisible(false);
            this.takeCardButton.setVisible(false);
            this.noRaiseBetButton.setVisible(false);
            this.raiseBetButton.setVisible(false);
        } else {
            if (this.game.isBetOrTake()) {
                this.makeMoveButton.setVisible(false);
                this.noTakeButton.setVisible(true);
                this.takeCardButton.setVisible(true);
                this.noRaiseBetButton.setVisible(false);
                this.raiseBetButton.setVisible(false);
            } else {
                this.noRaiseBetButton.setVisible(true);
                this.raiseBetButton.setVisible(true);
                this.makeMoveButton.setVisible(false);
                this.noTakeButton.setVisible(false);
                this.takeCardButton.setVisible(false);
            }
        }
    }
    

    public void updateAllPlayersImgs() {
        updateImgsForUser(game.getPlayers().get(0),
                firstCardLabel,
                secondCardLabel,
                thirdCardLabel,
                fourthCardLabel,
                fifthCardLabel);
        updateImgsForBot(game.getPlayers().get(1), botLabel);
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
    private javax.swing.JButton makeMoveButton;
    private javax.swing.JButton noRaiseBetButton;
    private javax.swing.JButton noTakeButton;
    private javax.swing.JButton raiseBetButton;
    private javax.swing.JLabel secondCardLabel;
    private javax.swing.JButton takeCardButton;
    private javax.swing.JLabel thirdCardLabel;
    // End of variables declaration//GEN-END:variables
}
