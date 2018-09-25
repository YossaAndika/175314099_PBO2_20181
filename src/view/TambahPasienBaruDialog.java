/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Pasien;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author windows10
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener{
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JLabel tanggalalhirLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;
     private String tgl[] = {"Tanggal","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
    ,"21","22","23","24","25","26","27","28","29","30","31"};
    private String bln[]={"Bulan","1","2","3","4","5","6","7","8","9","10","11","12"};
    private String thn[]={"Tahun","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007"
    ,"2008","2009","2010","2011","2012","2013"
    ,"2014","2015","2016","2017","2018"};
    
    /***
     * digunakan untuk membuat object
     */
    public TambahPasienBaruDialog(){
        init();
    }
    
    /***
     * digunakan untuk membuat object dengan variabel title bertipe String
     * @param title 
     */
    public TambahPasienBaruDialog(String title){
        this.setTitle(title);
        init();
    }
    
    /***
     * digunakan untuk membuat tampilan
     */
    public void init(){
        this.setLayout(null);//set layout null
        
        judulLabel = new JLabel();//object judulLabel bertipe JLabel
        judulLabel.setText("Form Pasien Baru");
        judulLabel.setFont(new Font(null, Font.BOLD, 16));//mengatur font
        setBounds(70, 20, 150, 10);//mengatur tata letak
        this.add(judulLabel);
        
        namaLabel = new JLabel();//object namaLabel bertipe JLabel
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 90, 80, 20);//mengatur tata letak
        this.add(namaLabel);

        namaText = new JTextField();//object namaLabel bertipe JTextField
        namaText.setBounds(130, 90, 120, 20);//mengatur tata letak
        this.add(namaText);

        lakiRadio = new JRadioButton("Laki-laki");//object lakiRadio bertipe JRadioButton
        lakiRadio.setBounds(130, 120, 80, 20);//mengatur tata letak
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");//object perempuanRadio bertipe JRadioButton
        perempuanRadio.setBounds(220, 120, 100, 20);//mengatur tata letak
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();//object kelaminButtonGroup bertipe ButtonGroup
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);
        /*memasukan lakiRadio dan perempuanRadio ke KelaminButtonGroup*/

        tanggalalhirLabel = new JLabel("Tgl Lahir");//object tanggallahirLabel bertipe JLabel
        tanggalalhirLabel.setBounds(50, 150, 80, 20);//mengatur tata letak
        this.add(tanggalalhirLabel);

        tanggalCombo = new JComboBox(tgl);//object tanggalCombo bertipe JComboBox
        tanggalCombo.setBounds(130, 150, 80, 20);//mengatur tata letak
        this.add(tanggalCombo);

        bulanCombo = new JComboBox(bln);//object bulanCombo bertipe JComboBox
        bulanCombo.setBounds(230, 150, 80, 20);//mengatur tata letak
        this.add(bulanCombo);

        tahunCombo = new JComboBox(thn);//object tahunCombo bertipe JComboBox
        tahunCombo.setBounds(330, 150, 80, 20);//mengatur tata letak
        this.add(tahunCombo);

        alamatLabel = new JLabel();//object alamtLabel bertipe JLabel
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 180, 80, 20);//mengatur tata letak
        this.add(alamatLabel);

        alamatText = new JTextField();//object alamatText bertipe JTextField
        alamatText.setBounds(130, 180, 120, 20);//mengatur tata letak
        this.add(alamatText);

        nikLabel = new JLabel();//object nikLabel bertipe JLabel
        nikLabel.setText("NIK");
        nikLabel.setBounds(50, 210, 80, 20);//mengatur tata letak
        this.add(nikLabel);

        nikText = new JTextField();//object nikText bertipe JTextField
        nikText.setBounds(130, 210, 120, 20);//mengatur tata letak
        this.add(nikText);

        tambahButton = new JButton();//object tambahButton bertipe JButton
        tambahButton.setText("Tambah");
        tambahButton.setBounds(130, 240, 80, 30);//mengatur tata letak
        this.add(tambahButton);

        tambahButton.addActionListener(this);

}
    

    /***
     * digunakan untuk pengoprasian tiap object
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
 if (e.getSource() == tambahButton) {//pembanding jika yang diklik tambahButton
            Pasien baru = new Pasien();
                baru.setNama(namaText.getText());
                baru.setAlamat(alamatText.getText());
                baru.setRekamMedis(nikText.getText());
                baru.setNik(nikText.getText());
                int tanggal = Integer.valueOf(this.tanggalCombo.getSelectedItem().toString());
                int bulan = Integer.valueOf(this.bulanCombo.getSelectedItem().toString());
                int tahun = Integer.valueOf(this.tahunCombo.getSelectedItem().toString());
                baru.setTanggalLahir(tanggal);
                baru.setbulanLahir(bulan);
                baru.settahunLahir(tahun);
                Pasien.tambahPasienBaru(baru);
                JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
                this.dispose();
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
}

}
