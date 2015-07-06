/*
 * Copyright 2013 huangyuhui <huanghongxun2008@126.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.
 */
package org.jackhuang.hellominecraft.launcher.views;

import java.awt.Color;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import org.jackhuang.hellominecraft.C;
import org.jackhuang.hellominecraft.HMCLog;
import org.jackhuang.hellominecraft.launcher.settings.Settings;
import org.jackhuang.hellominecraft.utils.system.IOUtils;
import org.jackhuang.hellominecraft.utils.system.MessageBox;

/**
 *
 * @author huangyuhui
 */
public class LauncherSettingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form LancherSettingsPanel
     */
    public LauncherSettingsPanel() {
        initComponents();
        
        txtBackgroundPath.setText(Settings.getInstance().getBgpath());
        txtProxyHost.setText(Settings.getInstance().getProxyHost());
        txtProxyPort.setText(Settings.getInstance().getProxyPort());
        txtProxyUsername.setText(Settings.getInstance().getProxyUserName());
        txtProxyPassword.setText(Settings.getInstance().getProxyPassword());
        cboDownloadSource.setSelectedIndex(Settings.getInstance().getDownloadType());
        cboTheme.setSelectedIndex(Settings.getInstance().getTheme());
        chkEnableShadow.setSelected(Settings.getInstance().isEnableShadow());
        
        setBackground(Color.white);
        setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboDownloadSource = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnSelBackgroundPath = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtBackgroundPath = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCheckUpdate = new javax.swing.JButton();
        chkEnableShadow = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cboTheme = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtProxyHost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProxyPort = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProxyUsername = new javax.swing.JTextField();
        txtProxyPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        cboDownloadSource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mojang", "BMCLAPI(By bangbang93)" }));
        cboDownloadSource.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDownloadSourceItemStateChanged(evt);
            }
        });

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/jackhuang/hellominecraft/launcher/I18N"); // NOI18N
        jLabel4.setText(bundle.getString("launcher.about")); // NOI18N

        btnSelBackgroundPath.setText(bundle.getString("ui.button.explore")); // NOI18N
        btnSelBackgroundPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelBackgroundPathActionPerformed(evt);
            }
        });

        jLabel14.setText(bundle.getString("launcher.background_location")); // NOI18N
        jLabel14.setToolTipText("");

        txtBackgroundPath.setToolTipText(bundle.getString("launcher.background_tooltip")); // NOI18N
        txtBackgroundPath.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBackgroundPathFocusLost(evt);
            }
        });

        jLabel7.setText(bundle.getString("launcher.download_source")); // NOI18N

        btnCheckUpdate.setText(bundle.getString("launcher.update_launcher")); // NOI18N
        btnCheckUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckUpdateActionPerformed(evt);
            }
        });

        chkEnableShadow.setText(bundle.getString("launcher.enable_shadow")); // NOI18N
        chkEnableShadow.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                chkEnableShadowFocusLost(evt);
            }
        });

        jLabel1.setText(bundle.getString("launcher.theme")); // NOI18N

        cboTheme.setModel(new DefaultComboBoxModel(new String[]{C.i18n("color.blue"),C.i18n("color.green"),C.i18n("color.purple"),C.i18n("color.dark_blue"),C.i18n("color.orange"),C.i18n("color.red")}));
        cboTheme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThemeItemStateChanged(evt);
            }
        });

        jLabel2.setText(bundle.getString("launcher.proxy")); // NOI18N

        txtProxyHost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProxyHostFocusLost(evt);
            }
        });

        jLabel3.setText(bundle.getString("proxy.host")); // NOI18N

        txtProxyPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProxyPortFocusLost(evt);
            }
        });

        jLabel5.setText(bundle.getString("proxy.port")); // NOI18N

        jLabel6.setText(bundle.getString("proxy.username")); // NOI18N

        txtProxyUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProxyUsernameFocusLost(evt);
            }
        });

        txtProxyPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProxyPasswordFocusLost(evt);
            }
        });

        jLabel8.setText(bundle.getString("proxy.password")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBackgroundPath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelBackgroundPath))
                            .addComponent(cboDownloadSource, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTheme, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProxyHost, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProxyPort, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProxyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProxyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkEnableShadow)
                            .addComponent(btnCheckUpdate))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnSelBackgroundPath, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBackgroundPath, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboDownloadSource, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProxyHost, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtProxyPort, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtProxyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtProxyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkEnableShadow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboDownloadSourceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDownloadSourceItemStateChanged
        Settings.getInstance().setDownloadType(cboDownloadSource.getSelectedIndex());
    }//GEN-LAST:event_cboDownloadSourceItemStateChanged

    private void btnSelBackgroundPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelBackgroundPathActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setDialogTitle(C.i18n("launcher.choose_bgpath"));
        fc.setMultiSelectionEnabled(false);
        fc.showOpenDialog(this);
        if (fc.getSelectedFile() == null) {
            return;
        }
        try {
            String path = fc.getSelectedFile().getCanonicalPath();
            path = IOUtils.removeLastSeparator(path);
            txtBackgroundPath.setText(path);
            Settings.getInstance().setBgpath(path);
            MainFrame.instance.loadBackground();
        } catch (IOException e) {
            HMCLog.warn("Failed to set background path.", e);
            MessageBox.Show(C.i18n("ui.label.failed_set") + e.getMessage());
        }
    }//GEN-LAST:event_btnSelBackgroundPathActionPerformed

    private void txtBackgroundPathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBackgroundPathFocusLost
        Settings.getInstance().setBgpath(txtBackgroundPath.getText());
        MainFrame.instance.loadBackground();
    }//GEN-LAST:event_txtBackgroundPathFocusLost

    private void btnCheckUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckUpdateActionPerformed
        Settings.UPDATE_CHECKER.process(true);
    }//GEN-LAST:event_btnCheckUpdateActionPerformed

    private void chkEnableShadowFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkEnableShadowFocusLost
        Settings.getInstance().setEnableShadow(chkEnableShadow.isSelected());
    }//GEN-LAST:event_chkEnableShadowFocusLost

    private void cboThemeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThemeItemStateChanged
        Settings.getInstance().setTheme(cboTheme.getSelectedIndex());
        if(MainFrame.instance != null)
            MainFrame.instance.reloadColor();
    }//GEN-LAST:event_cboThemeItemStateChanged

    private void txtProxyHostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProxyHostFocusLost
        Settings.getInstance().setProxyHost(txtProxyHost.getText());
    }//GEN-LAST:event_txtProxyHostFocusLost

    private void txtProxyPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProxyPortFocusLost
        Settings.getInstance().setProxyPort(txtProxyPort.getText());
    }//GEN-LAST:event_txtProxyPortFocusLost

    private void txtProxyUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProxyUsernameFocusLost
        Settings.getInstance().setProxyUserName(txtProxyUsername.getText());
    }//GEN-LAST:event_txtProxyUsernameFocusLost

    private void txtProxyPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProxyPasswordFocusLost
        Settings.getInstance().setProxyPassword(txtProxyPassword.getText());
    }//GEN-LAST:event_txtProxyPasswordFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckUpdate;
    private javax.swing.JButton btnSelBackgroundPath;
    private javax.swing.JComboBox cboDownloadSource;
    private javax.swing.JComboBox cboTheme;
    private javax.swing.JCheckBox chkEnableShadow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBackgroundPath;
    private javax.swing.JTextField txtProxyHost;
    private javax.swing.JTextField txtProxyPassword;
    private javax.swing.JTextField txtProxyPort;
    private javax.swing.JTextField txtProxyUsername;
    // End of variables declaration//GEN-END:variables
}
