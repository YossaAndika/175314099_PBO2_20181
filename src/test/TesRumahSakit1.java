/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import model.Pasien;
import model.RumahSakit;

/**
 *
 * @author admin
 */
public class TesRumahSakit1 {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien();
        pasien1.setNama("Puspa");
        pasien1.setAlamat("klaten");
        
        Pasien pasien2 = new Pasien();
        pasien2.setNama("Adi");
        pasien2.setAlamat("yogya");
        
        RumahSakit rs = new RumahSakit("Panti Rapih","Yogyakarta");
        
        rs.tambahPasienBaru(pasien1);
        rs.tambahPasienBaru(pasien2);
        
        rs.simpanObjekRumahSakit(new File("rsku.dat"));
        
    }
}
