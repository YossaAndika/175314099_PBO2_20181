/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author windows10
 */
public class antriPasien {
    private int tanggalAntri;
    private int bulanAntri;
    private int tahunAntri;
    private int nomorAntri = 0;
    private final int JUMLAH_PASIEN_MAKSIMAL = 50;
    private Klinik klinik;
    private Pasien[] DaftarPasien = new Pasien[JUMLAH_PASIEN_MAKSIMAL];
    
    public antriPasien(){
        
    }

    public int getTanggalAntri() {
        return tanggalAntri;
    }

    public void setTanggalAntri(int tanggalAntri) {
        this.tanggalAntri = tanggalAntri;
    }

    public int getBulanAntri() {
        return bulanAntri;
    }

    public void setBulanAntri(int bulanAntri) {
        this.bulanAntri = bulanAntri;
    }

    public int getTahunAntri() {
        return tahunAntri;
    }

    public void setTahunAntri(int tahunAntri) {
        this.tahunAntri = tahunAntri;
    }

    public int getNomorAntri() {
        return nomorAntri;
    }

    public void setNomorAntri(int nomorAntri) {
        this.nomorAntri = nomorAntri;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {
        return DaftarPasien;
    }

    public void setDaftarPasien(Pasien[] DaftarPasien) {
        this.DaftarPasien = DaftarPasien;
    }
    
    public void daftar(Pasien pasien)throws Exception{
        if(nomorAntri < JUMLAH_PASIEN_MAKSIMAL){
            DaftarPasien[nomorAntri]= pasien;
        }else{
            throw new Exception("Antrian sudah penuh");
        }
    }
    
    public Pasien panggilPasien(int nomorAntri)throws Exception{
        if(nomorAntri < JUMLAH_PASIEN_MAKSIMAL){
            return DaftarPasien[nomorAntri];
        }else{
            throw new Exception("Antrian sudah habis");
        }
    }
    
    
    
}
