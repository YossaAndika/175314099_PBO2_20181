/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.Pasien.daftarpasienKlinik;

/**
 *
 * @author admin
 */
public class RumahSakit {
    private String nama;
    private String alamat;
    public static ArrayList<Pasien> daftarpasienKlinik = new ArrayList<Pasien>();
    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static ArrayList<Pasien> getDaftarpasienKlinik() {
        return daftarpasienKlinik;
    }

    public static void setDaftarpasienKlinik(ArrayList<Pasien> daftarpasienKlinik) {
        RumahSakit.daftarpasienKlinik = daftarpasienKlinik;
    }

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        RumahSakit.daftarKlinik = daftarKlinik;
    }
    
     public static void tambahPasienBaru(Pasien pasien) {
        daftarpasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String NoRM) {
        Pasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarpasienKlinik.size(); i++) {
            if (daftarpasienKlinik.get(i).getNik().equals(NoRM)) {
                found = true;
                result = daftarpasienKlinik.get(i);
            }
        }
        return result;
    }

    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            for (int i = 0; i < daftarpasienKlinik.size(); i++) {
                String data = daftarpasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        Pasien tmp = new Pasien();
        boolean nama = false;
        boolean alamat = false;
        boolean rekamMedis = false;
        String hasil = "";
        int data;
        try {
            fis = new FileInputStream(file);
            while ((data = fis.read()) != -1) {
             if((char)data != '\t'){
                if ((char) data != '\t') {
                    if ((char) data != '\n') {
                        hasil = hasil + (char) data;
                    } else if (nama = false) {
                        tmp.setNama(hasil);
                        nama = true;
                        hasil = "";
                    }
                } else if (alamat = false) {
                    tmp.setAlamat(hasil);
                    alamat = true;
                    hasil = "";
                }
            }else if(rekamMedis = false){
                tmp.setRekamMedis(hasil);
                rekamMedis = true;
                hasil="";
            }
            }
            System.out.println(hasil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        Pasien pasien = new Pasien();
        return pasien.getNama()+"\t"+pasien.getAlamat()+"\t"+pasien.getRekamMedis()+"\n";
    }
}
