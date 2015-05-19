package speedingfineapp;

public class SpeedingFineAppMain extends javax.swing.JFrame {

    AverageSpeedProsecution asp;
    ProcessingFines pf;
    MultipleFines mf;
    Statistics stats;

    public SpeedingFineAppMain() {
        initComponents();
        asp = new AverageSpeedProsecution(this);
        pf = new ProcessingFines(this);
        mf = new MultipleFines(this);
        stats = new Statistics(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeading = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        btnQ1 = new javax.swing.JButton();
        btnQ2 = new javax.swing.JButton();
        btnQ4 = new javax.swing.JButton();
        btnQ3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traffic Department");

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        pnlHeading.setBackground(new java.awt.Color(0, 51, 255));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("Traffic Fine App");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblHeading)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/speedingfineapp/WC Logo.jpg"))); // NOI18N

        pnlButtons.setBackground(new java.awt.Color(255, 255, 255));

        btnQ1.setText("Q1 - Average Speed Prosecution");
        btnQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1ActionPerformed(evt);
            }
        });

        btnQ2.setText("Q2 - Speeding Fines");
        btnQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2ActionPerformed(evt);
            }
        });

        btnQ4.setText("Q4 - Statistics");
        btnQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4ActionPerformed(evt);
            }
        });

        btnQ3.setText("Q3 - Multiple Fines");
        btnQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQ3)
                    .addComponent(btnQ4)
                    .addComponent(btnQ2)
                    .addComponent(btnQ1))
                .addContainerGap())
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnQ1)
                .addGap(18, 18, 18)
                .addComponent(btnQ2)
                .addGap(18, 18, 18)
                .addComponent(btnQ3)
                .addGap(18, 18, 18)
                .addComponent(btnQ4)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1ActionPerformed
        asp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQ1ActionPerformed

    private void btnQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2ActionPerformed
        pf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQ2ActionPerformed

    private void btnQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4ActionPerformed
        stats.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQ4ActionPerformed

    private void btnQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3ActionPerformed
        mf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQ3ActionPerformed

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
            java.util.logging.Logger.getLogger(SpeedingFineAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpeedingFineAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpeedingFineAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpeedingFineAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpeedingFineAppMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQ1;
    private javax.swing.JButton btnQ2;
    private javax.swing.JButton btnQ3;
    private javax.swing.JButton btnQ4;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
