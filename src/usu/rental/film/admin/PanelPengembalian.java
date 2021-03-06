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
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import usu.rental.film.data.template.Pengembalian;
import usu.rental.film.widget.Table;
import usu.rental.film.widget.table.TableModelPengembalian;
import usu.rental.film.widget.table.render.DefaultTableCellRender;

/**
 *
 * @author  usu
 */
public class PanelPengembalian extends javax.swing.JPanel {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;
    private TableModelPengembalian tableModel;

    /** Creates new form PanelAnggota */
    public PanelPengembalian() {
        initVariables();
        initComponents();
        initFinals();
        initActions();
    }

    public void addActionListenerSaring(ActionListener l) {
        buttonSaring.addActionListener(l);
    }

    public void addActionListenerHapus(ActionListener l) {
        buttonHapus.addActionListener(l);
    }

    public void addActionListenerSegarkan(ActionListener l) {
        buttonSegarkan.addActionListener(l);
    }

    public TableModelPengembalian getTableModel() {
        return tableModel;
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        table.setEnabled(enabled);
        textCari.setEnabled(enabled);
        buttonHapus.setEnabled(enabled);
        buttonSaring.setEnabled(enabled);
        buttonSegarkan.setEnabled(enabled);
        textDendaKeterlambatan.setEnabled(enabled);
        textIdOperator.setEnabled(enabled);
        textIdTransaksi.setEnabled(enabled);
        textTanggalPengembalian.setEnabled(enabled);
        textTotalHariTerlambat.setEnabled(enabled);
    }

    public void reset() {
        textCari.setText("");
        textDendaKeterlambatan.setText("");
        textIdOperator.setText("");
        textIdTransaksi.setText("");
        textTanggalPengembalian.setText("");
        textTotalHariTerlambat.setText("");
    }

    public Table getTable() {
        return table;
    }

    private void initActions() {
        textCari.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                filterTable(textCari.getText());
            }

            public void removeUpdate(DocumentEvent e) {
                filterTable(textCari.getText());
            }

            public void changedUpdate(DocumentEvent e) {
                filterTable(textCari.getText());
            }
        });

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            private Pengembalian temp;
            private int index;

            public void valueChanged(ListSelectionEvent e) {
                try {
                    index = table.convertRowIndexToModel(table.getSelectedRow());
                    temp = tableModel.get(index);
                    textDendaKeterlambatan.setValue(new Integer(temp.getDendaKeterlambatan()));
                    textIdOperator.setText(temp.getOperator());
                    textIdTransaksi.setText(String.valueOf(temp.getIdTransaksi()));
                    textTanggalPengembalian.setValue(temp.getTanggalPengembalian());
                    textTotalHariTerlambat.setValue(new Integer(temp.getTotalHariTerlambat()));
                } catch (IndexOutOfBoundsException ex) {
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    public void filterTable(String text) {
        if (text.trim().equals("")) {
            ((TableRowSorter<TableModel>) table.getRowSorter()).setRowFilter(null);
        } else {
            ((TableRowSorter<TableModel>) table.getRowSorter()).setRowFilter(RowFilter.regexFilter(text));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usu.rental.film.widget.ScrollPane scrollpane = new usu.rental.film.widget.ScrollPane();
        table = new usu.rental.film.widget.Table();
        usu.rental.film.widget.Label label1 = new usu.rental.film.widget.Label();
        textCari = new usu.rental.film.widget.TextBox();
        buttonSaring = new usu.rental.film.widget.Button();
        buttonHapus = new usu.rental.film.widget.Button();
        buttonSegarkan = new usu.rental.film.widget.Button();
        usu.widget.glass.PanelGlass panelGlass1 = new usu.widget.glass.PanelGlass();
        usu.rental.film.widget.Label label3 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label6 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label2 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label4 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label5 = new usu.rental.film.widget.Label();
        textIdTransaksi = new usu.rental.film.widget.TextBox();
        textIdOperator = new usu.rental.film.widget.TextBox();
        textTanggalPengembalian = new usu.rental.film.widget.FormatterBox();
        textTotalHariTerlambat = new usu.rental.film.widget.FormatterBox();
        textDendaKeterlambatan = new usu.rental.film.widget.FormatterBox();

        setOpaque(false);

        scrollpane.setViewportView(table);

        label1.setDisplayedMnemonic('C');
        label1.setText("cari (case sensitive) :");

        textCari.setFocusAccelerator('C');

        buttonSaring.setMnemonic('G');
        buttonSaring.setText("saring");

        buttonHapus.setMnemonic('H');
        buttonHapus.setText("hapus");

        buttonSegarkan.setMnemonic('S');
        buttonSegarkan.setText("segarkan");

        panelGlass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGlass1.setOpaqueImage(false);
        panelGlass1.setRound(false);

        label3.setDisplayedMnemonic('D');
        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("id operator :");

        label6.setDisplayedMnemonic('L');
        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("tanggal pengembalian :");

        label2.setDisplayedMnemonic('I');
        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("id transaksi :");

        label4.setDisplayedMnemonic('O');
        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("total hari terlambat :");

        label5.setDisplayedMnemonic('E');
        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("denda keterlambatan :");

        textIdTransaksi.setEditable(false);
        textIdTransaksi.setFocusAccelerator('I');

        textIdOperator.setEditable(false);
        textIdOperator.setFocusAccelerator('D');

        textTanggalPengembalian.setEditable(false);
        textTanggalPengembalian.setFocusAccelerator('L');

        textTotalHariTerlambat.setEditable(false);
        textTotalHariTerlambat.setFocusAccelerator('O');

        textDendaKeterlambatan.setEditable(false);
        textDendaKeterlambatan.setFocusAccelerator('E');

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIdOperator, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(textIdTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(textTanggalPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(textTotalHariTerlambat, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(textDendaKeterlambatan, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalHariTerlambat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDendaKeterlambatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelGlass1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollpane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCari, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonSegarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSaring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSegarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSaring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initFinals() {
        table.setModel(tableModel);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRender());
        }
    }

    private void initVariables() {
        tableModel = new TableModelPengembalian();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    usu.rental.film.widget.Button buttonHapus;
    usu.rental.film.widget.Button buttonSaring;
    usu.rental.film.widget.Button buttonSegarkan;
    usu.rental.film.widget.Table table;
    usu.rental.film.widget.TextBox textCari;
    usu.rental.film.widget.FormatterBox textDendaKeterlambatan;
    usu.rental.film.widget.TextBox textIdOperator;
    usu.rental.film.widget.TextBox textIdTransaksi;
    usu.rental.film.widget.FormatterBox textTanggalPengembalian;
    usu.rental.film.widget.FormatterBox textTotalHariTerlambat;
    // End of variables declaration//GEN-END:variables
}
