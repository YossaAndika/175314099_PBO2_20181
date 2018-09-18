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
    
    /***
     * digunakan untuk membuat object
     */
    public TambahAntrianDialog() {
        init();//konstruktor memanggil init()
    }

    /***
     * digunakan untuk membuat object dengan variabel title bertipe String
     * @param title 
     */
    public TambahAntrianDialog(String title) {
        this.setTitle(title);//set title dengan variabel lokal title
        init();//konstruktor memanggil init()
    }

    /***
     * digunakan untuk membuat tampilan
     */
    public void init() {
        this.setLayout(null);//set layout null

        judulLabel = new JLabel();//object judulLabel bertipe JLabel
        judulLabel.setText("Form Daftar Antrian");//set text utk judulLabel
        judulLabel.setFont(new Font(null, Font.BOLD, 16));//mangatur font
        judulLabel.setBounds(50, 20, 250, 30);//mengatur tata letak judulLabel
        this.add(judulLabel);//menambahkan ke TambahAntrianDialog

        noRMLabel = new JLabel();//object noRMLabel bertipe JLabel
        noRMLabel.setText("No. RM");//set text utk noRMLabel
        noRMLabel.setBounds(50, 70, 80, 20);//mengatur tata letak
        this.add(noRMLabel);//menambahkan ke TambahAntrianDialog

        noRMText = new JTextField();//object noRMText bertipe JLabel
        noRMText.setBounds(150, 70, 120, 20);//mengatur tata letak judulLabel
        this.add(noRMText);//menambahkan ke TambahAntrianDialog

        namaLabel = new JLabel();//object namaLabel bertipe JLabel
        namaLabel.setText("Nama");//set text utk namaLabel
        namaLabel.setBounds(50, 100, 80, 20);//mengatur tata letak judulLabel
        this.add(namaLabel);//menambahkan ke TambahAntrianDialog

        namaText = new JTextField();//object namaText bertipe JLabel
        namaText.setBounds(150, 100, 120, 20);//mengatur tata letak judulLabel
        this.add(namaText);//menambahkan ke TambahAntrianDialog

        alamatLabel = new JLabel();//object alamatLabel bertipe JLabel
        alamatLabel.setText("Alamat");//set text utk alamatLabel
        alamatLabel.setBounds(50, 130, 80, 20);//mengatur tata letak judulLabel
        this.add(alamatLabel);//menambahkan ke TambahAntrianDialog

        alamatText = new JTextField();//object alamatText bertipe JLabel
        alamatText.setBounds(150, 130, 120, 20);//mengatur tata letak judulLabel
        this.add(alamatText);//menambahkan ke TambahAntrianDialog
        
        tanggalAntri = new JLabel("Tanggal Antri");
        tanggalAntri.setBounds(50, 160, 95, 20);//mengatur tata letak judulLabel
        this.add(tanggalAntri);//menambahkan ke TambahAntrianDialog
        
        tanggal = new JComboBox(tgl);
        tanggal.setBounds(150, 160, 90, 20);//mengatur tata letak judulLabel
        this.add(tanggal);//menambahkan ke TambahAntrianDialog
        
        bulan = new JComboBox(bln);
        bulan.setBounds(250, 160, 90, 20);//mengatur tata letak judulLabel
        this.add(bulan);//menambahkan ke TambahAntrianDialog
        
        tahun = new JComboBox(thn);
        tahun.setBounds(350, 160, 90, 20);//mengatur tata letak judulLabel
        this.add(tahun);//menambahkan ke TambahAntrianDialog

        klinik = new JLabel();
        klinik.setText("Nama Klinik");
        klinik.setBounds(50, 190, 100, 20);//mengatur tata letak judulLabel
        this.add(klinik);//menambahkan ke TambahAntrianDialog
        
        namaKlinik = new JTextField();
        namaKlinik.setBounds(150, 190, 200, 20);//mengatur tata letak judulLabel
        this.add(namaKlinik);//menambahkan ke TambahAntrianDialog

        tambahButton = new JButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(250, 270, 80, 30);//mengatur tata letak judulLabel
        this.add(tambahButton);//menambahkan ke TambahAntrianDialog

        noRMText.addActionListener(this);
        namaText.addActionListener(this);
        alamatText.addActionListener(this);
        tambahButton.addActionListener(this);
        namaKlinik.addActionListener(this);
        tanggal.addActionListener(this);
        bulan.addActionListener(this);
        tahun.addActionListener(this);
        /*memanggil addActionListener*/

    }

    /***
     * digunakan untuk pengoprasian tiap object
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noRMText) {//pembanding jika yang di klik noRMText
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            if (cari != null) {//pembanding jika variabel cari tidak sama null
                namaText.setText(cari.getNama());
                alamatText.setText(cari.getAlamat());
            }
        }
        if (ae.getSource() == tambahButton) {//pembanding jika yang di klik tambahButton
            JOptionPane.showMessageDialog(null, "Antrian Ditambahkan");
        }
    }
}
