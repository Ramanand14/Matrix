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
public class EchelonForm extends javax.swing.JFrame {
    
    FirstPage datatrans;
    public EchelonForm(FirstPage df) {
        initComponents();
        datatrans = df;
    }
    private EchelonForm()
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        E1 = new javax.swing.JTextField();
        E2 = new javax.swing.JTextField();
        E3 = new javax.swing.JTextField();
        E4 = new javax.swing.JTextField();
        E5 = new javax.swing.JTextField();
        E6 = new javax.swing.JTextField();
        E7 = new javax.swing.JTextField();
        E8 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        E9 = new javax.swing.JTextField();
        A7 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        A6 = new javax.swing.JTextField();
        A8 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A9 = new javax.swing.JTextField();
        A4 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();

        setTitle("Echelon Form");
        getContentPane().setLayout(null);

        jLabel1.setText("Enter Matrix Here  :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(51, 69, 139, 20);

        jLabel3.setText("Echelon Form       :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(51, 212, 138, 20);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(29, 487, 95, 29);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(279, 487, 69, 29);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(522, 487, 65, 29);
        getContentPane().add(E1);
        E1.setBounds(232, 66, 70, 26);
        getContentPane().add(E2);
        E2.setBounds(311, 66, 70, 26);
        getContentPane().add(E3);
        E3.setBounds(390, 66, 70, 26);
        getContentPane().add(E4);
        E4.setBounds(232, 101, 70, 26);
        getContentPane().add(E5);
        E5.setBounds(311, 101, 70, 26);
        getContentPane().add(E6);
        E6.setBounds(390, 101, 70, 26);
        getContentPane().add(E7);
        E7.setBounds(232, 143, 70, 26);
        getContentPane().add(E8);
        E8.setBounds(311, 143, 70, 26);
        getContentPane().add(A1);
        A1.setBounds(232, 218, 70, 26);
        getContentPane().add(E9);
        E9.setBounds(390, 143, 70, 26);
        getContentPane().add(A7);
        A7.setBounds(232, 288, 70, 26);
        getContentPane().add(A3);
        A3.setBounds(390, 218, 70, 26);
        getContentPane().add(A6);
        A6.setBounds(390, 253, 70, 26);
        getContentPane().add(A8);
        A8.setBounds(311, 288, 70, 26);
        getContentPane().add(A2);
        A2.setBounds(311, 218, 70, 26);
        getContentPane().add(A9);
        A9.setBounds(390, 288, 70, 26);
        getContentPane().add(A4);
        A4.setBounds(232, 253, 70, 26);
        getContentPane().add(A5);
        A5.setBounds(311, 253, 70, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        
        //Clear answer Matrix elements :
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[][] a = new int[3][3];
        int[][] t = new int[3][3];
        int[][] b = new int[3][3];
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
       
        //Assigning matrix elements :
        a[0][0] = a00;
        a[0][1] = a01;
        a[0][2] = a02;
        a[1][0] = a10;
        a[1][1] = a11;
        a[1][2] = a12;
        a[2][0] = a20;
        a[2][1] = a21;
        a[2][2] = a22;
        
        //Echelon method start :
        for (i = 0; i < 3; i++)
        {
         for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
         }
        }
        
        for (i=0 ;i<3;i++)
        {
          if (a[0][0]==0)
          {
           if(a[1][0]!=0)
           {
            for (i=0, x=1 ; i<=1 && x>=0; i++,x--)
	    {
              for(j=0;j<3;j++)
	      {
		t[i][j]=a[x][j];
	      }
	    }
            
	    for (i=0;i<=1;i++)
	    {
	       for(j=0;j<3;j++)
               {
		 a[i][j]=t[i][j];
	       }
	    }
           }
           
           else if(a[2][0]!=0)
           {
              for (i=0, x=2 ; i<=2 && x>=0; i++ , x--)
	      {
		for(j=0;j<3;j++)
		{
		   t[i][j]=a[x][j];
		}
		i++;
		x--;
	     }
            for (i=0;i<=2;i++)
	    {
		for(j=0;j<3;j++)
		{
		  a[i][j]=t[i][j];
		}
		i++;
	    }
           }
         }
          
         if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0)
         {
            for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	    {
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
         }
         
         if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0)
         {
            for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
        }
    }
        
        for (i = 0; i < 3; i++)
        {
         for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
         }
        }
        
//Check @ here:
row2:
{
      for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
        }
    }
    if(a[1][0]!=0)
    {
   for (i = 0; i < 1; i++)
      {
       if((b[i][0]>0 && b[i+1][0]>0)||(b[i][0]<0 && b[i+1][0]<0))
       {
        for (j = 0; j < 3; j++)
         {
            a[i+1][j]=((b[i+1][j] * b[0][0]) - (b[0][j]*b[i+1][0]));
       }
    }
       else
       {
           for (j = 0; j < 3; j++)
         {
            a[i+1][j]=((b[i+1][j] * b[0][0]) + (b[0][j]*b[i+1][0]));
         }
       }
     }
    } for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
        }
    }
    if (a[0][0]==0)
    {
           if(a[1][0]!=0)
           {
                for (i=0, x=1 ; i<=1 && x>=0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=0;i<=1;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
           }
           else if(a[2][0]!=0)
           {
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
		i++;
		x--;
	}
    for (i=0;i<=2;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
		i++;
	}
           }
}
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0)
    {
for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
    }
if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0)
{
for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
}
    if(a[2][0]!=0)
    {
   for (i = 0; i < 1; i++)
      {
       if((b[i][0]>0 && b[i+2][0]>0)||(b[i][0]<0 && b[i+2][0]<0))
       {
        for (j = 0; j < 3; j++)
         {
            a[i+2][j]=((b[i+2][j] * b[0][0]) - (b[0][j]*b[i+2][0]));
        }
    }
       else
       {
           for (j = 0; j < 3; j++)
         {
            a[i+2][j]=((b[i+2][j] * b[0][0]) + (b[0][j]*b[i+2][0]));
        }
       }
     }
    } for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
        }
    }
    if (a[0][0]==0){
           if(a[1][0]!=0)
           {
              for (i=0, x=1 ; i<=1 && x>=0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=0;i<=1;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
           }
           else if(a[2][0]!=0)
           {
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
		i++;
		x--;
	}
    for (i=0;i<=2;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
		i++;
	}
           }
}
if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0)
{
for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
}
if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0)
{
for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
}

row3:
{
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
        }
    }
    if(a[2][1]!=0)
    {
    for (i = 1; i < 2; i++)
      {
       if((b[i][1]>0 && b[i+1][1]>0)||(b[i][1]<0 && b[i+1][1]<0))
       {
        for (j = 0; j < 3; j++)
         {
            a[i+1][j]=((b[i+1][j] * b[1][1]) - (b[i][j]*b[2][1]));
        }
    }
       else
       {
           for (j = 0; j < 3; j++)
         {
            a[i+1][j]=((b[i+1][j] * b[1][1]) + (b[i][j]*b[2][1]));
        }
       }
    }
    }
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++)
         {
            b[i][j]=a[i][j];
        }
    }
    if (a[0][0]==0){
           if(a[1][0]!=0)
           {
               for (i=0, x=1 ; i<=1 && x>=0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=0;i<=1;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
           }
           else if(a[2][0]!=0)
           {
                 for (i=0, x=2 ; i<=2 && x>=0; i++ , x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
		i++;
		x--;
	}
    for (i=0;i<=2;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
		i++;
	}
           }
    }
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0)
    {
        for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
    }
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0)
    {
        for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
    }
    if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0)
    {
        for (i=1, x=2 ; i<=2 && x>0; i++,x--)
	{
		for(j=0;j<3;j++)
		{
			t[i][j]=a[x][j];
		}
	}
	for (i=1;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=t[i][j];
		}
	}
    }
        if(a[1][0]!=0)
        {
            break row2;
        }
        if(a[2][0]!=0 || a[2][1]!=0)
        {
            break row3;
        }
    }
}
    //End of echelon form :    

        //Assiginig Matrix elements :
        int c00 = a[0][0];
        int c01 = a[0][1];
        int c02 = a[0][2];
        int c10 = a[1][0];
        int c11 = a[1][1];
        int c12 = a[1][2];
        int c20 = a[2][0];
        int c21 = a[2][1];
        int c22 = a[2][2];

        //Diplay of Echelon Form :
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
            java.util.logging.Logger.getLogger(EchelonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EchelonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EchelonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EchelonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EchelonForm().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
