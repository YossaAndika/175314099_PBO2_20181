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
    private int tanggalLahir;
    private String alamat;
    private String tempatLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String RekamMedis;
    
    public Pasien(){
        
    }
    
    public Pasien(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getRekamMedis() {
        return RekamMedis;
    }
    
    /***
     * method ini digunakan untuk mengatur panjang nomor rekam medis dengan
     * menggunakan fungsi exception
     * @param RekamMedis
     * @throws Exception 
     */

    public void setRekamMedis(String RekamMedis) throws Exception {
        //panjang rekam medis yang harus dimasukan lebih dari 6
        if(this.RekamMedis.length() > 6){
            this.RekamMedis = RekamMedis;
            //jika panjang rekam medis yang dimasukan kurang dari dari 6
        }else{
            throw new Exception("Nomor Yang Anda Masukan Salah");
        }
    }
    
    public int getTanggalLahir() {
        return tanggalLahir;
    }
    
    /***
     * method ini digunkan untuk mengatur tanggal lahir dari pasien
     * @param tanggalLahir
     * @throws Exception 
     */

    public void setTanggalLahir(int tanggalLahir)throws Exception {
        //tanggal lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if(tanggalLahir > 0){
            //tanggal lahir yang dimasukan tidak boleh lebih dari 31
        if(tanggalLahir <= 31){
           this.tanggalLahir = tanggalLahir;
           //jika tanggal lahir yang dimasukan lebih dari 31
        }else{ throw new Exception ("Tanggal yang Anda masukan melebihi batas yang ditentukan");}
        //jika tanggal lahir yang dimasukan kurang dari 1
    }else{ throw new Exception ("Tanggal yang Anda masukan kurang dari batas yang ditentukan ");
    
        }
    }
    
    public int getbulanLahir(){
        return bulanLahir;
    }
    
    /***
     * method ini digunakan untuk mengatur bulan lahir dari pasien
     * @param bulanLahir
     * @throws Exception 
     */
    
    public void setbulanLahir(int bulanLahir)throws Exception{
        //bulan lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if(bulanLahir > 0){
            //bulan lahir yang dimasukan tidak boleh lebih dari 12
        if(bulanLahir <= 12){
           this.bulanLahir = bulanLahir;
           //jika bulan lahir yang dimasukan lebih dari 12
        }else{ throw new Exception ("Bulan yang Anda masukan melebihi batas yang ditentukan");
        
        }//jika bulan lahir yang dimasukan kurang dari 1
    }else{ throw new Exception ("Bulan yang Anda masukan kurang dari batas yang ditentukan ");
        }   
    }

    
    
    public int gettahunLahir(){
        return tahunLahir;
    }
    
    /***
     * method ini digunakan untuk mengatur tahun lahir pasien
     * @param tahunLahir
     * @throws Exception 
     */
    
    public void settahunLahir(int tahunLahir)throws Exception{
        //tahun lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if(tahunLahir > 0){
           this.tahunLahir = tahunLahir;
           //jika tahun lahir yang dimasukan kurang dari 1
        }else{ throw new Exception ("Tahun yang diinputkan salah");
        }
    }
    
    /***
     * method ini digunakan untuk mengatur foramat rekam medis pasien dengan menggunakan
     * tanggal mendaftar dan 3 huruf pertama dari nama pasien
     * @return 
     */
    
    public String Mendaftar(){
      Date date = new Date();
      RekamMedis= "yyyyMMdd";
      SimpleDateFormat ft = 
      new SimpleDateFormat (RekamMedis);
      
      String sub_nama = nama.substring(0, 3);
      
        return RekamMedis = ft.format(date).concat(sub_nama);
    }


}

