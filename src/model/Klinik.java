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
public class Klinik {
    private String namaKlinik;
    private String idKlinik;
    
    /***
     * membuat konstruktorkosong pada kelas antriPasien
     */
    
    public Klinik(){
        
    }
    
    /***
     * membuat method getNamaKlinik dengan tipe String untuk mengembalikan nilia menggunakan
     * @return namaKlinik
     */

    public String getNamaKlinik() {
        return namaKlinik;
    }
    
     /***
     * membuat method setNamaKlinik bertipe void untuk menyamakan nilai variabel
     * namaKlinik global dan variabel namaKlinik lokal 
     * @param namaKlinik
     */

    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    
    /***
     * membuat method getIdKlinik dengan tipe String untuk mengembalikan nilia menggunakan
     * @return idKlinik
     */

    public String getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    
    
}
