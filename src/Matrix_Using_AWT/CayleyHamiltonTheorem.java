/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix_Using_AWT;

/**
 *
 * @author Ramanand Anand Mohare.
 */
public class CayleyHamiltonTheorem extends javax.swing.JFrame {

    FirstPage datatrans;
    public CayleyHamiltonTheorem(FirstPage df) {
        initComponents();
        datatrans = df;
    }
    private CayleyHamiltonTheorem()
    {
        throw new UnsupportedOperationException("Not Supported Yet.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        E1 = new javax.swing.JTextField();
        E2 = new javax.swing.JTextField();
        E3 = new javax.swing.JTextField();
        E4 = new javax.swing.JTextField();
        E5 = new javax.swing.JTextField();
        E6 = new javax.swing.JTextField();
        E7 = new javax.swing.JTextField();
        E8 = new javax.swing.JTextField();
        E9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setTitle("Cayley-Hamilton Theorem ");
        getContentPane().setLayout(null);

        jLabel1.setText("Enter Matrix Here       :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(67, 80, 165, 20);
        getContentPane().add(E1);
        E1.setBounds(266, 77, 70, 26);

        E2.setToolTipText("");
        getContentPane().add(E2);
        E2.setBounds(351, 77, 70, 26);
        getContentPane().add(E3);
        E3.setBounds(436, 77, 70, 26);
        getContentPane().add(E4);
        E4.setBounds(266, 121, 70, 26);
        getContentPane().add(E5);
        E5.setBounds(351, 121, 70, 26);
        getContentPane().add(E6);
        E6.setBounds(436, 121, 70, 26);
        getContentPane().add(E7);
        E7.setBounds(266, 168, 70, 26);
        getContentPane().add(E8);
        E8.setBounds(351, 168, 70, 26);
        getContentPane().add(E9);
        E9.setBounds(436, 165, 70, 26);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 560, 95, 29);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 560, 69, 29);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 560, 65, 29);

        jLabel2.setText("Characteristics Equation:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 300, 174, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 300, 240, 26);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        datatrans.postData();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Clear given Matrix elements :
        E1.setText(" ");
        E2.setText(" ");
        E3.setText(" ");
        E4.setText(" ");
        E5.setText(" ");
        E6.setText(" ");
        E7.setText(" ");
        E8.setText(" ");
        E9.setText(" ");
        
        //Clear given answer :
        jTextField1.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[][] a = new int[3][3];     
        
        //Calling Matrix elements :
        String A = E1.getText();
        int a00 = Integer.parseInt(A);
        String B = E2.getText();
        int a01 = Integer.parseInt(B);
        String C = E3.getText();
        int a02 = Integer.parseInt(C);
        String D = E4.getText();
        int a10 = Integer.parseInt(D);
        String E = E5.getText();
        int a11 = Integer.parseInt(E);
        String F = E6.getText();
        int a12 = Integer.parseInt(F);
        String G = E7.getText();
        int a20 = Integer.parseInt(G);
        String H = E8.getText();
        int a21 = Integer.parseInt(H);
        String I = E9.getText();
        int a22 = Integer.parseInt(I);
        
        //Assigning Matrix elements :
        a[0][0] = a00;
        a[0][1] = a01;
        a[0][2] = a02;
        a[1][0] = a10;
        a[1][1] = a11;
        a[1][2] = a12;
        a[2][0] = a20;
        a[2][1] = a21;
        a[2][2] = a22;
        
        //To find determinant :
        int det = (a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) + a[0][2]*(a[1][0]*a[2][1] - a[1][1]*a[2][0]));
        det = det*(-1);

        //To find S1 :
        int S1 = a00+a11+a22;
        S1 = S1*(-1);

        //To find S2 :
        int S2 = (a[1][1]*a[2][2] - a[1][2]*a[2][1]) + (a[0][0]*a[2][2] - a[0][2]*a[2][0]) + (a[0][0]*a[1][1] - a[0][1]*a[1][0]);

        //Printing Answer :
        jTextField1.setText("???? + ("+S1+")"+"???? + ("+S2+")"+"?? + ("+det+" ) "+"= 0 ");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CayleyHamiltonTheorem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CayleyHamiltonTheorem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CayleyHamiltonTheorem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CayleyHamiltonTheorem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CayleyHamiltonTheorem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField E1;
    private javax.swing.JTextField E2;
    private javax.swing.JTextField E3;
    private javax.swing.JTextField E4;
    private javax.swing.JTextField E5;
    private javax.swing.JTextField E6;
    private javax.swing.JTextField E7;
    private javax.swing.JTextField E8;
    private javax.swing.JTextField E9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
