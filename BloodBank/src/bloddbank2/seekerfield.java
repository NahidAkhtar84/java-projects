/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloddbank2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class seekerfield extends javax.swing.JFrame {
Connection conn = null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    /**
     * Creates new form seekerfield
     */
    public seekerfield() {
        initComponents();
        
 this.setLocationRelativeTo(null);
 conn = connectjdbc.ConnecrDb();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jlocation = new javax.swing.JTextField();
        jbloodgrp = new javax.swing.JTextField();
        jbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchtable.setBackground(new java.awt.Color(255, 102, 102));
        searchtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchtable.setForeground(new java.awt.Color(255, 255, 255));
        searchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(searchtable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 700, 370));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Here");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 154, 140, 30));

        jlocation.setFont(new java.awt.Font("Siyam Rupali", 1, 14)); // NOI18N
        jlocation.setForeground(new java.awt.Color(255, 0, 0));
        jlocation.setText("Location");
        jPanel1.add(jlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, 30));

        jbloodgrp.setFont(new java.awt.Font("Siyam Rupali", 1, 14)); // NOI18N
        jbloodgrp.setForeground(new java.awt.Color(255, 0, 0));
        jbloodgrp.setText("Blood Group");
        jPanel1.add(jbloodgrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 30));

        jbtn.setBackground(new java.awt.Color(153, 255, 153));
        jbtn.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        jbtn.setForeground(new java.awt.Color(255, 0, 0));
        jbtn.setText("SEARCH");
        jbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnMouseClicked(evt);
            }
        });
        jbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, 40));

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("HOME");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 50, 20));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Go Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ggggg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnActionPerformed

    private void jbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMouseClicked
        // TODO add your handling code here:
        String a=jbloodgrp.getText();
        String b=jlocation.getText();
        System.out.println(a);
        System.out.println(b);
        if(jbloodgrp.getText() !=null && jlocation.getText()!=null){
         String query1 = ("SELECT DonorName,DonorBloodGroup,DonorContact,SecondaryContact,DonorEmail FROM donor Where DonorBloodGroup=? and DonorLocation=?");
        
         try{
          pst = conn.prepareStatement(query1);  
          pst.setString(1,jbloodgrp.getText());
          pst.setString(2,jlocation.getText());
          rs = pst.executeQuery();
         searchtable.setModel(DbUtils.resultSetToTableModel(rs));   
      }
               catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
        }
        if(jbloodgrp.getText() !=null && jlocation.getText().toString().equals("0") ){
            System.out.println("got in !");
            String query2 = ("SELECT DonorName,DonorBloodGroup,DonorContact,SecondaryContact,DonorEmail FROM donor Where DonorBloodGroup=?");
        
         try{
          pst = conn.prepareStatement(query2);  
          pst.setString(1,jbloodgrp.getText());
          //pst.setString(2,jlocation.getText());
          rs = pst.executeQuery();
         searchtable.setModel(DbUtils.resultSetToTableModel(rs));   
      }
               catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
        }
        

 if(jbloodgrp.getText().toString().equals("0")  && jlocation.getText()!=null ){
            System.out.println("got in 2 !");
            String query3 = ("SELECT DonorName,DonorBloodGroup,DonorContact,SecondaryContact,DonorEmail FROM donor Where DonorLocation=?");
        
         try{
          pst = conn.prepareStatement(query3);  
         // pst.setString(1,jbloodgrp.getText());
          pst.setString(1,jlocation.getText());
          rs = pst.executeQuery();
         searchtable.setModel(DbUtils.resultSetToTableModel(rs));   
      }
               catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
        }
        
        
    }//GEN-LAST:event_jbtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        welcomepage hmm = new welcomepage();
        hmm.setVisible(true);
        hmm.pack();
        hmm.setLocationRelativeTo(null);
        hmm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        SeekerLogin hm2 = new SeekerLogin();
        hm2.setVisible(true);
        hm2.pack();
        hm2.setLocationRelativeTo(null);
        hm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(seekerfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seekerfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seekerfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seekerfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seekerfield().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jbloodgrp;
    private javax.swing.JButton jbtn;
    private javax.swing.JTextField jlocation;
    private javax.swing.JTable searchtable;
    // End of variables declaration//GEN-END:variables
}