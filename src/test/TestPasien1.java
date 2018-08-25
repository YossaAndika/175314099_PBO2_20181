/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.text.SimpleDateFormat;
import model.Pasien;

/**
 *
 * @author admin
 */
public class TestPasien1 {
    public static void main(String[] args) {
        Pasien puspa = new Pasien("Puspa");
        puspa.setTanggalLahir(1974, 1, 12);
        puspa.setAlamat("Klaten");
        puspa.setTempatLahir("Klaten");
        
//        System.out.println("Rekam Medis = "+puspa.setTanggalDaftar()+""+puspa.setKodeNama());
//        puspa.Mendaftar();
        
        System.out.println("-------------------------------------");
        System.out.println("\tNomor Antrian Pasien");
        System.out.print("\t    "); puspa.Mendaftar();
        System.out.println("-------------------------------------");
        
        System.out.println("Nama          : "+puspa.getNama());
        System.out.println("Umur          : "+puspa.getUsia());
        System.out.println("Tanggal Lahir : "+puspa.getTanggalLahir());
        System.out.println("Teampat Lahir : "+puspa.getTempatLahir());
        System.out.println("Alamat        : "+puspa.getAlamat());
        System.out.println("");
    }
    
}
