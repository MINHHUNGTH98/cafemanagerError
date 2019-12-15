/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Models.Connect;
import controller.BillController;
import controller.FoodController;
import controller.SearchController;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Find extends javax.swing.JFrame {

    /**
     * Creates new form Find
     */
    DefaultTableModel tbnFood = new DefaultTableModel();
    DefaultTableModel tbnBill = new DefaultTableModel();
    DefaultTableModel tbn_new = new DefaultTableModel();
    FoodController fc = new FoodController();
    BillController bc = new BillController();

    public Find() {
        initComponents();
        fc.loadData(tbnFood, tbFood, txtIdFood, tfUnitFood, tfNameFood, cbCategory);
        fc.loadComobox(cbCategory);
        bc.loadDataBill(tbnBill, tbBill);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JTabbedPane();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFood = new javax.swing.JTable();
        tfFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        txtIdFood = new javax.swing.JTextField();
        tfNameFood = new javax.swing.JTextField();
        tfUnitFood = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox<>();
        txtpnId = new javax.swing.JTextField();
        txtpnTn = new javax.swing.JTextField();
        txtpnDanhMc = new javax.swing.JTextField();
        txtpnnGi = new javax.swing.JTextField();
        btnAddFood = new javax.swing.JButton();
        btnEditFood = new javax.swing.JButton();
        btnDeleteFood = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        panel_1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBill = new javax.swing.JTable();
        tfFindBill = new javax.swing.JTextField();
        btnFindBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPane.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        panel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        tbFood.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbFood);

        tfFind.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFindActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(0, 255, 204));
        btnFind.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnFind.setText("Tìm");
        btnFind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtIdFood.setEditable(false);
        txtIdFood.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtIdFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFoodActionPerformed(evt);
            }
        });

        tfNameFood.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfNameFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameFoodActionPerformed(evt);
            }
        });

        tfUnitFood.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfUnitFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnitFoodActionPerformed(evt);
            }
        });

        cbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });

        txtpnId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtpnId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpnId.setText("Mã món");
        txtpnId.setBorder(null);
        txtpnId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtpnId.setEnabled(false);

        txtpnTn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtpnTn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpnTn.setText("Tên món");
        txtpnTn.setBorder(null);
        txtpnTn.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtpnTn.setEnabled(false);
        txtpnTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnTnActionPerformed(evt);
            }
        });

        txtpnDanhMc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtpnDanhMc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpnDanhMc.setText("Loại món");
        txtpnDanhMc.setBorder(null);
        txtpnDanhMc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtpnDanhMc.setEnabled(false);

        txtpnnGi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtpnnGi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpnnGi.setText("Đơn giá");
        txtpnnGi.setBorder(null);
        txtpnnGi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtpnnGi.setEnabled(false);

        btnAddFood.setBackground(new java.awt.Color(0, 255, 204));
        btnAddFood.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnAddFood.setText("Thêm món");
        btnAddFood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });

        btnEditFood.setBackground(new java.awt.Color(0, 255, 204));
        btnEditFood.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnEditFood.setText("Sửa món");
        btnEditFood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnEditFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditFoodActionPerformed(evt);
            }
        });

        btnDeleteFood.setBackground(new java.awt.Color(0, 255, 204));
        btnDeleteFood.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnDeleteFood.setText("Xóa món");
        btnDeleteFood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnDeleteFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFoodActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 255, 204));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnRefresh.setText("Làm mới");
        btnRefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditFood, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnDeleteFood, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(327, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(tfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(txtpnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdFood, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpnTn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpnDanhMc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpnnGi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNameFood)
                                    .addComponent(tfUnitFood, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteFood, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditFood, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNameFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpnTn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpnDanhMc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpnnGi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUnitFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        contentPane.addTab("Món", panel);

        tbBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(tbBill);

        tfFindBill.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfFindBill.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfFindBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFindBillActionPerformed(evt);
            }
        });

        btnFindBill.setBackground(new java.awt.Color(0, 255, 204));
        btnFindBill.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnFindBill.setText("Tìm");
        btnFindBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnFindBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addComponent(tfFindBill, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnFindBill, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFindBill)
                    .addComponent(btnFindBill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        contentPane.addTab("Hóa đơn", panel_1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpnTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnTnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnTnActionPerformed

    private void tfUnitFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnitFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUnitFoodActionPerformed

    private void tfNameFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameFoodActionPerformed

    private void txtIdFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFoodActionPerformed

    private void tfFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFindActionPerformed

    private void tfFindBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFindBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFindBillActionPerformed

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoryActionPerformed

    private void btnEditFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditFoodActionPerformed
        // TODO add your handling code here:
        String FoodName = tfNameFood.getText();
        String Id = txtIdFood.getText();
        String Price = tfUnitFood.getText();
        String NameCategory = cbCategory.getSelectedItem().toString();
        fc.EditFood(Id, FoodName, NameCategory, Price);
        tbnFood.setRowCount(0);
        fc.loadData(tbnFood, tbFood, txtIdFood, tfUnitFood, tfNameFood, cbCategory);
    }//GEN-LAST:event_btnEditFoodActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        SearchController sc = new SearchController();
        String keyword = tfFind.getText();
        String NameCategory = cbCategory.getSelectedItem().toString();
        if (keyword.equals("")) {
            sc.SearchFoodCategory(NameCategory, tbnFood, tbFood);
        }else
            sc.SearchFoodName(keyword, tbnFood, tbFood);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
        // TODO add your handling code here:
        FoodController fc = new FoodController();
        String FoodName = tfNameFood.getText();
        String Price = tfUnitFood.getText();
        String NameCategory = cbCategory.getSelectedItem().toString();
        int check = fc.AddFood(FoodName, NameCategory, Price);
        if (check > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            tbnFood.setRowCount(0);
            fc.loadData(tbnFood, tbFood, txtIdFood, tfUnitFood, tfNameFood, cbCategory);
        } else {
            JOptionPane.showMessageDialog(this, "Kiểm tra nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnAddFoodActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        tbnFood = tbn_new;
        fc.loadData(tbnFood, tbFood, txtIdFood, tfUnitFood, tfNameFood, cbCategory);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFoodActionPerformed
        // TODO add your handling code here:
        try {
            String Id = tbFood.getValueAt(tbFood.getSelectedRow(), 0).toString();
            if (JOptionPane.showConfirmDialog(this, "Xóa món ăn?", "Cảnh báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                fc.DeleteFood(Id);
                tbnFood.setRowCount(0);
                fc.loadData(tbnFood, tbFood, txtIdFood, tfUnitFood, tfNameFood, cbCategory);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chưa chọn món ăn cần xóa !");
        }
    }//GEN-LAST:event_btnDeleteFoodActionPerformed

    private void btnFindBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindBillActionPerformed
        // TODO add your handling code here:
        SearchController sc = new SearchController();
        String keyword = tfFindBill.getText();
        sc.SearchBillUserStaff(keyword, tbnBill, tbBill);
    }//GEN-LAST:event_btnFindBillActionPerformed

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
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Find().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnDeleteFood;
    private javax.swing.JButton btnEditFood;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFindBill;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JTabbedPane contentPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_1;
    private javax.swing.JTable tbBill;
    private javax.swing.JTable tbFood;
    private javax.swing.JTextField tfFind;
    private javax.swing.JTextField tfFindBill;
    private javax.swing.JTextField tfNameFood;
    private javax.swing.JTextField tfUnitFood;
    private javax.swing.JTextField txtIdFood;
    private javax.swing.JTextField txtpnDanhMc;
    private javax.swing.JTextField txtpnId;
    private javax.swing.JTextField txtpnTn;
    private javax.swing.JTextField txtpnnGi;
    // End of variables declaration//GEN-END:variables
}
