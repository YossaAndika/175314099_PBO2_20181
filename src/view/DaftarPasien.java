/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author windows10
 */
public class DaftarPasien extends JDialog{
    //deklarasi judulLabel menggunakan JLabel untuk menampilkan teks pendek atau gambar
    private JLabel judulLabel;
    //deklarasi namaLabel menggunakan JLabel untuk menampilkan teks pendek atau gambar
    private JLabel namaLabel;
    //deklarasi namaText menggunakan JtextField untuk merubah adata teks dalam satu baris
    private JTextField namaText;
    //deklarasi saveButton menggunakan JButton untuk mengimplementasikan tombol tekan
    private JButton saveButton;

    /***
     * method dengan konstruktor kosong
     */
    public DaftarPasien() {
        //inisialisasi atau membuat stack baru yang masih kosong
        init();
    }

    /***
     * method dengan konstruktor title bertipe String untuk membuat judul panel atau frame
     * @param title 
     */
    public DaftarPasien(String title) {
        //memasukan atau mengeset nilai title menggunakan setTitle
        this.setTitle(title);
        //inisialisasi atau membuat stack baru yang masih kosong
        init();
    }
    
    /***
     * method untuk membuat desain panel atau frame dengan membuat stac baru
     */
    public void init() {
        this.setLayout(null);
        
        //membuat label baru dengan variabel judulLabel dan mengatur tata letak dan ukurannya
        judulLabel = new JLabel("DAFTAR PASIEN BARU");
        judulLabel.setBounds(70, 20, 150, 10);
        this.add(judulLabel);
        
        //membuat label baru dengan variabel namaLabel dan mengatur tata letak dan ukurannya
        namaLabel = new JLabel("No Rekam Medis");
        namaLabel.setBounds(15, 50, 100, 25);
        this.add(namaLabel);
        
         //membuat bidang teks baru dengan variabel namaText dan mengatur tata letak dan ukurannya
        namaText = new JTextField(100);
        namaText.setBounds(120, 50, 150, 20);
        this.add(namaText);
        
        //membuat label baru dengan variabel namaLabel dan mengatur tata letak dan ukurannya
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 100, 85, 10);
        this.add(namaLabel);
        
         //membuat bidang teks baru dengan variabel namaText dan mengatur tata letak dan ukurannya
        namaText = new JTextField(100);
        namaText.setBounds(120, 100, 150, 20);
        this.add(namaText);
        
        //membuat label baru dengan variabel namaLabel dan mengatur tata letak dan ukurannya
        namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(50, 140, 100, 20);
        this.add(namaLabel);
        
        //membuat bidang teks baru dengan variabel namaText dan mengatur tata letak dan ukurannya
        namaText = new JTextField(100);
        namaText.setBounds(120, 145, 150, 20);
        this.add(namaText);
        
        //membuat tombol tekan baru dengan variabel saveButton dan mengatur tata letak dan ukurannya
        saveButton = new JButton("SAVE");
        saveButton.setBounds(35, 200, 80, 20);
        this.add(saveButton);
    }

}
