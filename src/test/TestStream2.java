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
public class TestStream2 {
    public static void main(String[] args) {
        RumahSakit.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < RumahSakit.getDaftarPasien().size(); i++) {
            System.out.println(RumahSakit.getDaftarPasien().get(i).toString());
           
        }
    }
}
