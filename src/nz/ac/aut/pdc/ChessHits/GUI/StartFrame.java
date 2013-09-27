/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.pdc.ChessHits.GUI;
import nz.ac.aut.pdc.ChessHits.model.ChessHitsGame;
import nz.ac.aut.pdc.ChessHits.model.Color;
import nz.ac.aut.pdc.ChessHits.model.Player;

/**
 *
 * @author gl
 */
public class StartFrame extends javax.swing.JFrame {
 ChessHitsGame game;
    /**
     * Creates new form Frame
     */
    public StartFrame(ChessHitsGame game) {
       this.game = game;
        initComponents();
        javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
        bg.add(isBlack);      
        bg.add(isWhite);
        isWhite.setSelected(true);
        this.setLocationRelativeTo(null);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        player1 = new javax.swing.JTextField();
        isBlack = new javax.swing.JRadioButton();
        isWhite = new javax.swing.JRadioButton();
        player2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        isBlack.setText("black");
        isBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBlackActionPerformed(evt);
            }
        });

        isWhite.setText("white");

        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(isBlack)
                .addGap(18, 18, 18)
                .addComponent(isWhite)
                .addGap(63, 63, 63)
                .addComponent(submit)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isBlackActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
          Player playerOne = null;
          Player playerTwo = null;
          boolean isPlayerOneWhite = false;
        if( isBlack.isSelected()){  
            playerOne = new Player(player1.getText() ,Color.BLACK);
             playerTwo = new Player(player2.getText() ,Color.WHITE);
      
        }
        else{
             playerOne = new Player(player1.getText() ,Color.WHITE);
             playerTwo = new Player(player2.getText() ,Color.BLACK);
             isPlayerOneWhite = true;
        }
        this.setVisible(false);
        final MainFrame mainFrame = new MainFrame(playerOne, playerTwo, game, isPlayerOneWhite);
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               mainFrame.setVisible(true);
            }
        });
    }//GEN-LAST:event_submitActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton isBlack;
    private javax.swing.JRadioButton isWhite;
    private javax.swing.JTextField player1;
    private javax.swing.JTextField player2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
