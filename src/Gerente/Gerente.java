/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerente;

import Principal.Inicio;
import java.awt.Color;

/**
 *
 * @author tepes
 */

/* mesas = mesas; mm = mejor mesero; platov = plato mas vendido; vt= ventas totales; fp = falta de producto*/
public class Gerente extends javax.swing.JFrame {

    /**
     * Creates new form meseros
     */
    
    /* Le asigno una imagen al frame, es decir, le agrego una imagen base al JFrame*/
    public Gerente() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
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
        jLabel2 = new javax.swing.JLabel();
        vtbuttom = new javax.swing.JButton();
        platovbuttom = new javax.swing.JButton();
        fpbuttom = new javax.swing.JButton();
        mmbuttom = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gerente");

        vtbuttom.setBackground(new java.awt.Color(71, 0, 130));
        vtbuttom.setForeground(new java.awt.Color(255, 255, 255));
        vtbuttom.setText("Ventas totales");
        vtbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtbuttomActionPerformed(evt);
            }
        });

        platovbuttom.setBackground(new java.awt.Color(240, 60, 46));
        platovbuttom.setForeground(new java.awt.Color(255, 255, 255));
        platovbuttom.setText("Plato mas vendido");
        platovbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platovbuttomActionPerformed(evt);
            }
        });

        fpbuttom.setBackground(new java.awt.Color(0, 51, 204));
        fpbuttom.setForeground(new java.awt.Color(255, 255, 255));
        fpbuttom.setText("Falta de producto");
        fpbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpbuttomActionPerformed(evt);
            }
        });

        mmbuttom.setBackground(new java.awt.Color(107, 101, 109));
        mmbuttom.setForeground(new java.awt.Color(255, 255, 255));
        mmbuttom.setText("Mejor mesero");
        mmbuttom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mmbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmbuttomActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mmbuttom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fpbuttom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vtbuttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(platovbuttom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(platovbuttom, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(vtbuttom, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(fpbuttom, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(mmbuttom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* El boton platov, abre el jframe de plato mas vendido y cierra este */
    private void platovbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platovbuttomActionPerformed
        // TODO add your handling code here:
        PlatoVendido a = new PlatoVendido();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_platovbuttomActionPerformed

    /* El boton vt, abre el jframe de ventas totales y cierra este */    
    private void vtbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtbuttomActionPerformed
        // TODO add your handling code here:
        VentasTotales a = new VentasTotales();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vtbuttomActionPerformed
    
    /*El boton fp, abre el jframe de falta de producto y cierra este */
    private void fpbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpbuttomActionPerformed
        // TODO add your handling code here:
        FaltaProducto a = new FaltaProducto();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fpbuttomActionPerformed

    /*El boton mm, abre el frame de mejor mesero y cierra este */
    private void mmbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmbuttomActionPerformed
        // TODO add your handling code here:
        MejorMesero a = new MejorMesero();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mmbuttomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Inicio a = new Inicio();
        a.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fpbuttom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mmbuttom;
    private javax.swing.JButton platovbuttom;
    private javax.swing.JButton vtbuttom;
    // End of variables declaration//GEN-END:variables
}
