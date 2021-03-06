/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class gameCenter extends javax.swing.JFrame {

    /**
     * Creates new form gameCenter
     */
    public gameCenter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCoin = new javax.swing.JButton();
        buttonBlack = new javax.swing.JButton();
        buttonMath = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonCoin.setText("CoinMaster");
        buttonCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCoinActionPerformed(evt);
            }
        });

        buttonBlack.setText("BlackJack");
        buttonBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBlackActionPerformed(evt);
            }
        });

        buttonMath.setText("QuickMath");
        buttonMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathActionPerformed(evt);
            }
        });

        buttonReturn.setText("Sign Out");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMath)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCoin)
                        .addGap(47, 47, 47)
                        .addComponent(buttonBlack)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonReturn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCoin)
                    .addComponent(buttonBlack))
                .addGap(18, 18, 18)
                .addComponent(buttonMath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(buttonReturn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCoinActionPerformed
        new coinToss().setVisible(true);
        gameCenter.this.setVisible(false);
    }//GEN-LAST:event_buttonCoinActionPerformed

    private void buttonBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBlackActionPerformed
        new blackJack().setVisible(true);
        gameCenter.this.setVisible(false);
    }//GEN-LAST:event_buttonBlackActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        new mainMenu().setVisible(true);
        gameCenter.this.setVisible(false);
        updateNote.selectedIndex=-1;
        updateNote.selected=null;
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMathActionPerformed
        new quickMath().setVisible(true);
        gameCenter.this.setVisible(false);
    }//GEN-LAST:event_buttonMathActionPerformed

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
            java.util.logging.Logger.getLogger(gameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameCenter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBlack;
    private javax.swing.JButton buttonCoin;
    private javax.swing.JButton buttonMath;
    private javax.swing.JButton buttonReturn;
    // End of variables declaration//GEN-END:variables
}
