/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import model.Pasien;

/**
 *
 * @author admin
 */
public class TestStream {
    public static void main(String[] args) {
        Pasien test = new Pasien();
        test.setRekamMedis("001");
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        Pasien test1 = new Pasien();
        test1.setRekamMedis("002");
        test1.setNama("adi");
        test1.setAlamat("klaten");
        
        System.out.println(test.toString());
        System.out.println(test1.toString());
        
        Pasien.tambahPasienBaru(test);
        Pasien.tambahPasienBaru(test1);
        
        Pasien.simpanDaftarPasien(new File("daftar.txt"));
    }
}
