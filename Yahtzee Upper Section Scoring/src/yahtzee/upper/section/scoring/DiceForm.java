/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.upper.section.scoring;

/**
 *
 * @author Somath
 */

import java.util.Random;
import javax.swing.*;

public class DiceForm extends javax.swing.JFrame {

    /**
     * Creates new form DiceForm
     */
    public DiceForm() {
        initComponents();
        lblLabel.setVisible(false);
        lblScore.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiceSix = new javax.swing.JLabel();
        lblDiceFive = new javax.swing.JLabel();
        lblDiceTwo = new javax.swing.JLabel();
        lblDiceThree = new javax.swing.JLabel();
        lblDiceFour = new javax.swing.JLabel();
        lblDiceOne = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblScore = new javax.swing.JLabel();
        lblLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yahtzee Dice Upper Section Scoring");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);
        setName("Yahtzee Scoring"); // NOI18N
        setResizable(false);

        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg"))); // NOI18N

        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg"))); // NOI18N

        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg"))); // NOI18N

        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg"))); // NOI18N

        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg"))); // NOI18N

        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg"))); // NOI18N

        btnRoll.setText("Roll!");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });

        lblScore.setText("SCORE");

        lblLabel.setText("The maximum score for this roll is:");
        lblLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblLabel)
                .addGap(18, 18, 18)
                .addComponent(lblScore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLabel)
                    .addComponent(lblScore))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDiceOne)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDiceTwo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDiceThree))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDiceFour)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDiceFive)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDiceSix))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDiceThree)
                    .addComponent(lblDiceTwo)
                    .addComponent(lblDiceOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiceFour)
                    .addComponent(lblDiceFive)
                    .addComponent(lblDiceSix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        lblLabel.setVisible(true);
        lblScore.setVisible(true);

        Random rand = new Random();
        int roll;
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int i = 0; i < 6; i++) {
            roll = rand.nextInt(5) + 1;

            if (i == 0) {
                switch (roll) {
                    case 1:
                        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg")));
                        one +=1;
                        break;
                    case 2:
                        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smalltwo.jpg")));
                        two +=1;
                        break;
                    case 3:
                        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallthree.jpg")));
                        three +=1;
                        break;
                    case 4:
                        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfour.jpg")));
                        four +=1;
                        break;
                    case 5:
                        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfive.jpg")));
                        five +=1;
                        break;
                    default:
                        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallsix.jpg")));
                        six +=1;
                        break;
                }
            }

            if (i == 1) {
                switch (roll) {
                    case 1:
                        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg")));
                        one +=1;
                        break;
                    case 2:
                        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smalltwo.jpg")));
                        two +=1;
                        break;
                    case 3:
                        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallthree.jpg")));
                        three +=1;
                        break;
                    case 4:
                        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfour.jpg")));
                        four +=1;
                        break;
                    case 5:
                        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfive.jpg")));
                        five +=1;
                        break;
                    default:
                        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallsix.jpg")));
                        six +=1;
                        break;
                }
            }
            
            if (i == 2) {
                switch (roll) {
                    case 1:
                        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg")));
                        one +=1;
                        break;
                    case 2:
                        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smalltwo.jpg")));
                        two +=1;
                        break;
                    case 3:
                        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallthree.jpg")));
                        three +=1;
                        break;
                    case 4:
                        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfour.jpg")));
                        four +=1;
                        break;
                    case 5:
                        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfive.jpg")));
                        five +=1;
                        break;
                    default:
                        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallsix.jpg")));
                        six +=1;
                        break;
                }
            }
            
            if (i == 3) {
                switch (roll) {
                    case 1:
                        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg")));
                        one +=1;
                        break;
                    case 2:
                        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smalltwo.jpg")));
                        two +=1;
                        break;
                    case 3:
                        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallthree.jpg")));
                        three +=1;
                        break;
                    case 4:
                        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfour.jpg")));
                        four +=1;
                        break;
                    case 5:
                        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfive.jpg")));
                        five +=1;
                        break;
                    default:
                        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallsix.jpg")));
                        six +=1;
                        break;
                }
            }

            if (i == 4) {
                switch (roll) {
                    case 1:
                        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg")));
                        one +=1;
                        break;
                    case 2:
                        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smalltwo.jpg")));
                        two +=1;
                        break;
                    case 3:
                        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallthree.jpg")));
                        three +=1;
                        break;
                    case 4:
                        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfour.jpg")));
                        four +=1;
                        break;
                    case 5:
                        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfive.jpg")));
                        five +=1;
                        break;
                    default:
                        lblDiceFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallsix.jpg")));
                        six +=1;
                        break;
                }
            }

            if (i == 5) {
                switch (roll) {
                    case 1:
                        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallone.jpg")));
                        one +=1;
                        break;
                    case 2:
                        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smalltwo.jpg")));
                        two +=1;
                        break;
                    case 3:
                        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallthree.jpg")));
                        three +=1;
                        break;
                    case 4:
                        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfour.jpg")));
                        four +=1;
                        break;
                    case 5:
                        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallfive.jpg")));
                        five +=1;
                        break;
                    default:
                        lblDiceSix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yahtzee/upper/section/scoring/images/smallsix.jpg")));
                        six +=1;
                        break;
                }
            }
        }
        
        // Total the scores for dices
        one *= 1;
        two *= 2;
        three *= 3;
        four *= 4;
        five *= 5;
        six *= 6;

        //Find largest amount of points
        int a[] = {one, two, three, four, five, six};
        int max = a[0];
        for (int i = 0; i < 6; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        
        lblScore.setText(String.valueOf(max));

        
    }//GEN-LAST:event_btnRollActionPerformed

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
            java.util.logging.Logger.getLogger(DiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceForm().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRoll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDiceFive;
    private javax.swing.JLabel lblDiceFour;
    private javax.swing.JLabel lblDiceOne;
    private javax.swing.JLabel lblDiceSix;
    private javax.swing.JLabel lblDiceThree;
    private javax.swing.JLabel lblDiceTwo;
    private javax.swing.JLabel lblLabel;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
