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
public class GaussJordanMethod extends javax.swing.JFrame {
    FirstPage datatrans;
    public GaussJordanMethod(FirstPage df) {
        initComponents();
        datatrans = df;
    }
    private GaussJordanMethod()
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
        jLabel2 = new javax.swing.JLabel();
        E1 = new javax.swing.JTextField();
        E2 = new javax.swing.JTextField();
        E3 = new javax.swing.JTextField();
        E4 = new javax.swing.JTextField();
        E5 = new javax.swing.JTextField();
        E6 = new javax.swing.JTextField();
        E7 = new javax.swing.JTextField();
        E8 = new javax.swing.JTextField();
        E9 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();
        A4 = new javax.swing.JTextField();
        A6 = new javax.swing.JTextField();
        A7 = new javax.swing.JTextField();
        A8 = new javax.swing.JTextField();
        A9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Gauss-Jordan Method");
        getContentPane().setLayout(null);

        jLabel1.setText("Enter Matrix Here       :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(67, 80, 165, 20);

        jLabel2.setText("A????                           :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 337, 169, 20);
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
        getContentPane().add(A1);
        A1.setBounds(266, 334, 70, 26);
        getContentPane().add(A2);
        A2.setBounds(351, 334, 70, 26);
        getContentPane().add(A3);
        A3.setBounds(436, 334, 70, 26);
        getContentPane().add(A5);
        A5.setBounds(351, 378, 70, 26);
        getContentPane().add(A4);
        A4.setBounds(266, 378, 70, 26);
        getContentPane().add(A6);
        A6.setBounds(436, 378, 70, 26);
        getContentPane().add(A7);
        A7.setBounds(266, 422, 70, 26);
        getContentPane().add(A8);
        A8.setBounds(351, 422, 70, 26);
        getContentPane().add(A9);
        A9.setBounds(436, 422, 70, 26);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(67, 645, 95, 29);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(363, 645, 69, 29);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(586, 645, 65, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int[][] d = new int[3][3];
        int[][] e = new int[3][3];
        int[][] t = new int[3][3];
        int i,j,x;
        
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
        
        //Unit Matrix :
        c[0][0] = 1;
        c[0][1] = 0;
        c[0][2] = 0;
        c[1][0] = 0;
        c[1][1] = 1;
        c[1][2] = 0;
        c[2][0] = 0;
        c[2][1] = 0;
        c[2][2] = 1;

        //Begining of Gauss-Jordan Method :
        //For 1st ?? :
        if (a[0][0]==0)
        {
            if(a[1][0]!=0)
            {
                //Row Interchange R1<->R2 :
                for(i=0,x=1;i<=1 && x>=0;i++,x--)
                {
                    for(j=0;j<3;j++)
                    {
                        t[i][j]=a[x][j];
                        e[i][j]=c[x][j];
                    }
                }
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=t[i][j];
                        c[i][j]=e[i][j];
                    }
                }

                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                       c[i+1][j]=((d[i+1][j]*a[0][0]) - (d[0][j]*a[i+1][0]));
                    }
                }
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                       a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                    }
                }
            }

            else if(a[2][0]!=0)
            {
                //Row Interchange R1<->R3 :
                for(i=0,x=2;i<=1 && x>=0;i++,x--)
                {
                    for(j=0;j<3;j++)
                    {
                        t[i][j]=a[x][j];
                        e[i][j]=c[x][j];
                    }
                    i++;
                    x--;
                }

                for(i=0;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=t[i][j];
                        c[i][j]=e[i][j];
                    }
                    i++;
                }

                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i+1][j]=((d[i+1][j]*a[0][0]) - (d[0][j]*a[i+1][0]));
                    }
                }
                for(i=0;i<=1;i++)
                {  
                  for(j=0;j<3;j++)
                  {
                     a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                  } 
                }
            }
        }

        else
        {
            //Matrix Transfer :
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    b[i][j]=a[i][j];
                    d[i][j]=c[i][j];
                }
            }

            //Column Calculations :
            for(i=0;i<=1;i++)
            {
                for(j=0;j<3;j++)
                {
                    c[i+1][j]=((d[i+1][j]*a[0][0]) - (d[0][j]*a[i+1][0]));
                }
            }
            for(i=0;i<=1;i++)
            {            
                for(j=0;j<3;j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                }              
            }
        }
        
        //For 2nd ?? :
        if(a[1][1]==0)
        {
            if(a[2][1]!=0)
            {
                //Row Interchange R2<->R3 :
                for(i=1,x=2;i<=2 && x>=0;i++,x--)
                {
                    for(j=1;j<=1;j++)
                    {
                        t[i][j]=a[x][j];
                        e[i][j]=c[x][j];
                    }
                }

                for(i=1;i<=2;i++)
                {
                    for(j=1;j<=1;j++)
                    {
                        a[i][j]=t[i][j];
                        c[i][j]=e[i][j];
                    }
                }

                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[0][j]));
                    }
                }
                for(i=2;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[2][1]));
                    }
                }
                for(i=0;i<1;i++)
                {
                   for(j=0;j<3;j++)
                   {
                       a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[0][1]));
                   }
                }
                for(i=2;i<=2;i++)
                {
                   for(j=0;j<3;j++)
                   {
                       a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[2][1]));
                   }
                }
            }
        }

            else
            {
                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[0][1]));
                    }
                }
                for(i=2;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[2][1]));
                    }
                }
                for(i=0;i<1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[0][1]));
                    }
                }
                for(i=2;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[2][1]));
                    }
                }
            }
        
        //For 3rd ?? :
        //Matrix Transfer :
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=a[i][j];
                d[i][j]=c[i][j];
            }
        }
                
        //Column Calculation :
        for(i=0;i<1;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=((d[i][j]*a[2][2]) - (d[2][j]*a[0][2]));
            }
        }
        
        for(i=1;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=((d[i][j]*a[2][2]) - (d[2][j]*a[1][2]));
            }
        }
        for(i=0;i<1;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=((b[i][j]*b[2][2]) - (b[2][j]*b[0][2]));
            }
        }
        
        for(i=1;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=((b[i][j]*b[2][2]) - (b[2][j]*b[1][2]));
            }
        }
       
        //Row 1 :
        for(i=0;i<1;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = c[i][j]/a[0][0];
            }
        }
        //Row 2 :
        for(i=1;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = c[i][j]/a[1][1];
            }
        }
        //Row 3 :
        for(i=2;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = c[i][j]/a[2][2];
            }
        }
        //End of Gauss-Jordan methode
        
        //Assigning Matrix elements :
        int c00 = c[0][0];
        int c01 = c[0][1];
        int c02 = c[0][2];
        int c10 = c[1][0];
        int c11 = c[1][1];
        int c12 = c[1][2];
        int c20 = c[2][0];
        int c21 = c[2][1];
        int c22 = c[2][2];

        //Diplay of Gauss-Jordan Form :
        String R = Integer.toString(c00);
        A1.setText(R);
        String S = Integer.toString(c01);
        A2.setText(S);
        String T = Integer.toString(c02);
        A3.setText(T);
        String U = Integer.toString(c10);
        A4.setText(U);
        String V = Integer.toString(c11);
        A5.setText(V);
        String W = Integer.toString(c12);
        A6.setText(W);
        String X = Integer.toString(c20);
        A7.setText(X);
        String Y = Integer.toString(c21);
        A8.setText(Y);
        String Z = Integer.toString(c22);
        A9.setText(Z);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Given Matrix :
        E1.setText(" ");
        E2.setText(" ");
        E3.setText(" ");
        E4.setText(" ");
        E5.setText(" ");
        E6.setText(" ");
        E7.setText(" ");
        E8.setText(" ");
        E9.setText(" ");

        //Answer Matrix :
        A1.setText(" ");
        A2.setText(" ");
        A3.setText(" ");
        A4.setText(" ");
        A5.setText(" ");
        A6.setText(" ");
        A7.setText(" ");
        A8.setText(" ");
        A9.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        datatrans.postData();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GaussJordanMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaussJordanMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaussJordanMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaussJordanMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GaussJordanMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField A4;
    private javax.swing.JTextField A5;
    private javax.swing.JTextField A6;
    private javax.swing.JTextField A7;
    private javax.swing.JTextField A8;
    private javax.swing.JTextField A9;
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
    // End of variables declaration//GEN-END:variables
}
