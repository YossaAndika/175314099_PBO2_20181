/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author windows10
 */
public class AntrianPasien {
    private int tanggalAntri;
    private int bulanAntri;
    private int tahunAntri;
    private int nomorAntri = 0;
    private final int JUMLAH_PASIEN_MAKSIMAL = 50;
    private Klinik klinik;
    private Pasien[] DaftarPasien = new Pasien[JUMLAH_PASIEN_MAKSIMAL];
    public static ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();
    /***
     * membuat konstruktorkosong pada kelas antriPasien
     */
    
    public AntrianPasien(){
        
    }
    
    /***
     * membuat method getTanggalAntri dengan tipe int untuk mengembalikan nilia menggunakan
     * @return tanggalAntri
     */

    public int getTanggalAntri() {
        return tanggalAntri;
    }
    
    /***
     * membuat method setTanggalAntri bertipe void untuk menyamakan nilai variabel
     * tanggalAntri global dan variabel tanggalAntri lokal
     * @param tanggalAntri 
     */

    public void setTanggalAntri(int tanggalAntri) {
        this.tanggalAntri = tanggalAntri;
    }
    
    /***
     * membuat method getBulanAntri dengan tipe int untuk mengembalikan nilia menggunakan
     * @return bulanAntri
     */
    public int getBulanAntri() {
        return bulanAntri;
    }
    
    /***
     * membuat method setBulanAntri bertipe void untuk menyamakan nilai variabel
     * bulanAntri global dan variabel bulanAntri lokal
     * @param bulanAntri 
     */
    public void setBulanAntri(int bulanAntri) {
        this.bulanAntri = bulanAntri;
    }
    
    /***
     *  membuat method getTahunAntri dengan tipe int untuk mengembalikan nilia menggunakan
     * @return tahunAntri
     */
    public int getTahunAntri() {
        return tahunAntri;
    }
    
    /***
     * membuat method setTahunlAntri bertipe void untuk menyamakan nilai variabel
     * tahunAntri global dan variabel tahunlAntri lokal
     * @param tahunAntri 
     */
    public void setTahunAntri(int tahunAntri) {
        this.tahunAntri = tahunAntri;
    }
    
    /***
     * membuat method getNomorAntri dengan tipe int untuk mengembalikan nilia menggunakan
     * @return nomorAntri
     */
    public int getNomorAntri() {
        return nomorAntri;
    }
  
    /***
     * membuat method setNomorAntri bertipe void untuk menyamakan nilai variabel
     * nomorAntri global dan variabel nomorAntri lokal
     * @param nomorAntri 
     */
    public void setNomorAntri(int nomorAntri) {
        this.nomorAntri = nomorAntri;
    }
    
    /***
     * membuat method getKlnik dengan tipe Klinik untuk mengembalikan nilia menggunakan
     * @return klinik
     */
    public Klinik getKlinik() {
        return klinik;
    }
    
    /***
     * membuat method setKlinik bertipe void untuk menyamakan nilai variabel
     * klinik global dan variabel Klinik lokal
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    
    /***
     * membuat method getDaftarPasien dengan tipe Pasien[] untuk mengembalikan nilia menggunakan
     * @return DaftarPasien
     */
    public Pasien[] getDaftarPasien() {
        return DaftarPasien;
    }
    
    /***
     * membuat method DaftarPasien bertipe void untuk menyamakan nilai variabel
     * DaftarPasien global dan variabel DaftarPasien lokal
     * @param DaftarPasien 
     */
    public void setDaftarPasien(Pasien[] DaftarPasien) {
        this.DaftarPasien = DaftarPasien;
    }
    
    /***
     * method ini digunakana untuk mendaftar pasien baru pada nomor antrian
     * @param pasien
     * @throws Exception 
     */    
    public void daftar(Pasien pasien)throws Exception{
        //menentukan dan mengecek nomor antrian pasien dengan jumlah maksimal pasien yang dilayani
        if(nomorAntri < JUMLAH_PASIEN_MAKSIMAL){
            DaftarPasien[nomorAntri]= pasien;
        }else{
            //antrian sudah penuh 
            throw new Exception("Antrian sudah penuh");
        }
    }
    /***
     * method untuk digunakan untuk memanggil antrian pasien
     * @param nomorAntri
     * @return
     * @throws Exception 
     */
    public Pasien panggilPasien(int nomorAntri)throws Exception{
            return DaftarPasien[nomorAntri];
  
    }
    
    public void mendaftar(Pasien pasien, int tanggal, int bulan, int tahun){
        daftarPasienAntri.add(pasien);
    }
    
    /***
     * method yang digunakan untuk mencari pasien menggunakan nomor rekam medis yang sudah terdaftar
     * @param NoRM
     * @return 
     */
     public static AntrianPasien cariPasien(String NoRM) {
        AntrianPasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).daftarPasienAntri.equals(NoRM)) {
                found = true;
                result = daftarAntrian.get(i);
            }
        }
            return result;
    }
     
     public static Pasien cariPasien(String noRM, int tanggal, int bulan, int tahun){ 
         for (int i = 0; i < daftarAntrian.size(); i++) {
             if (daftarAntrian.get(i).daftarPasienAntri.get(i).getRekamMedis().equalsIgnoreCase(noRM)) {
                 return daftarAntrian.get(i).daftarPasienAntri.get(i);
             }
         }
         return null;
    }  
     
     public static void daftarAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
         int K = CariAntrian(tanggal, bulan, tahun, klinik);
         if(K >= 0){
             
         }else{
             AntrianPasien antri = new AntrianPasien();
             antri.setTanggalAntri(tanggal);
             antri.setBulanAntri(bulan);
             antri.setTahunAntri(tahun);
             antri.setKlinik(klinik);
             daftarAntrian.add(antri);
         }
     }
     
     public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
         AntrianPasien antri = new AntrianPasien();
         antri.setTanggalAntri(tanggal);
         antri.setBulanAntri(bulan);
         antri.setTahunAntri(tahun);
         antri.setKlinik(klinik);
         
         if (CariAntrian(tanggal, bulan, tahun, klinik) < 0) {
             daftarAntrian.add(antri);
         }else{
             System.out.println("Antrian nomor "+klinik.getNamaKlinik()+" sudah ada");
         }
     }
     
     public static int CariAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
         for (int i = 0; i < daftarAntrian.size(); i++) {
             if (daftarAntrian.get(i).getTanggalAntri()== tanggal
                     && daftarAntrian.get(i).getBulanAntri() == bulan
                     && daftarAntrian.get(i).getTahunAntri()== tahun
                     && daftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik())
                     && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                 return i;
             }
             
         }
         return -1;
     }
     
     
     
     }
     
     
    
    
    
    

