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
    //deklarsi variabel nama bertipe String dengan sifat private
    private String nama;
    //deklarsi variabel alamt bertipe String dengan sifat private
    private String alamat;
    //deklarsi variabel noPegawai bertipe String dengan sifat private
    private String noPegawai;
    //deklarsi variabel tenpatLahir bertipe String dengan sifat private
    private String tempatLahir;
    //deklarsi variabel tanggalLahir bertipe integer dengan sifat private
    private int tanggalLahir;
    //deklarsi variabel bulanLahir bertipe integer dengan sifat private
    private int bulanLahir;
    //deklarsi variabel tahunLahir bertipe integer dengan sifat private
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

    /***
     * method ini digunakan untuk memasukan nomor pegawai
     * dokter
     * @param noPegawai
     * @throws Exception 
     */
    public void setNoPegawai(String noPegawai) throws Exception {
        //panjang digit nomor pegawai harus sama dengan 5
        if (noPegawai.length() == 5) {
            this.noPegawai = noPegawai;
        } else {
            //nomor pegawai yang dimasukan kurang atau lebigh dari 5 digit
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

    /***
     * method ini digunakan untuk mengatur tanggal lahir dokter
     * @param tanggalLahir
     * @throws Exception 
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        //tanggal yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if (tanggalLahir > 0) {
            //tanggal yang dimasukan tidak boleh lebih dari 31
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
                //tanggal yang dimasukan lebih dari 31
            } else {
                throw new Exception("Tanggal yang Anda masukan melebihi batas yang ditentukan");
            }
            //tanggal yang dimasukan kurang dari 1
        } else {
            throw new Exception("Tanggal yang Anda masukan kurang dari batas yang ditentukan ");

        }
    }

    public int getBulanlLahir() {
        return bulanLahir;
    }

    /***
     * method ini digunakan untuk mengatur bulan lahir dari dokter
     * @param bulanLahir
     * @throws Exception 
     */
    public void setbulanLahir(int bulanLahir) throws Exception {
        //bulan lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if (bulanLahir > 0) {
            //bulan lahir yang dimasukan tidak boleh lebih dari 12
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
                //bulan lahir yang dimasukan lebih dari 12
            } else {
                throw new Exception("Bulan yang Anda masukan melebihi batas yang ditentukan");

            }
            //bulan lahir yang dimasukan kurang dari 1
        } else {
            throw new Exception("Bulan yang Anda masukan kurang dari batas yang ditentukan ");
        }
    }

    public int getTahunlLahir() {
        return tahunLahir;
    }

    /***
     * method ini digunakan untuk mengatur tanggal lahir dari dokter
     * @param tahunLahir
     * @throws Exception 
     */
    public void settahunLahir(int tahunLahir) throws Exception {
        //tahun lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
            //tahun lahir yang dimasukan kurang dari 1
        } else {
            throw new Exception("Tahun yang diinputkan salah");
        }
    }

}
