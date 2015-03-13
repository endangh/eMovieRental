/*
 * 
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

package usu.rental.film.data.template;

import java.sql.Date;

/**
 *
 * @author usu
 */
public interface Peminjaman {

    String getAnggota();

    String getFilm();

    int getIdTransaksi();

    String getOperator();

    Date getTanggalPeminjaman();

    Date getTanggalPengembalian();

    boolean isTelahDikembalikan();

    void setAnggota(String anggota);

    void setFilm(String film);

    void setIdTransaksi(int idTransaksi);

    void setOperator(String operator);

    void setTanggalPeminjaman(Date tanggalPeminjaman);

    void setTanggalPengembalian(Date tanggalPengembalian);

    void setTelahDikembalikan(boolean telahDikembalikan);

}
