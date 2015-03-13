/*
 * DILARANG MENGHAPUS ATAU MENGEDIT COPYRIGHT INI.
 * 
 * Copyright 2008 echo.khannedy@gmail.com. 
 * All rights reserved.
 * 
 * Semua isi dalam file ini adalah hak milik dari echo.khannedy@gmail.com
 * Anda tak diperkenankan untuk menggunakan file atau mengubah file
 * ini kecuali anda tidak menghapus atau merubah lisence ini.
 * 
 * File ini dibuat menggunakan :
 * IDE        : NetBeans
 * NoteBook   : Acer Aspire 5920G
 * OS         : Windows Vista
 * Java       : Java 1.6
 * 
 */
package usu.rental.film.admin;

import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author  usu
 */
public class PanelSaringPeminjaman extends javax.swing.JPanel {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    /** Creates new form PanelSaringPeminjaman */
    public PanelSaringPeminjaman() {
        initComponents();
    }

    public void addActionListenerBatal(ActionListener l) {
        buttonBatal.addActionListener(l);
    }

    public void addActionListenerSaring(ActionListener l) {
        buttonSaring.addActionListener(l);
    }

    public String getIdAnggota() {
        if (textIdAnggota.isEnabled()) {
            return textIdAnggota.getText();
        }
        return null;
    }

    public String getIdOperator() {
        if (textIdOperator.isEnabled()) {
            return textIdOperator.getText();
        }
        return null;
    }

    public String getIdFilm() {
        if (textIdFilm.isEnabled()) {
            return textIdFilm.getText();
        }
        return null;
    }

    public Boolean getStatus() {
        if (textStatus.isEnabled()) {
            return new Boolean(textStatus.isSelected());
        }
        return null;
    }

    public java.sql.Date getTanggalDari() {
        if (textTanggalDari.isEnabled()) {
            return new java.sql.Date(((Date) textTanggalDari.getValue()).getTime());
        }
        return null;
    }

    public java.sql.Date getTanggalSampai() {
        if (textTanggalSampai.isEnabled()) {
            return new java.sql.Date(((Date) textTanggalSampai.getValue()).getTime());
        }
        return null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        usu.widget.glass.PanelGlass panelGlass1 = new usu.widget.glass.PanelGlass();
        usu.rental.film.widget.Label label3 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label4 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label5 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label6 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label7 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label8 = new usu.rental.film.widget.Label();
        textIdAnggota = new usu.rental.film.widget.TextBox();
        textIdOperator = new usu.rental.film.widget.TextBox();
        textIdFilm = new usu.rental.film.widget.TextBox();
        textTanggalDari = new usu.rental.film.widget.FormatterBox();
        textTanggalSampai = new usu.rental.film.widget.FormatterBox();
        textStatus = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox3 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox4 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox5 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox6 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox7 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox8 = new javax.swing.JCheckBox();
        buttonSaring = new usu.rental.film.widget.Button();
        buttonBatal = new usu.rental.film.widget.Button();

        setOpaque(false);

        panelGlass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelGlass1.setOpaqueImage(false);
        panelGlass1.setRound(false);

        label3.setDisplayedMnemonic('A');
        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("id anggota :");

        label4.setDisplayedMnemonic('O');
        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("id operator :");

        label5.setDisplayedMnemonic('F');
        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("id film :");

        label6.setDisplayedMnemonic('L');
        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("tanggal pinjam dari :");

        label7.setDisplayedMnemonic('J');
        label7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label7.setText("tanggal pinjam sampai :");

        label8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label8.setText("status :");

        textIdAnggota.setFocusAccelerator('A');
        textIdAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdAnggotaActionPerformed(evt);
            }
        });

        textIdOperator.setFocusAccelerator('O');
        textIdOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdOperatorActionPerformed(evt);
            }
        });

        textIdFilm.setFocusAccelerator('F');
        textIdFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdFilmActionPerformed(evt);
            }
        });

        textTanggalDari.setFocusAccelerator('L');
        textTanggalDari.setValue(new java.util.Date());
        textTanggalDari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTanggalDariActionPerformed(evt);
            }
        });

        textTanggalSampai.setFocusAccelerator('J');
        textTanggalSampai.setValue(new java.util.Date());
        textTanggalSampai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTanggalSampaiActionPerformed(evt);
            }
        });

        textStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textStatus.setForeground(new java.awt.Color(255, 255, 255));
        textStatus.setMnemonic('N');
        textStatus.setSelected(true);
        textStatus.setText("telah dikembalikan");
        textStatus.setOpaque(false);
        textStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                textStatusItemStateChanged(evt);
            }
        });

        jCheckBox3.setFocusable(false);
        jCheckBox3.setOpaque(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textIdAnggota, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox3, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox4.setFocusable(false);
        jCheckBox4.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textIdOperator, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox4, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox5.setFocusable(false);
        jCheckBox5.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textIdFilm, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox5, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox6.setFocusable(false);
        jCheckBox6.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textTanggalDari, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox6, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox7.setFocusable(false);
        jCheckBox7.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textTanggalSampai, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox7, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox8.setFocusable(false);
        jCheckBox8.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textStatus, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox8, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(textTanggalSampai, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(textTanggalDari, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(textIdFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(textIdOperator, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(textIdAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addContainerGap())
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3)
                    .addComponent(textIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4)
                    .addComponent(textIdOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5)
                    .addComponent(textIdFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6)
                    .addComponent(textTanggalDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7)
                    .addComponent(textTanggalSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8)
                    .addComponent(textStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonSaring.setMnemonic('G');
        buttonSaring.setText("saring");

        buttonBatal.setMnemonic('B');
        buttonBatal.setText("batal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSaring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSaring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
    private void textStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_textStatusItemStateChanged
        if (textStatus.isSelected()) {
            textStatus.setText("telah dikembalikan");
        } else {
            textStatus.setText("belum dikembalikan");
        }
    }//GEN-LAST:event_textStatusItemStateChanged

private void textIdAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdAnggotaActionPerformed
    textIdOperator.requestFocusInWindow();
}//GEN-LAST:event_textIdAnggotaActionPerformed

private void textIdOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdOperatorActionPerformed
    textIdFilm.requestFocusInWindow();
}//GEN-LAST:event_textIdOperatorActionPerformed

private void textIdFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdFilmActionPerformed
    textTanggalDari.requestFocusInWindow();
}//GEN-LAST:event_textIdFilmActionPerformed

private void textTanggalDariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTanggalDariActionPerformed
    textTanggalSampai.requestFocusInWindow();
}//GEN-LAST:event_textTanggalDariActionPerformed

private void textTanggalSampaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTanggalSampaiActionPerformed
    textStatus.requestFocusInWindow();
}//GEN-LAST:event_textTanggalSampaiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    usu.rental.film.widget.Button buttonBatal;
    usu.rental.film.widget.Button buttonSaring;
    usu.rental.film.widget.TextBox textIdAnggota;
    usu.rental.film.widget.TextBox textIdFilm;
    usu.rental.film.widget.TextBox textIdOperator;
    javax.swing.JCheckBox textStatus;
    usu.rental.film.widget.FormatterBox textTanggalDari;
    usu.rental.film.widget.FormatterBox textTanggalSampai;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
