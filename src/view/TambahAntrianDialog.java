/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.Pasien;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author jarkom
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JLabel tanggalAntri;
    private JLabel klinik;
    private JTextField namaKlinik;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JButton tambahButton;
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private String tgl[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
    ,"21","22","23","24","25","26","27","28","29","30","31"};
    private String bln[]={"JAN","FEB","MAR","APR","MEI","JUN","JUL","AGST","SEP","OCT","NOV","DEC"};
    private String thn[]={"17","18"};
    
    
    public TambahAntrianDialog() {
        init();
    }

    public TambahAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("Form Daftar Antrian");
        judulLabel.setFont(new Font(null, Font.BOLD, 16));
        judulLabel.setBounds(50, 20, 250, 30);
        this.add(judulLabel);

        noRMLabel = new JLabel();
        noRMLabel.setText("No. RM");
        noRMLabel.setBounds(50, 70, 80, 20);
        this.add(noRMLabel);

        noRMText = new JTextField();
        noRMText.setBounds(150, 70, 120, 20);
        this.add(noRMText);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 100, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 100, 120, 20);
        this.add(namaText);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 130, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(150, 130, 120, 20);
        this.add(alamatText);
        
        tanggalAntri = new JLabel("Tanggal Antri");
        tanggalAntri.setBounds(50, 160, 95, 20);
        this.add(tanggalAntri);
        
        tanggal = new JComboBox(tgl);
        tanggal.setBounds(150, 160, 90, 20);
        this.add(tanggal);
        
        bulan = new JComboBox(bln);
        bulan.setBounds(250, 160, 90, 20);
        this.add(bulan);
        
        tahun = new JComboBox(thn);
        tahun.setBounds(350, 160, 90, 20);
        this.add(tahun);

        klinik = new JLabel();
        klinik.setText("Nama Klinik");
        klinik.setBounds(50, 190, 100, 20);
        this.add(klinik);
        
        namaKlinik = new JTextField();
        namaKlinik.setBounds(150, 190, 200, 20);
        this.add(namaKlinik);

        tambahButton = new JButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(250, 270, 80, 30);
        this.add(tambahButton);

        noRMText.addActionListener(this);
        namaText.addActionListener(this);
        alamatText.addActionListener(this);
        tambahButton.addActionListener(this);
        namaKlinik.addActionListener(this);
        tanggal.addActionListener(this);
        bulan.addActionListener(this);
        tahun.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noRMText) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            if (cari != null) {
                namaText.setText(cari.getNama());
                alamatText.setText(cari.getAlamat());
            }
        }
        if (ae.getSource() == tambahButton) {
            JOptionPane.showMessageDialog(null, "Antrian Ditambahkan");
        }
    }
}
