/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DataManager;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.ColorModel;
import models.UserModel;

/**
 *
 * @author Lau
 */
public class SystemMainView extends javax.swing.JFrame {

    public SystemMainView() {
        initComponents();
        centerWindow();
        DataManager datamanager = DataManager.getInstance();
        UserModel userLogin = datamanager.getUserLogin();
        if (userLogin.getTipoUsuario() == "SUPERVISOR_DE_LINEA") {
            consultarLineaBtn.setEnabled(true);
            creatOPBtn.setEnabled(true);
        }
        if (userLogin.getTipoUsuario() == "ADMINISTRADOR") {
            gestionarModelosBtn.setEnabled(true);
            gestionarColoresBtn.setEnabled(true);
        }
        if (userLogin.getTipoUsuario() == "SUPERVISOR_DE_CALIDAD") {
            consultarLineaBtn.setEnabled(true);
        }
    }

    private void centerWindow() {
        // Obtener el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular las coordenadas para centrar la ventana
        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        // Establecer la ubicación de la ventana en el centro de la pantalla
        this.setLocation(posX, posY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gestionarColoresBtn = new javax.swing.JButton();
        creatOPBtn = new javax.swing.JButton();
        gestionarModelosBtn = new javax.swing.JButton();
        consultarLineaBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Bienvenido al sistema");
        jLabel1.setToolTipText("");

        gestionarColoresBtn.setBackground(new java.awt.Color(153, 204, 255));
        gestionarColoresBtn.setForeground(new java.awt.Color(38, 38, 38));
        gestionarColoresBtn.setText("GESTIONAR COLORES");
        gestionarColoresBtn.setEnabled(false);
        gestionarColoresBtn.setMaximumSize(new java.awt.Dimension(109, 29));
        gestionarColoresBtn.setMinimumSize(new java.awt.Dimension(109, 29));
        gestionarColoresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarColoresBtnActionPerformed(evt);
            }
        });

        creatOPBtn.setBackground(new java.awt.Color(153, 204, 255));
        creatOPBtn.setForeground(new java.awt.Color(38, 38, 38));
        creatOPBtn.setText("CREAR OP");
        creatOPBtn.setEnabled(false);
        creatOPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatOPBtnActionPerformed(evt);
            }
        });

        gestionarModelosBtn.setBackground(new java.awt.Color(153, 204, 255));
        gestionarModelosBtn.setForeground(new java.awt.Color(38, 38, 38));
        gestionarModelosBtn.setText("GESTIONAR MODELOS");
        gestionarModelosBtn.setEnabled(false);
        gestionarModelosBtn.setMaximumSize(new java.awt.Dimension(109, 29));
        gestionarModelosBtn.setMinimumSize(new java.awt.Dimension(109, 29));
        gestionarModelosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarModelosBtnActionPerformed(evt);
            }
        });

        consultarLineaBtn.setBackground(new java.awt.Color(153, 204, 255));
        consultarLineaBtn.setForeground(new java.awt.Color(38, 38, 38));
        consultarLineaBtn.setText("CONSULTAR LINEAS");
        consultarLineaBtn.setEnabled(false);
        consultarLineaBtn.setMaximumSize(new java.awt.Dimension(109, 29));
        consultarLineaBtn.setMinimumSize(new java.awt.Dimension(109, 29));
        consultarLineaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarLineaBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(gestionarColoresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creatOPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionarModelosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarLineaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(creatOPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarLineaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gestionarModelosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gestionarColoresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarColoresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarColoresBtnActionPerformed
        ManageColorsView manageColorView = new ManageColorsView();
        manageColorView.setVisible(true);
    }//GEN-LAST:event_gestionarColoresBtnActionPerformed

    private void creatOPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatOPBtnActionPerformed
        CreateOPView createOPView = new CreateOPView();
        createOPView.setVisible(true);
    }//GEN-LAST:event_creatOPBtnActionPerformed

    private void gestionarModelosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarModelosBtnActionPerformed
        ManageModelsView manageModelsView = new ManageModelsView();
        manageModelsView.setVisible(true);
    }//GEN-LAST:event_gestionarModelosBtnActionPerformed

    private void consultarLineaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarLineaBtnActionPerformed
        ConsultLinesView consultLines = new ConsultLinesView();
        consultLines.setVisible(true);
    }//GEN-LAST:event_consultarLineaBtnActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_3) {
            ManageModelsView manageModelsView = new ManageModelsView();
            manageModelsView.setVisible(true);
        }
        if (evt.getKeyCode() == KeyEvent.VK_4) {
            ManageColorsView manageColorView = new ManageColorsView();
            manageColorView.setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarLineaBtn;
    private javax.swing.JButton creatOPBtn;
    private javax.swing.JButton gestionarColoresBtn;
    private javax.swing.JButton gestionarModelosBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
