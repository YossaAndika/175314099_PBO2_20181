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
public class Dokter {

    private String nama;
    private String alamat;
    private String noPegawai;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public Dokter() {

    }

    public Dokter(String nama) {
        this.nama = nama;
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

    public String getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(String noPegawai) throws Exception {
        if (noPegawai.length() == 5) {
            this.noPegawai = noPegawai;
        } else {
            throw new Exception("Nomor yang Anda masukan salah");
        }
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal yang Anda masukan melebihi batas yang ditentukan");
            }
        } else {
            throw new Exception("Tanggal yang Anda masukan kurang dari batas yang ditentukan ");

        }
    }

    public int getBulanlLahir() {
        return bulanLahir;
    }

    public void setbulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan yang Anda masukan melebihi batas yang ditentukan");

            }
        } else {
            throw new Exception("Bulan yang Anda masukan kurang dari batas yang ditentukan ");
        }
    }

    public int getTahunlLahir() {
        return tahunLahir;
    }

    public void settahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun yang diinputkan salah");
        }
    }

}
