/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.jndi.toolkit.dir.SearchFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.AntrianPasien.daftarAntrian;

/**
 *
 * @author admin
 */
public class RumahSakit implements Serializable{

    private String nama;
    private String alamat;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();

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

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarpasienKlinik) {
        this.daftarPasien = daftarpasienKlinik;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

    public void tambahPasien(Pasien pasien) {
       daftarPasien.add(pasien);
    }

    public void tambahPasienBaru(Pasien test) {
        Pasien look = this.cariPasien(test.getNama());
        if (look == null) {
            daftarPasien.add(test);
        }
    }

    public Pasien cariPasien(String nama) {
        Pasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNama().equals(nama)) {
                found = true;
                result = daftarPasien.get(i);
            }
        }
        return result;
    }

    public void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
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
                if ((char) data != '\t') {
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
                } else if (rekamMedis = false) {
                    tmp.setRekamMedis(hasil);
                    rekamMedis = true;
                    hasil = "";
                }
            }
            System.out.println(hasil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public Klinik cariKlinik(String Id) {
        Klinik result = null;
        boolean found = false;
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getIdKlinik().equals(Id)) {
                found = true;
                result = daftarKlinik.get(i);
            }
        }
        return result;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianPasien antri = new AntrianPasien();
        antri.setTanggalAntri(tanggal);
        antri.setBulanAntri(bulan);
        antri.setTahunAntri(tahun);
        antri.setKlinik(klinik);

        if (CariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            daftarAntrian.add(antri);
        } else {
            System.out.println("Antrian nomor " + klinik.getNamaKlinik() + " sudah ada");
        }
    }

    public int CariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntri() == tanggal
                    && daftarAntrian.get(i).getBulanAntri() == bulan
                    && daftarAntrian.get(i).getTahunAntri() == tahun
                    && daftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik())
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                return i;
            }

        }
        return -1;
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public void bacaObjekRumahSakit(File file) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {

            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            

            RumahSakit rs = (RumahSakit) ois.readObject();
            this.setNama(rs.getNama());
            this.setAlamat(rs.getAlamat());
            this.setDaftarPasien(rs.getDaftarPasien());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void simpanObjekRumahSakit(File file) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(this);

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

}
