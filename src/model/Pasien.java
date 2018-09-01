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

    public void setRekamMedis(String RekamMedis) throws Exception {
        if(this.RekamMedis.length() > 6){
            this.RekamMedis = RekamMedis;
        }else{
            throw new Exception("Nomor Yang Anda Masukan Salah");
        }
    }
    
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir)throws Exception {
        if(tanggalLahir > 0){
        if(tanggalLahir <= 31){
           this.tanggalLahir = tanggalLahir;
        }else{ throw new Exception ("Tanggal yang Anda masukan melebihi batas yang ditentukan");}
    }else{ throw new Exception ("Tanggal yang Anda masukan kurang dari batas yang ditentukan ");
    
        }
    }
    
    public int getbulanLahir(){
        return bulanLahir;
    }
    
    public void setbulanLahir(int bulanLahir)throws Exception{
        if(bulanLahir > 0){
        if(bulanLahir <= 12){
           this.bulanLahir = bulanLahir;
        }else{ throw new Exception ("Bulan yang Anda masukan melebihi batas yang ditentukan");
        
        }
    }else{ throw new Exception ("Bulan yang Anda masukan kurang dari batas yang ditentukan ");
        }   
    }

    
    
    public int gettahunLahir(){
        return tahunLahir;
    }
    
    public void settahunLahir(int tahunLahir)throws Exception{
        if(tahunLahir > 0){
           this.tahunLahir = tahunLahir;
        }else{ throw new Exception ("Tahun yang diinputkan salah");
        }
    }
    
    public String Mendaftar(){
      Date date = new Date();
      RekamMedis= "yyyyMMdd";
      SimpleDateFormat ft = 
      new SimpleDateFormat (RekamMedis);
      
      String sub_nama = nama.substring(0, 3);
      
        return RekamMedis = ft.format(date).concat(sub_nama);
    }


}
