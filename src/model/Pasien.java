/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {
    private String nama;
    private Date tanggalLahir;
    private String alamat;
    private String tempatLahir;
    private String RekamMedis;

    public Pasien(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    /**
     * 
     * @param tahun
     * @param bulan
     * @param tanggal 
     */
    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        tanggalLahir = new Date(tahun-1900,bulan-1,tanggal);
    }
    
    public int getUsia(){
        Date today = new Date();
        return today.getYear() - tanggalLahir.getYear();
    }
    
    public String setKodeNama(){
      String sub_nama = nama.substring(0, 3);
        return sub_nama; 
    }
    
    public String setTanggalDaftar(){
      Date date = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("yyyyMMdd");
      // display time and date using toString()
      return ft.format(date);
    }
}
