import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList; 
import java.io.BufferedWriter;
import java.io.FileWriter;
public class mainMenu extends javax.swing.JFrame {

    
    
    
    public mainMenu() {
        initComponents();
        buttonPlay.setEnabled(false);
    }

    
    public void addPToArray(playerInfo p){
        updateNote.words.add(p.getName());
        updateNote.words.add(String.valueOf(p.getPoints()));
        updateNote.words.add(String.valueOf(p.getPlayerId()));
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonCreate = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        textLoginName = new javax.swing.JTextField();
        textLoginId = new javax.swing.JTextField();
        textTalk = new javax.swing.JTextField();
        buttonPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Arcade Games!");

        buttonCreate.setText("Create New Account");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonPlay.setText("Play");
        buttonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(buttonCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(buttonPlay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonLogin)
                    .addComponent(textLoginName)
                    .addComponent(textLoginId, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(textTalk, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreate)
                    .addComponent(buttonLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPlay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(textTalk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        updateNote.loadWords();
        int lastId=Integer.parseInt(updateNote.words.get(updateNote.words.size()-1));
        playerInfo p = new playerInfo(textName.getText(),10,lastId+1);
        addPToArray(p);
        updateNote.updateNotePad();
        textTalk.setText("Hello "+p.getName()+" you have succefully created an account your Id is"+p.getPlayerId());
        //format of the notepadFile Name enterkey, point enterkey, Id
        
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        updateNote.loadWords();
        int id = Integer.parseInt(textLoginId.getText());
        String name = textLoginName.getText();
        updateNote.selectedIndex=-1;
        int point = -1;
        playerInfo p = new playerInfo(name,point,id);
        for(int k = 0; k<updateNote.words.size(); k++){
            if(updateNote.words.get(k).equals(name)){
                if(Integer.parseInt(updateNote.words.get(k+2))==id){
                    updateNote.selectedIndex=k;
                    name = updateNote.words.get(k);
                    point = Integer.parseInt(updateNote.words.get(k+1));
                    id = Integer.parseInt(updateNote.words.get(k+2));
                    playerInfo p1 = new playerInfo(name,point,id);
                    p=p1;
                }
            }
        }
        
        if(updateNote.selectedIndex==-1){
            textTalk.setText("You have an invalid name or Id");
        }
        else{
            buttonPlay.setEnabled(true);
            textTalk.setText("Hello "+name+". Welcome to the Arcade game center you have "+point+" points in your account");
            updateNote.selected = p;
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayActionPerformed
        //direct to another page where it contains all the game possible to play
        new gameCenter().setVisible(true);
        mainMenu.this.setVisible(false);
    }//GEN-LAST:event_buttonPlayActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textLoginId;
    private javax.swing.JTextField textLoginName;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textTalk;
    // End of variables declaration//GEN-END:variables
}
