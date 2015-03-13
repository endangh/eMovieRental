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
package usu.rental.film.guest;

import com.mysql.jdbc.Driver;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import usu.rental.film.data.AdminChiper;
import usu.rental.film.widget.worker.WorkerAction;
import usu.rental.film.widget.worker.WorkerFilm;
import usu.util.StringUtil;
import usu.widget.Form;
import usu.widget.util.WidgetUtilities;

/**
 *
 * @author  usu
 */
public class GuestForm extends Form {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;
    private Connection connection;
    private Properties prop;
    private StringBuilder url;
    private AdminChiper admin;
    private GraphicsDevice gd;

    /**
     * 
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public GuestForm() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/icon.png")).getImage());
        
        gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

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

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("setting\\eMR.dat"));
        admin = (AdminChiper) input.readObject();

        new Driver();
        connection = DriverManager.getConnection(url.toString(), StringUtil.convertToString(admin.getUsername("NESIAOKTIANA")),
                StringUtil.convertToString(admin.getPassword("NESIAOKTIANA")));
        initComponents();
        initActions();
        panelBuku.reset();
        new WorkerFilm(connection, panelBuku.getTableModel(), new WorkerAction() {

            public void runFirst() {
                runLoading("Loading Film");
                panelBuku.setEnabled(false);
            }

            public void runLast() {
                panelBuku.setEnabled(true);
                doneLoading();
            }
        }).execute();
    }

    void runLoading(String message) {
        buttonFullScreen.setEnabled(false);
        progressBar.setIndeterminate(true);
        labelStatusBar.setText(message);
    }

    void doneLoading() {
        buttonFullScreen.setEnabled(true);
        progressBar.setIndeterminate(false);
        labelStatusBar.setText("e'MovieRental");
    }

    private void initActions() {
        panelBuku.addActionListenerSegarkan(new AksiButton_Segarkan());
        panelBuku.addActionListenerSaring(new AksiButton_Saring());
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
        panelGradient = new usu.rental.film.widget.Panel();
        labelEmovie = new usu.rental.film.widget.Label();
        panelBuku = new usu.rental.film.guest.PanelBuku();
        usu.rental.film.widget.Toolbar toolBar = new usu.rental.film.widget.Toolbar();
        buttonFullScreen = new usu.rental.film.widget.Button();
        buttonTentang = new usu.rental.film.widget.Button();
        usu.rental.film.widget.Toolbar statusBar = new usu.rental.film.widget.Toolbar();
        labelStatusBar = new usu.rental.film.widget.Label();
        progressBar = new usu.rental.film.widget.ProgressBar();

        setGlassPane(glasspane);
        getGlassPane().setVisible(true);

        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        setTitle("e'MovieRental - Administrator");
        setAnimationHide(usu.widget.constan.Animation.HIDE_TO_BOTTOM);
        setAnimationShow(usu.widget.constan.Animation.SHOW_FROM_BOTTOM);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelEmovie.setText("e'MovieRental");
        labelEmovie.setFont(new java.awt.Font("Tahoma", 1, 24));

        javax.swing.GroupLayout panelGradientLayout = new javax.swing.GroupLayout(panelGradient);
        panelGradient.setLayout(panelGradientLayout);
        panelGradientLayout.setHorizontalGroup(
            panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addComponent(labelEmovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelGradientLayout.setVerticalGroup(
            panelGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEmovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelGradient, java.awt.BorderLayout.CENTER);

        toolBar.setRollover(true);

        buttonFullScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/home.png"))); // NOI18N
        buttonFullScreen.setMnemonic('L');
        buttonFullScreen.setText("layar penuh");
        buttonFullScreen.setFocusable(false);
        buttonFullScreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonFullScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFullScreenActionPerformed(evt);
            }
        });
        toolBar.add(buttonFullScreen);

        buttonTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usu/rental/film/resource/tentang.png"))); // NOI18N
        buttonTentang.setMnemonic('T');
        buttonTentang.setText("tentang");
        buttonTentang.setFocusable(false);
        buttonTentang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTentangActionPerformed(evt);
            }
        });
        toolBar.add(javax.swing.Box.createHorizontalGlue());
        toolBar.add(buttonTentang);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        statusBar.setRollover(true);

        labelStatusBar.setText("e'MovieRental");
        statusBar.add(labelStatusBar);

        progressBar.setMaximumSize(new java.awt.Dimension(150, 14));
        statusBar.add(javax.swing.Box.createHorizontalGlue());
        statusBar.add(progressBar);

        getContentPane().add(statusBar, java.awt.BorderLayout.PAGE_END);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void buttonFullScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFullScreenActionPerformed

        if (gd.isFullScreenSupported()) {
            if (gd.getFullScreenWindow() != this) {
                gd.setFullScreenWindow(this);
                buttonFullScreen.setText("keluar layar penuh");
            } else {
                gd.setFullScreenWindow(null);
                buttonFullScreen.setText("layar penuh");
            }
        } else {
            WidgetUtilities.showErrorMessage(this, "mode full screen tak didukung oleh sistem operasi anda");
        }
}//GEN-LAST:event_buttonFullScreenActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        glasspane.hideComponent();
    }//GEN-LAST:event_aboutActionPerformed

    private void buttonTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTentangActionPerformed
        glasspane.showComponent(about);
    }//GEN-LAST:event_buttonTentangActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    usu.rental.film.widget.About about;
    usu.rental.film.widget.Button buttonFullScreen;
    usu.rental.film.widget.Button buttonTentang;
    usu.widget.GlassPane glasspane;
    usu.rental.film.widget.Label labelEmovie;
    usu.rental.film.widget.Label labelStatusBar;
    usu.rental.film.guest.PanelBuku panelBuku;
    usu.rental.film.widget.Panel panelGradient;
    usu.rental.film.widget.ProgressBar progressBar;
    // End of variables declaration//GEN-END:variables

    class AksiButton_Segarkan implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                panelBuku.reset();
                new WorkerFilm(connection, panelBuku.getTableModel(), new WorkerAction() {

                    public void runFirst() {
                        runLoading("Loading Film");
                        panelBuku.setEnabled(false);
                    }

                    public void runLast() {
                        panelBuku.setEnabled(true);
                        doneLoading();
                    }
                }).execute();
            } catch (SQLException ex) {
                WidgetUtilities.showErrorMessage(GuestForm.this, ex.getMessage());
            }
        }
    }

    class AksiButton_Saring implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                new WorkerFilm(connection, panelBuku.getTableModel(), new WorkerAction() {

                    public void runFirst() {
                        runLoading("Loading Film");
                        panelBuku.setEnabled(false);
                    }

                    public void runLast() {
                        panelBuku.setEnabled(true);
                        doneLoading();
                    }
                },
                        panelBuku.getJudulFilm(), panelBuku.getPemeranUtama(),
                        panelBuku.getDirektor(), panelBuku.getRumahProduksi(),
                        panelBuku.getJenisFilm(), panelBuku.getStatus()).execute();
            } catch (SQLException ex) {
                WidgetUtilities.showErrorMessage(GuestForm.this, ex.getMessage());
            }
        }
    }
}
