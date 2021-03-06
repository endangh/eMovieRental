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

/**
 *
 * @author  usu
 */
public class MenuOperator extends javax.swing.JPanel {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    /** Creates new form MenuOperator */
    public MenuOperator() {
        initComponents();
    }

    public void addActionListenerAktivitas(ActionListener l) {
        aktivitas.addActionListener(l);
    }

    public void addActionListenerOperator(ActionListener l) {
        operator.addActionListener(l);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operator = new usu.rental.film.widget.ButtonBig();
        aktivitas = new usu.rental.film.widget.ButtonBig();

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        operator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/operator2.png"))); // NOI18N
        operator.setMnemonic('O');
        operator.setText("operator");
        add(operator, new java.awt.GridBagConstraints());

        aktivitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/aktivitas.png"))); // NOI18N
        aktivitas.setMnemonic('A');
        aktivitas.setText("aktivitas operator");
        add(aktivitas, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.rental.film.widget.ButtonBig aktivitas;
    private usu.rental.film.widget.ButtonBig operator;
    // End of variables declaration//GEN-END:variables
}
