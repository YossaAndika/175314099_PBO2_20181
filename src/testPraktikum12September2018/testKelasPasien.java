/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPraktikum12September2018;

import model.Pasien;

/**
 *
 * @author admin
 */
public class testKelasPasien {
    public static void main(String[] args) {
    Pasien test = new Pasien("Puspa", // nama pasien
                "Klaten", // alamat
                "Medan", // tempat lahir
                12, // tanggal lahir
                01, // bulan lahir
                1974, // tahun lahir
                "19740112" // NIK
    );
    
    Pasien test1 = new Pasien(
                "Budi", // nama pasien
                "Klaten", // alamat
                "Klaten", // tempat lahir
                10, // tanggal lahir
                01, // bulan lahir
                1999, // tahun lahir
                "19990110" // NIK
        );
    
    Pasien.tambahPasienBaru(test);
    Pasien.tambahPasienBaru(test1);
    
    for (int i = 0; i < Pasien.daftarpasienKlinik.size(); i++) {
            System.out.println("Nama : "+Pasien.daftarpasienKlinik.get(i).getNama());
        }
        
        Pasien cari = Pasien.cariPasien("19990110");
        System.out.println("Nama Hasil Pencarian = "+cari.getNama());
    }
    }


