/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 *
 * @author ncamacho1
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form proyecto
     */
    public principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumerouno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnumerodos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbOperation = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Operacion con dos numeros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setText("numero uno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtnumerouno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerounoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumerouno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setText("numero dos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));
        jPanel1.add(txtnumerodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 70, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Resultado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        txtresultado.setEditable(false);
        jPanel1.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, -1));

        cmdcalcular.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        cmdborrar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cmdborrar.setText("Borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Operaciones");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cmbOperation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicacion", "Division", " " }));
        jPanel1.add(cmbOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        String num1, num2, res;
        double n1, n2, resultado=0;
        int op;
        
        n1=Double.parseDouble(txtnumerouno.getText());
        n2=Double.parseDouble(txtnumerodos.getText());
        op=cmbOperation.getSelectedIndex();
        
        switch(op) {
            case 0:
                resultado=n1+n2;
                break;
            case 1:
                resultado=n1-n2;
                break;
            case 2:
                resultado=n1*n2;
                break;
            case 3:
                resultado=n1/n2;
                break;
        }
        
       
        res = String.valueOf(resultado);
        
        txtresultado.setText (res);
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
        txtnumerouno.setText("");
        txtnumerodos.setText("");
        txtresultado.setText("");
        
        txtnumerouno.requestFocusInWindow();
        cmbOperation.setSelectedIndex(0);
        
    }//GEN-LAST:event_cmdborrarActionPerformed

    private void txtnumerounoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerounoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerounoActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperation;
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnumerodos;
    private javax.swing.JTextField txtnumerouno;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
