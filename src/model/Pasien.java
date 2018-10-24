/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Pasien implements Serializable{
    private String nama;
    private int tanggalLahir;
    private String alamat;
    private String tempatLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String RekamMedis;
    private String nik;
    public static ArrayList<Pasien> daftarpasienKlinik = new ArrayList<Pasien>();
    
    /***
     * membuat konstruktor kosong di kelas Pasien
     */
    
    public Pasien(){
        
    }

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.RekamMedis = RekamMedis;
        this.nik = nik;
    
    } 
    /***
     * membuat konstruktor dengan parameter nama dengan tipe String
     * @param nama 
     */
    
    public Pasien(String nama){
        this.nama=nama;
    }
 
    /***
     * membuat method getNama bertipe String dan mengembalikan nilai menggunakan
     * @return nama
     */
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    /***
     * membuat methodgetAlamat bertipe String dan mengembalikan nilai menggunakan
     * @return alamat
     */

    public String getAlamat() {
        return alamat;
    }
    
    /***
     * membuat method setAlamat bertipe void dan menyamakan nilai variabel global
     * alamat dengan variabel lokal alamat
     * @param alamat 
     */

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    /***
     * membuat method getTempatLahir bertipe String dan mengembalikan nilai menggunakan
     * @return tempatLahir
     */

    public String getTempatLahir() {
        return tempatLahir;
    }
    
    /***
     * membuat method setTempatLahir bertipe voiddan menyamakan nilai variabel global
     * tempatLahir dengan variabel lokal tempatLahir
     * @param tempatLahir 
     */

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    
    /***
     * membuat method getRekamMedis bertipe String dan mengembalikan nilai menggunakan
     * @return RekamMedis
     */

    public String getRekamMedis() {
        return RekamMedis;
    }
    
    /***
     * method ini digunakan untuk mengatur panjang nomor rekam medis dengan
     * menggunakan fungsi exception
     * @param RekamMedis
     * @throws Exception 
     */

    public void setRekamMedis(String RekamMedis) {
            this.RekamMedis = RekamMedis;
    }
    
    /***
     * mengembalikan nilai getTanggalLahir yang bertipe integer menggunakan
     * @return tanggalLahir
     */
    
    public int getTanggalLahir() {
        return tanggalLahir;
    }
    
    /***
     * method ini digunkan untuk mengatur tanggal lahir dari pasien
     * @param tanggalLahir
     * @throws Exception 
     */

    public void setTanggalLahir(int tanggalLahir){
           this.tanggalLahir = tanggalLahir;
    }
    
    /***
     * mengembalikan nilai getbulanLahir yang bertipe integer menggunakan
     * @return bulanLahir
     */
    
    public int getbulanLahir(){
        return bulanLahir;
    }
    
    /***
     * method ini digunakan untuk mengatur bulan lahir dari pasien
     * @param bulanLahir
     * @throws Exception 
     */
    
    public void setbulanLahir(int bulanLahir){
           this.bulanLahir = bulanLahir;  
    }

    /***
     * mengembalikan nilai gettahunLahir yang bertipe integer menggunakan
     * @return tahunLahir
     */
    
    public int gettahunLahir(){
        return tahunLahir;
    }
    
    /***
     * method ini digunakan untuk mengatur tahun lahir pasien
     * @param tahunLahir
     * @throws Exception 
     */
    
    public void settahunLahir(int tahunLahir){
           this.tahunLahir = tahunLahir;
    }
    
    public String getNik(){
        return nik;
    }
    
    public void setNik(String Nik) throws Exception {
        if (Nik.length()== 16) {
            this.nik=Nik;
        }else{
            throw new Exception("NIK terdiri dari 16 digit");
        }
    }
    
    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarpasienKlinik;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarpasienKlinik) {
        Pasien.daftarpasienKlinik = daftarpasienKlinik;
    }

    /***
     * method ini digunakan untuk mengatur foramat rekam medis pasien dengan menggunakan
     * tanggal mendaftar dan 3 huruf pertama dari nama pasien
     * @return 
     */
    public String Mendaftar() {
        //deklarasi objek baru bernama date dengan tipe Date
        Date date = new Date();
        //deklarasi variabel RekamMedis dengan format yyyyMMdd (tahun-bulan-tanggal)
        RekamMedis= "yyyyMMdd";
        //deklarasi objek baru bernama ft dengan tipe SimpleDateFormat
        SimpleDateFormat ft =
                new SimpleDateFormat (RekamMedis);
        
        //deklarasi nilai sub_nama dengan 3 huruf pertama dari variabel nama menggunakan subString
        String sub_nama = nama.substring(0, 3);
        //mengembalikan nilai RekamMedis
        return RekamMedis = ft.format(date).concat(sub_nama);
    }


    public static void tambahPasienBaru(Pasien pasien) {
        daftarpasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String NoRM) {
        Pasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarpasienKlinik.size(); i++) {
            if (daftarpasienKlinik.get(i).getNik().equals(NoRM)) {
                found = true;
                result = daftarpasienKlinik.get(i);
            }
        }
            return result;
    }
    
    public static void simpanDaftarPasien(File file){
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(file, true);
            for (int i = 0; i < daftarpasienKlinik.size(); i++) {
                String data = daftarpasienKlinik.get(i).toString();
                fos.write(data.getBytes());   
            }
        }catch(FileNotFoundException ex){
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try{
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    }
    
    public static void bacaDaftarPasien(File file){
        FileInputStream fis = null;
        Pasien tmp = new Pasien();
        boolean nama = false;
        boolean alamat = false;
        String hasil = "";
        int data;
        try{
            fis = new FileInputStream(file);
            while ((data = fis.read()) > 0){
                if ((char) data != '\n') {
                    if ((char)data != '\t') {
                        hasil = hasil + daftarpasienKlinik.add(tmp);
                    }else if(nama = false){
                        tmp.setNama(hasil);
                        nama = true;
                        hasil="";
                    }
                }else if(alamat = false){
                    tmp.setAlamat(hasil);
                    alamat=true;
                    hasil="";
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public String toString() {
        return "Nama : "+nama+", Alamat : "+alamat+", No Rekam Medis : "+RekamMedis;
    }
    
    
}
