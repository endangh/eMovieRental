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

import com.mysql.jdbc.Driver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import usu.rental.film.data.AdminChiper;
import usu.util.StringUtil;
import usu.widget.Form;
import usu.widget.util.WidgetUtilities;

/**
 *
 * @author  usu
 */
public class AdminLogIn extends Form {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;
    private Properties prop;
    private StringBuilder url;
    private AdminForm form;

    /* Creates new form BeanForm
     * @throws java.io.IOException 
     */
    public AdminLogIn() throws IOException {
        
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/icon.png")).getImage());
        
        initVariables();
        initComponents();
    }

    public Connection isAdmin() {
        try {
            new Driver();
            Connection c = DriverManager.getConnection(url.toString(), textUsername.getText(), StringUtil.convertToString(textPassword.getPassword()));
            return c;
        } catch (SQLException ex) {
            return null;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glasspane = new usu.widget.GlassPane();
        about = new usu.rental.film.widget.About();
        usu.widget.glass.ViewPortTransparan viewPortTransparan1 = new usu.widget.glass.ViewPortTransparan();
        traceArea = new usu.rental.film.widget.TextArea();
        usu.rental.film.widget.Panel panelGradient = new usu.rental.film.widget.Panel();
        usu.rental.film.widget.Label label2 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Button buttonTentang = new usu.rental.film.widget.Button();
        usu.rental.film.widget.Label label3 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label4 = new usu.rental.film.widget.Label();
        textUsername = new usu.rental.film.widget.TextBox();
        textPassword = new usu.rental.film.widget.PasswordBox();
        usu.rental.film.widget.Button buttonMasuk = new usu.rental.film.widget.Button();
        usu.rental.film.widget.Button buttonReset = new usu.rental.film.widget.Button();
        usu.rental.film.widget.Label label5 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label1 = new usu.rental.film.widget.Label();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();

        setGlassPane(glasspane);
        getGlassPane().setVisible(true);
        glasspane.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 6));

        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        viewPortTransparan1.setView(traceArea);

        traceArea.setColumns(20);
        traceArea.setEditable(false);
        traceArea.setRows(5);

        setTitle("Administrator");
        setAnimationHide(usu.widget.constan.Animation.HIDE_TO_BOTTOM);
        setAnimationShow(usu.widget.constan.Animation.SHOW_FROM_TOP);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label2.setText("e'MovieRental : Admin");
        label2.setFont(new java.awt.Font("Tahoma", 1, 24));

        buttonTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/tentang.png"))); // NOI18N
        buttonTentang.setMnemonic('T');
        buttonTentang.setText("tentang");
        buttonTentang.setToolTipText("");
        buttonTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTentangActionPerformed(evt);
            }
        });

        label3.setDisplayedMnemonic('U');
        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("username :");

        label4.setDisplayedMnemonic('P');
        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("password :");

        textUsername.setToolTipText("");
        textUsername.setFocusAccelerator('U');
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        textPassword.setToolTipText("");
        textPassword.setEchoChar('#');
        textPassword.setFocusAccelerator('P');
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        buttonMasuk.setMnemonic('M');
        buttonMasuk.setText("masuk");
        buttonMasuk.setToolTipText("");
        buttonMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMasukActionPerformed(evt);
            }
        });

        buttonReset.setMnemonic('R');
        buttonReset.setText("reset");
        buttonReset.setToolTipText("");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        label5.setText("by eko kurniawan khannedy");

        label1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label1.setIconReflec(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/admin.png"))); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setViewport(viewPortTransparan1);

        javax.swing.GroupLayout panelGradientLayout = new javax.swing.GroupLayout(panelGradient);
        panelGradient.setLayout(panelGradientLayout);
        panelGradientLayout.setHorizontalGroup(
            panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradientLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradientLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGradientLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradientLayout.createSequentialGroup()
                                        .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                            .addComponent(textUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                        .addGap(0, 0, 0))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradientLayout.createSequentialGroup()
                                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelGradientLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(buttonTentang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelGradientLayout.setVerticalGroup(
            panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradientLayout.createSequentialGroup()
                        .addComponent(buttonTentang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGradientLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(panelGradient, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-568)/2, (screenSize.height-398)/2, 568, 398);
    }// </editor-fold>//GEN-END:initComponents

    private void initVariables() throws IOException {
        form = new AdminForm();

        FileInputStream in = new FileInputStream("setting\\database.xml");

        prop = new Properties();
        prop.loadFromXML(in);

        url = new StringBuilder();
        url.append("jdbc:mysql://");
        url.append(prop.getProperty("HOST"));
        url.append(":");
        url.append(prop.getProperty("PORT"));
        url.append("/");
        url.append(prop.getProperty("DATABASE"));
    }

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        textPassword.requestFocusInWindow();
}//GEN-LAST:event_textUsernameActionPerformed

    private void buttonTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTentangActionPerformed
        glasspane.showComponent(about);
    }//GEN-LAST:event_buttonTentangActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        textPassword.setText("");
        textUsername.setText("");
        textUsername.requestFocusInWindow();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMasukActionPerformed
        if (isAdmin() != null) {
            try {
                JOptionPane.showMessageDialog(this, "koneksi berhasil");
                setVisible(false);
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("setting\\eMR.dat"));
                output.writeObject(new AdminChiper(StringUtil.convertToCharArray(textUsername.getText()), textPassword.getPassword(), "NESIAOKTIANA"));
                output.close();
                form.setAdmin(new AdminChiper(StringUtil.convertToCharArray(textUsername.getText()), textPassword.getPassword(), "NESIAOKTIANA"));
                form.setConnection(isAdmin());
                form.setVisible(true);
            } catch (IOException ex) {
                WidgetUtilities.showErrorMessage(this, ex.getMessage());
                System.exit(1);
            }
        } else {
            traceArea.setText("Koneksi gagal, cek kembali username dan password anda. Untuk masuk" +
                    " ke form utama gunakan username dan password yang sama dengan username dan password" +
                    " untuk koneksi ke MySQL");
        }
    }//GEN-LAST:event_buttonMasukActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        buttonMasukActionPerformed(evt);
    }//GEN-LAST:event_textPasswordActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        glasspane.hideComponent();
    }//GEN-LAST:event_aboutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        textUsername.requestFocusInWindow();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    usu.rental.film.widget.About about;
    usu.widget.GlassPane glasspane;
    usu.rental.film.widget.PasswordBox textPassword;
    usu.rental.film.widget.TextBox textUsername;
    usu.rental.film.widget.TextArea traceArea;
    // End of variables declaration//GEN-END:variables
}
